package com.adcubum.bff;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.logging.Logger;

import pro.furo.todo.TasksGrpc;

public class BffServer {

    private static final Logger logger = Logger.getLogger(BffServer.class.getName());

    private int port = 7777;
    private Server server;

    private void start() throws Exception {
        logger.info("Starting the grpc server");

        server = ServerBuilder.forPort(port)
                .addService(new TasksImpl())
                .build()
                .start();

        logger.info("Server started. Listening on port " + port);

    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public static void main(String[] args) throws Exception {
        logger.info("Server startup. Args = " + Arrays.toString(args));
        final BffServer BffServer = new BffServer();

        BffServer.start();
        BffServer.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
      
    private class TasksImpl extends TasksGrpc.TasksImplBase {
        
        @Override
        public void createTask(   pro.furo.todo.CreateTaskRequest request,      
                                  io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity> responseObserver) {  
                             
            pro.furo.signatures.EmptyEntity res = pro.furo.signatures.EmptyEntity.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
        @Override
        public void deleteTask(   pro.furo.todo.DeleteTaskRequest request,     
                                  io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
                             
            com.google.protobuf.Empty res = com.google.protobuf.Empty.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
        @Override
        public void deleteAllTaskss(   pro.furo.todo.DeleteAllTaskssRequest request,
                                  io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
                             
            com.google.protobuf.Empty res = com.google.protobuf.Empty.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
        @Override
        public void getTask(   pro.furo.todo.GetTaskRequest request,      
                                  io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity> responseObserver) {

            pro.furo.todo.TaskEntity res = pro.furo.todo.TaskEntity.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
        @Override
        public void listTasks(   pro.furo.todo.ListTasksRequest request,
                                  io.grpc.stub.StreamObserver<pro.furo.todo.TaskCollection> responseObserver) {

            pro.furo.todo.TaskCollection res = pro.furo.todo.TaskCollection.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
        @Override
        public void suspendTask(   pro.furo.todo.SuspendTaskRequest request,     
                                  io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
                             
            com.google.protobuf.Empty res = com.google.protobuf.Empty.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
        @Override
        public void updateTask(   pro.furo.todo.UpdateTaskRequest request,      
                                  io.grpc.stub.StreamObserver<pro.furo.todo.TaskEntity> responseObserver) {

            pro.furo.todo.TaskEntity res = pro.furo.todo.TaskEntity.newBuilder().build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
    }
}
