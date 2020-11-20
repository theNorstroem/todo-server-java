package autoregister

import (
	"context"
	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	//auth.AuthSession
	authpb "github.com/theNorstroem/todo-specs/dist/pb/auth"

	//person.Persons
	personpb "github.com/theNorstroem/todo-specs/dist/pb/person"

	//task.Tasks
	taskpb "github.com/theNorstroem/todo-specs/dist/pb/task"

	"google.golang.org/grpc"
)

func RegisterAllEndpoints(grpcBackendAddr string, ctx context.Context, mux *runtime.ServeMux, opts []grpc.DialOption) error {
	var err error
	// auth.AuthSession
	err = authpb.RegisterAuthSessionHandlerFromEndpoint(ctx, mux, grpcBackendAddr, opts)
	if err != nil {
		return err
	}

	// person.Persons
	err = personpb.RegisterPersonsHandlerFromEndpoint(ctx, mux, grpcBackendAddr, opts)
	if err != nil {
		return err
	}

	// task.Tasks
	err = taskpb.RegisterTasksHandlerFromEndpoint(ctx, mux, grpcBackendAddr, opts)
	if err != nil {
		return err
	}

	//installed services
	return err
}
