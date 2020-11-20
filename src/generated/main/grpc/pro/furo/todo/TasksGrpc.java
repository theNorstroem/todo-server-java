package pro.furo.todo;

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
 * Doing nothing is very hard to do… you never know when you’re finished.
 * Having some tasks can help you a lot by giving you that comfortable feeling that you
 * did something.
 * 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: task/taskservice.proto")
public final class TasksGrpc {

  private TasksGrpc() {}

  public static final String SERVICE_NAME = "task.Tasks";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateTaskMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.CreateTaskRequest,
      pro.furo.signatures.EmptyEntity> METHOD_CREATE_TASK = getCreateTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.CreateTaskRequest,
      pro.furo.signatures.EmptyEntity> getCreateTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.CreateTaskRequest,
      pro.furo.signatures.EmptyEntity> getCreateTaskMethod() {
    return getCreateTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.CreateTaskRequest,
      pro.furo.signatures.EmptyEntity> getCreateTaskMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.CreateTaskRequest, pro.furo.signatures.EmptyEntity> getCreateTaskMethod;
    if ((getCreateTaskMethod = TasksGrpc.getCreateTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getCreateTaskMethod = TasksGrpc.getCreateTaskMethod) == null) {
          TasksGrpc.getCreateTaskMethod = getCreateTaskMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.CreateTaskRequest, pro.furo.signatures.EmptyEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.signatures.EmptyEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("CreateTask"))
                  .build();
          }
        }
     }
     return getCreateTaskMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteTaskMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.DeleteTaskRequest,
      com.google.protobuf.Empty> METHOD_DELETE_TASK = getDeleteTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.DeleteTaskRequest,
      com.google.protobuf.Empty> getDeleteTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.DeleteTaskRequest,
      com.google.protobuf.Empty> getDeleteTaskMethod() {
    return getDeleteTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.DeleteTaskRequest,
      com.google.protobuf.Empty> getDeleteTaskMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.DeleteTaskRequest, com.google.protobuf.Empty> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = TasksGrpc.getDeleteTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getDeleteTaskMethod = TasksGrpc.getDeleteTaskMethod) == null) {
          TasksGrpc.getDeleteTaskMethod = getDeleteTaskMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.DeleteTaskRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.DeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("DeleteTask"))
                  .build();
          }
        }
     }
     return getDeleteTaskMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAllTaskssMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.DeleteAllTaskssRequest,
      com.google.protobuf.Empty> METHOD_DELETE_ALL_TASKSS = getDeleteAllTaskssMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.DeleteAllTaskssRequest,
      com.google.protobuf.Empty> getDeleteAllTaskssMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.DeleteAllTaskssRequest,
      com.google.protobuf.Empty> getDeleteAllTaskssMethod() {
    return getDeleteAllTaskssMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.DeleteAllTaskssRequest,
      com.google.protobuf.Empty> getDeleteAllTaskssMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.DeleteAllTaskssRequest, com.google.protobuf.Empty> getDeleteAllTaskssMethod;
    if ((getDeleteAllTaskssMethod = TasksGrpc.getDeleteAllTaskssMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getDeleteAllTaskssMethod = TasksGrpc.getDeleteAllTaskssMethod) == null) {
          TasksGrpc.getDeleteAllTaskssMethod = getDeleteAllTaskssMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.DeleteAllTaskssRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "DeleteAllTaskss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.DeleteAllTaskssRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("DeleteAllTaskss"))
                  .build();
          }
        }
     }
     return getDeleteAllTaskssMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTaskMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.GetTaskRequest,
      pro.furo.todo.TaskEntity> METHOD_GET_TASK = getGetTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.GetTaskRequest,
      pro.furo.todo.TaskEntity> getGetTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.GetTaskRequest,
      pro.furo.todo.TaskEntity> getGetTaskMethod() {
    return getGetTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.GetTaskRequest,
      pro.furo.todo.TaskEntity> getGetTaskMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.GetTaskRequest, pro.furo.todo.TaskEntity> getGetTaskMethod;
    if ((getGetTaskMethod = TasksGrpc.getGetTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getGetTaskMethod = TasksGrpc.getGetTaskMethod) == null) {
          TasksGrpc.getGetTaskMethod = getGetTaskMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.GetTaskRequest, pro.furo.todo.TaskEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.TaskEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("GetTask"))
                  .build();
          }
        }
     }
     return getGetTaskMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListTasksMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.ListTasksRequest,
      pro.furo.todo.TaskCollection> METHOD_LIST_TASKS = getListTasksMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.ListTasksRequest,
      pro.furo.todo.TaskCollection> getListTasksMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.ListTasksRequest,
      pro.furo.todo.TaskCollection> getListTasksMethod() {
    return getListTasksMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.ListTasksRequest,
      pro.furo.todo.TaskCollection> getListTasksMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.ListTasksRequest, pro.furo.todo.TaskCollection> getListTasksMethod;
    if ((getListTasksMethod = TasksGrpc.getListTasksMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getListTasksMethod = TasksGrpc.getListTasksMethod) == null) {
          TasksGrpc.getListTasksMethod = getListTasksMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.ListTasksRequest, pro.furo.todo.TaskCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "ListTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.ListTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.TaskCollection.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("ListTasks"))
                  .build();
          }
        }
     }
     return getListTasksMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSuspendTaskMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.SuspendTaskRequest,
      com.google.protobuf.Empty> METHOD_SUSPEND_TASK = getSuspendTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.SuspendTaskRequest,
      com.google.protobuf.Empty> getSuspendTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.SuspendTaskRequest,
      com.google.protobuf.Empty> getSuspendTaskMethod() {
    return getSuspendTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.SuspendTaskRequest,
      com.google.protobuf.Empty> getSuspendTaskMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.SuspendTaskRequest, com.google.protobuf.Empty> getSuspendTaskMethod;
    if ((getSuspendTaskMethod = TasksGrpc.getSuspendTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getSuspendTaskMethod = TasksGrpc.getSuspendTaskMethod) == null) {
          TasksGrpc.getSuspendTaskMethod = getSuspendTaskMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.SuspendTaskRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "SuspendTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.SuspendTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("SuspendTask"))
                  .build();
          }
        }
     }
     return getSuspendTaskMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateTaskMethod()} instead. 
  public static final io.grpc.MethodDescriptor<pro.furo.todo.UpdateTaskRequest,
      pro.furo.todo.TaskEntity> METHOD_UPDATE_TASK = getUpdateTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<pro.furo.todo.UpdateTaskRequest,
      pro.furo.todo.TaskEntity> getUpdateTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<pro.furo.todo.UpdateTaskRequest,
      pro.furo.todo.TaskEntity> getUpdateTaskMethod() {
    return getUpdateTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<pro.furo.todo.UpdateTaskRequest,
      pro.furo.todo.TaskEntity> getUpdateTaskMethodHelper() {
    io.grpc.MethodDescriptor<pro.furo.todo.UpdateTaskRequest, pro.furo.todo.TaskEntity> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = TasksGrpc.getUpdateTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getUpdateTaskMethod = TasksGrpc.getUpdateTaskMethod) == null) {
          TasksGrpc.getUpdateTaskMethod = getUpdateTaskMethod = 
              io.grpc.MethodDescriptor.<pro.furo.todo.UpdateTaskRequest, pro.furo.todo.TaskEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "task.Tasks", "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.todo.TaskEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new TasksMethodDescriptorSupplier("UpdateTask"))
                  .build();
          }
        }
     }
     return getUpdateTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TasksStub newStub(io.grpc.Channel channel) {
    return new TasksStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TasksBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TasksBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TasksFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TasksFutureStub(channel);
  }

  /**
   * <pre>
   * Doing nothing is very hard to do… you never know when you’re finished.
   * Having some tasks can help you a lot by giving you that comfortable feeling that you
   * did something.
   * 
   * </pre>
   */
  public static abstract class TasksImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Use this to create new tasks.
     * </pre>
     */
    public void createTask(pro.furo.todo.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTaskMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Use this to delete existing tasks.
     * </pre>
     */
    public void deleteTask(pro.furo.todo.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Use this to delete ALL tasks.
     * </pre>
     */
    public void deleteAllTaskss(pro.furo.todo.DeleteAllTaskssRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAllTaskssMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single task.
     * </pre>
     */
    public void getTask(pro.furo.todo.GetTaskRequest request,
        io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * List tasks with pagination.
     * </pre>
     */
    public void listTasks(pro.furo.todo.ListTasksRequest request,
        io.grpc.stub.StreamObserver<pro.furo.todo.TaskCollection> responseObserver) {
      asyncUnimplementedUnaryCall(getListTasksMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Custom methods are always POST.
     * </pre>
     */
    public void suspendTask(pro.furo.todo.SuspendTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSuspendTaskMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Use this to update existing tasks. PATCH is also supported
     * </pre>
     */
    public void updateTask(pro.furo.todo.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTaskMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.CreateTaskRequest,
                pro.furo.signatures.EmptyEntity>(
                  this, METHODID_CREATE_TASK)))
          .addMethod(
            getDeleteTaskMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.DeleteTaskRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TASK)))
          .addMethod(
            getDeleteAllTaskssMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.DeleteAllTaskssRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ALL_TASKSS)))
          .addMethod(
            getGetTaskMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.GetTaskRequest,
                pro.furo.todo.TaskEntity>(
                  this, METHODID_GET_TASK)))
          .addMethod(
            getListTasksMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.ListTasksRequest,
                pro.furo.todo.TaskCollection>(
                  this, METHODID_LIST_TASKS)))
          .addMethod(
            getSuspendTaskMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.SuspendTaskRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SUSPEND_TASK)))
          .addMethod(
            getUpdateTaskMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                pro.furo.todo.UpdateTaskRequest,
                pro.furo.todo.TaskEntity>(
                  this, METHODID_UPDATE_TASK)))
          .build();
    }
  }

  /**
   * <pre>
   * Doing nothing is very hard to do… you never know when you’re finished.
   * Having some tasks can help you a lot by giving you that comfortable feeling that you
   * did something.
   * 
   * </pre>
   */
  public static final class TasksStub extends io.grpc.stub.AbstractStub<TasksStub> {
    private TasksStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TasksStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TasksStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use this to create new tasks.
     * </pre>
     */
    public void createTask(pro.furo.todo.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Use this to delete existing tasks.
     * </pre>
     */
    public void deleteTask(pro.furo.todo.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Use this to delete ALL tasks.
     * </pre>
     */
    public void deleteAllTaskss(pro.furo.todo.DeleteAllTaskssRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAllTaskssMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single task.
     * </pre>
     */
    public void getTask(pro.furo.todo.GetTaskRequest request,
        io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tasks with pagination.
     * </pre>
     */
    public void listTasks(pro.furo.todo.ListTasksRequest request,
        io.grpc.stub.StreamObserver<pro.furo.todo.TaskCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTasksMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Custom methods are always POST.
     * </pre>
     */
    public void suspendTask(pro.furo.todo.SuspendTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSuspendTaskMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Use this to update existing tasks. PATCH is also supported
     * </pre>
     */
    public void updateTask(pro.furo.todo.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Doing nothing is very hard to do… you never know when you’re finished.
   * Having some tasks can help you a lot by giving you that comfortable feeling that you
   * did something.
   * 
   * </pre>
   */
  public static final class TasksBlockingStub extends io.grpc.stub.AbstractStub<TasksBlockingStub> {
    private TasksBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TasksBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TasksBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use this to create new tasks.
     * </pre>
     */
    public pro.furo.signatures.EmptyEntity createTask(pro.furo.todo.CreateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Use this to delete existing tasks.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTask(pro.furo.todo.DeleteTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Use this to delete ALL tasks.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAllTaskss(pro.furo.todo.DeleteAllTaskssRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAllTaskssMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single task.
     * </pre>
     */
    public pro.furo.todo.TaskEntity getTask(pro.furo.todo.GetTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tasks with pagination.
     * </pre>
     */
    public pro.furo.todo.TaskCollection listTasks(pro.furo.todo.ListTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTasksMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Custom methods are always POST.
     * </pre>
     */
    public com.google.protobuf.Empty suspendTask(pro.furo.todo.SuspendTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getSuspendTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Use this to update existing tasks. PATCH is also supported
     * </pre>
     */
    public pro.furo.todo.TaskEntity updateTask(pro.furo.todo.UpdateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Doing nothing is very hard to do… you never know when you’re finished.
   * Having some tasks can help you a lot by giving you that comfortable feeling that you
   * did something.
   * 
   * </pre>
   */
  public static final class TasksFutureStub extends io.grpc.stub.AbstractStub<TasksFutureStub> {
    private TasksFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TasksFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TasksFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use this to create new tasks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.furo.signatures.EmptyEntity> createTask(
        pro.furo.todo.CreateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Use this to delete existing tasks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTask(
        pro.furo.todo.DeleteTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Use this to delete ALL tasks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAllTaskss(
        pro.furo.todo.DeleteAllTaskssRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAllTaskssMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.furo.todo.TaskEntity> getTask(
        pro.furo.todo.GetTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tasks with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.furo.todo.TaskCollection> listTasks(
        pro.furo.todo.ListTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTasksMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Custom methods are always POST.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> suspendTask(
        pro.furo.todo.SuspendTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSuspendTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Use this to update existing tasks. PATCH is also supported
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.furo.todo.TaskEntity> updateTask(
        pro.furo.todo.UpdateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_DELETE_TASK = 1;
  private static final int METHODID_DELETE_ALL_TASKSS = 2;
  private static final int METHODID_GET_TASK = 3;
  private static final int METHODID_LIST_TASKS = 4;
  private static final int METHODID_SUSPEND_TASK = 5;
  private static final int METHODID_UPDATE_TASK = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TasksImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TasksImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((pro.furo.todo.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((pro.furo.todo.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ALL_TASKSS:
          serviceImpl.deleteAllTaskss((pro.furo.todo.DeleteAllTaskssRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((pro.furo.todo.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity>) responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks((pro.furo.todo.ListTasksRequest) request,
              (io.grpc.stub.StreamObserver<pro.furo.todo.TaskCollection>) responseObserver);
          break;
        case METHODID_SUSPEND_TASK:
          serviceImpl.suspendTask((pro.furo.todo.SuspendTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((pro.furo.todo.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity>) responseObserver);
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

  private static abstract class TasksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TasksBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pro.furo.todo.TaskserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tasks");
    }
  }

  private static final class TasksFileDescriptorSupplier
      extends TasksBaseDescriptorSupplier {
    TasksFileDescriptorSupplier() {}
  }

  private static final class TasksMethodDescriptorSupplier
      extends TasksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TasksMethodDescriptorSupplier(String methodName) {
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
      synchronized (TasksGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TasksFileDescriptorSupplier())
              .addMethod(getCreateTaskMethodHelper())
              .addMethod(getDeleteTaskMethodHelper())
              .addMethod(getDeleteAllTaskssMethodHelper())
              .addMethod(getGetTaskMethodHelper())
              .addMethod(getListTasksMethodHelper())
              .addMethod(getSuspendTaskMethodHelper())
              .addMethod(getUpdateTaskMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
