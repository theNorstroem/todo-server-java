package com.furo.baseauth;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Login with credentials. The service should set a auth cookie on successful login and delete it on logout
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: auth/authservice.proto")
public final class AuthSessionGrpc {

  private AuthSessionGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthSession";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateAuthSessionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseauth.CreateAuthSessionRequest,
      com.google.protobuf.Empty> METHOD_CREATE_AUTH_SESSION = getCreateAuthSessionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseauth.CreateAuthSessionRequest,
      com.google.protobuf.Empty> getCreateAuthSessionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseauth.CreateAuthSessionRequest,
      com.google.protobuf.Empty> getCreateAuthSessionMethod() {
    return getCreateAuthSessionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseauth.CreateAuthSessionRequest,
      com.google.protobuf.Empty> getCreateAuthSessionMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseauth.CreateAuthSessionRequest, com.google.protobuf.Empty> getCreateAuthSessionMethod;
    if ((getCreateAuthSessionMethod = AuthSessionGrpc.getCreateAuthSessionMethod) == null) {
      synchronized (AuthSessionGrpc.class) {
        if ((getCreateAuthSessionMethod = AuthSessionGrpc.getCreateAuthSessionMethod) == null) {
          AuthSessionGrpc.getCreateAuthSessionMethod = getCreateAuthSessionMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseauth.CreateAuthSessionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthSession", "CreateAuthSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseauth.CreateAuthSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthSessionMethodDescriptorSupplier("CreateAuthSession"))
                  .build();
          }
        }
     }
     return getCreateAuthSessionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAuthSessionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseauth.DeleteAuthSessionRequest,
      com.google.protobuf.Empty> METHOD_DELETE_AUTH_SESSION = getDeleteAuthSessionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseauth.DeleteAuthSessionRequest,
      com.google.protobuf.Empty> getDeleteAuthSessionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseauth.DeleteAuthSessionRequest,
      com.google.protobuf.Empty> getDeleteAuthSessionMethod() {
    return getDeleteAuthSessionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseauth.DeleteAuthSessionRequest,
      com.google.protobuf.Empty> getDeleteAuthSessionMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseauth.DeleteAuthSessionRequest, com.google.protobuf.Empty> getDeleteAuthSessionMethod;
    if ((getDeleteAuthSessionMethod = AuthSessionGrpc.getDeleteAuthSessionMethod) == null) {
      synchronized (AuthSessionGrpc.class) {
        if ((getDeleteAuthSessionMethod = AuthSessionGrpc.getDeleteAuthSessionMethod) == null) {
          AuthSessionGrpc.getDeleteAuthSessionMethod = getDeleteAuthSessionMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseauth.DeleteAuthSessionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthSession", "DeleteAuthSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseauth.DeleteAuthSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthSessionMethodDescriptorSupplier("DeleteAuthSession"))
                  .build();
          }
        }
     }
     return getDeleteAuthSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthSessionStub newStub(io.grpc.Channel channel) {
    return new AuthSessionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthSessionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthSessionFutureStub(channel);
  }

  /**
   * <pre>
   * Login with credentials. The service should set a auth cookie on successful login and delete it on logout
   * </pre>
   */
  public static abstract class AuthSessionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Login with credentials #A login is nothing else then creating a valid session
     * </pre>
     */
    public void createAuthSession(com.furo.baseauth.CreateAuthSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAuthSessionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Logout.
     * </pre>
     */
    public void deleteAuthSession(com.furo.baseauth.DeleteAuthSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAuthSessionMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAuthSessionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseauth.CreateAuthSessionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_AUTH_SESSION)))
          .addMethod(
            getDeleteAuthSessionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseauth.DeleteAuthSessionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_AUTH_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Login with credentials. The service should set a auth cookie on successful login and delete it on logout
   * </pre>
   */
  public static final class AuthSessionStub extends io.grpc.stub.AbstractStub<AuthSessionStub> {
    private AuthSessionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthSessionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthSessionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthSessionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Login with credentials #A login is nothing else then creating a valid session
     * </pre>
     */
    public void createAuthSession(com.furo.baseauth.CreateAuthSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAuthSessionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Logout.
     * </pre>
     */
    public void deleteAuthSession(com.furo.baseauth.DeleteAuthSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAuthSessionMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Login with credentials. The service should set a auth cookie on successful login and delete it on logout
   * </pre>
   */
  public static final class AuthSessionBlockingStub extends io.grpc.stub.AbstractStub<AuthSessionBlockingStub> {
    private AuthSessionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthSessionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthSessionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthSessionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Login with credentials #A login is nothing else then creating a valid session
     * </pre>
     */
    public com.google.protobuf.Empty createAuthSession(com.furo.baseauth.CreateAuthSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAuthSessionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Logout.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAuthSession(com.furo.baseauth.DeleteAuthSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAuthSessionMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Login with credentials. The service should set a auth cookie on successful login and delete it on logout
   * </pre>
   */
  public static final class AuthSessionFutureStub extends io.grpc.stub.AbstractStub<AuthSessionFutureStub> {
    private AuthSessionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthSessionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthSessionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthSessionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Login with credentials #A login is nothing else then creating a valid session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createAuthSession(
        com.furo.baseauth.CreateAuthSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAuthSessionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Logout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAuthSession(
        com.furo.baseauth.DeleteAuthSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAuthSessionMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AUTH_SESSION = 0;
  private static final int METHODID_DELETE_AUTH_SESSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_AUTH_SESSION:
          serviceImpl.createAuthSession((com.furo.baseauth.CreateAuthSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_SESSION:
          serviceImpl.deleteAuthSession((com.furo.baseauth.DeleteAuthSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.furo.baseauth.AuthserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthSession");
    }
  }

  private static final class AuthSessionFileDescriptorSupplier
      extends AuthSessionBaseDescriptorSupplier {
    AuthSessionFileDescriptorSupplier() {}
  }

  private static final class AuthSessionMethodDescriptorSupplier
      extends AuthSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthSessionMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthSessionFileDescriptorSupplier())
              .addMethod(getCreateAuthSessionMethodHelper())
              .addMethod(getDeleteAuthSessionMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
