package transcoder

import (
	"context"
	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"github.com/theNorstroem/todo-specs/pkg/grpc-gateway/autoregister"
	_ "google.golang.org/genproto/googleapis/rpc/errdetails"
	"google.golang.org/grpc"
	"google.golang.org/grpc/metadata"
	"google.golang.org/protobuf/encoding/protojson"
	"net/http"
)

// header für client ohne prefixes
func outgoingMatcher(headerName string) (mdName string, ok bool) {
	return headerName, true
}

// header vom client im ctx des Servers ohne prefixes senden
func incomingMatcher(headerName string) (mdName string, ok bool) {
	return headerName, true
}

// setzt die api-base-url für das backend
func addBaseUrl(ctx context.Context, request *http.Request) metadata.MD {
	return metadata.New(map[string]string{
		"api-base-url": "//" + request.Host + "/api",
	})
}

func Run(grpcBackendAddr string, transcoderAddr string) error {
	ctx := context.Background()
	ctx, cancel := context.WithCancel(ctx)
	defer cancel()

	mux := runtime.NewServeMux(
		runtime.WithOutgoingHeaderMatcher(outgoingMatcher),
		runtime.WithIncomingHeaderMatcher(incomingMatcher),
		runtime.WithMetadata(addBaseUrl),
		runtime.WithMarshalerOption(runtime.MIMEWildcard, &runtime.HTTPBodyMarshaler{
			Marshaler: &runtime.JSONPb{
				MarshalOptions: protojson.MarshalOptions{
					UseProtoNames:   true,
					EmitUnpopulated: false,
				},
				UnmarshalOptions: protojson.UnmarshalOptions{
					DiscardUnknown: true,
				},
			},
		}))

	opts := []grpc.DialOption{grpc.WithInsecure()}

	err := autoregister.RegisterAllEndpoints(grpcBackendAddr, ctx, mux, opts)
	if err != nil {
		return err
	}

	return http.ListenAndServe(transcoderAddr, mux)
}
