package pro.furo.todo.impl.task;

import pro.furo.todo.CreateTaskRequest;
import pro.furo.todo.DeleteAllTaskssRequest;
import pro.furo.todo.DeleteTaskRequest;
import pro.furo.todo.GetTaskRequest;
import pro.furo.todo.ListTasksRequest;
import pro.furo.todo.SuspendTaskRequest;
import pro.furo.todo.TaskCollection;
import pro.furo.todo.TaskEntity;
import pro.furo.todo.TasksGrpc;
import pro.furo.todo.UpdateTaskRequest;

public class TaskServiceImpl extends TasksGrpc.TasksImplBase {

   @Override
   public void createTask(CreateTaskRequest request,
         io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity> responseObserver) {

      pro.furo.signatures.EmptyEntity res = pro.furo.signatures.EmptyEntity.newBuilder().build();

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void deleteTask(DeleteTaskRequest request,
         io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

      com.google.protobuf.Empty res = com.google.protobuf.Empty.newBuilder().build();

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void deleteAllTaskss(DeleteAllTaskssRequest request,
         io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

      com.google.protobuf.Empty res = com.google.protobuf.Empty.newBuilder().build();

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void getTask(GetTaskRequest request,
         io.grpc.stub.StreamObserver<TaskEntity> responseObserver) {

      TaskEntity res = TaskMock.TASK_ENTITY_1;

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void listTasks(ListTasksRequest request,
         io.grpc.stub.StreamObserver<TaskCollection> responseObserver) {

      TaskCollection res = TaskMock.TASK_COLLECTION_1;

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void suspendTask(SuspendTaskRequest request,
         io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {

      com.google.protobuf.Empty res = com.google.protobuf.Empty.newBuilder().build();

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void updateTask(UpdateTaskRequest request,
         io.grpc.stub.StreamObserver<TaskEntity> responseObserver) {

      TaskEntity res = TaskMock.TASK_ENTITY_2;

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

}
