package com.furo.baseperson;

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
 * People / persons are important to us, they should do the work for us.
 * 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: person/personservice.proto")
public final class PersonsGrpc {

  private PersonsGrpc() {}

  public static final String SERVICE_NAME = "person.Persons";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreatePersonMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseperson.CreatePersonRequest,
      pro.furo.signatures.EmptyEntity> METHOD_CREATE_PERSON = getCreatePersonMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseperson.CreatePersonRequest,
      pro.furo.signatures.EmptyEntity> getCreatePersonMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseperson.CreatePersonRequest,
      pro.furo.signatures.EmptyEntity> getCreatePersonMethod() {
    return getCreatePersonMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseperson.CreatePersonRequest,
      pro.furo.signatures.EmptyEntity> getCreatePersonMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseperson.CreatePersonRequest, pro.furo.signatures.EmptyEntity> getCreatePersonMethod;
    if ((getCreatePersonMethod = PersonsGrpc.getCreatePersonMethod) == null) {
      synchronized (PersonsGrpc.class) {
        if ((getCreatePersonMethod = PersonsGrpc.getCreatePersonMethod) == null) {
          PersonsGrpc.getCreatePersonMethod = getCreatePersonMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseperson.CreatePersonRequest, pro.furo.signatures.EmptyEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "person.Persons", "CreatePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.CreatePersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.furo.signatures.EmptyEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonsMethodDescriptorSupplier("CreatePerson"))
                  .build();
          }
        }
     }
     return getCreatePersonMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeletePersonMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseperson.DeletePersonRequest,
      com.google.protobuf.Empty> METHOD_DELETE_PERSON = getDeletePersonMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseperson.DeletePersonRequest,
      com.google.protobuf.Empty> getDeletePersonMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseperson.DeletePersonRequest,
      com.google.protobuf.Empty> getDeletePersonMethod() {
    return getDeletePersonMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseperson.DeletePersonRequest,
      com.google.protobuf.Empty> getDeletePersonMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseperson.DeletePersonRequest, com.google.protobuf.Empty> getDeletePersonMethod;
    if ((getDeletePersonMethod = PersonsGrpc.getDeletePersonMethod) == null) {
      synchronized (PersonsGrpc.class) {
        if ((getDeletePersonMethod = PersonsGrpc.getDeletePersonMethod) == null) {
          PersonsGrpc.getDeletePersonMethod = getDeletePersonMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseperson.DeletePersonRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "person.Persons", "DeletePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.DeletePersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonsMethodDescriptorSupplier("DeletePerson"))
                  .build();
          }
        }
     }
     return getDeletePersonMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFirePersonMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseperson.FirePersonRequest,
      com.google.protobuf.Empty> METHOD_FIRE_PERSON = getFirePersonMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseperson.FirePersonRequest,
      com.google.protobuf.Empty> getFirePersonMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseperson.FirePersonRequest,
      com.google.protobuf.Empty> getFirePersonMethod() {
    return getFirePersonMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseperson.FirePersonRequest,
      com.google.protobuf.Empty> getFirePersonMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseperson.FirePersonRequest, com.google.protobuf.Empty> getFirePersonMethod;
    if ((getFirePersonMethod = PersonsGrpc.getFirePersonMethod) == null) {
      synchronized (PersonsGrpc.class) {
        if ((getFirePersonMethod = PersonsGrpc.getFirePersonMethod) == null) {
          PersonsGrpc.getFirePersonMethod = getFirePersonMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseperson.FirePersonRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "person.Persons", "FirePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.FirePersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonsMethodDescriptorSupplier("FirePerson"))
                  .build();
          }
        }
     }
     return getFirePersonMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPersonMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseperson.GetPersonRequest,
      com.furo.baseperson.PersonEntity> METHOD_GET_PERSON = getGetPersonMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseperson.GetPersonRequest,
      com.furo.baseperson.PersonEntity> getGetPersonMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseperson.GetPersonRequest,
      com.furo.baseperson.PersonEntity> getGetPersonMethod() {
    return getGetPersonMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseperson.GetPersonRequest,
      com.furo.baseperson.PersonEntity> getGetPersonMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseperson.GetPersonRequest, com.furo.baseperson.PersonEntity> getGetPersonMethod;
    if ((getGetPersonMethod = PersonsGrpc.getGetPersonMethod) == null) {
      synchronized (PersonsGrpc.class) {
        if ((getGetPersonMethod = PersonsGrpc.getGetPersonMethod) == null) {
          PersonsGrpc.getGetPersonMethod = getGetPersonMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseperson.GetPersonRequest, com.furo.baseperson.PersonEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "person.Persons", "GetPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.GetPersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.PersonEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonsMethodDescriptorSupplier("GetPerson"))
                  .build();
          }
        }
     }
     return getGetPersonMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPersonsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseperson.ListPersonsRequest,
      com.furo.baseperson.PersonCollection> METHOD_LIST_PERSONS = getListPersonsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseperson.ListPersonsRequest,
      com.furo.baseperson.PersonCollection> getListPersonsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseperson.ListPersonsRequest,
      com.furo.baseperson.PersonCollection> getListPersonsMethod() {
    return getListPersonsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseperson.ListPersonsRequest,
      com.furo.baseperson.PersonCollection> getListPersonsMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseperson.ListPersonsRequest, com.furo.baseperson.PersonCollection> getListPersonsMethod;
    if ((getListPersonsMethod = PersonsGrpc.getListPersonsMethod) == null) {
      synchronized (PersonsGrpc.class) {
        if ((getListPersonsMethod = PersonsGrpc.getListPersonsMethod) == null) {
          PersonsGrpc.getListPersonsMethod = getListPersonsMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseperson.ListPersonsRequest, com.furo.baseperson.PersonCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "person.Persons", "ListPersons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.ListPersonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.PersonCollection.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonsMethodDescriptorSupplier("ListPersons"))
                  .build();
          }
        }
     }
     return getListPersonsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdatePersonMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.furo.baseperson.UpdatePersonRequest,
      com.furo.baseperson.PersonEntity> METHOD_UPDATE_PERSON = getUpdatePersonMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.furo.baseperson.UpdatePersonRequest,
      com.furo.baseperson.PersonEntity> getUpdatePersonMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.furo.baseperson.UpdatePersonRequest,
      com.furo.baseperson.PersonEntity> getUpdatePersonMethod() {
    return getUpdatePersonMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.furo.baseperson.UpdatePersonRequest,
      com.furo.baseperson.PersonEntity> getUpdatePersonMethodHelper() {
    io.grpc.MethodDescriptor<com.furo.baseperson.UpdatePersonRequest, com.furo.baseperson.PersonEntity> getUpdatePersonMethod;
    if ((getUpdatePersonMethod = PersonsGrpc.getUpdatePersonMethod) == null) {
      synchronized (PersonsGrpc.class) {
        if ((getUpdatePersonMethod = PersonsGrpc.getUpdatePersonMethod) == null) {
          PersonsGrpc.getUpdatePersonMethod = getUpdatePersonMethod = 
              io.grpc.MethodDescriptor.<com.furo.baseperson.UpdatePersonRequest, com.furo.baseperson.PersonEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "person.Persons", "UpdatePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.UpdatePersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.furo.baseperson.PersonEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonsMethodDescriptorSupplier("UpdatePerson"))
                  .build();
          }
        }
     }
     return getUpdatePersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonsStub newStub(io.grpc.Channel channel) {
    return new PersonsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonsFutureStub(channel);
  }

  /**
   * <pre>
   * People / persons are important to us, they should do the work for us.
   * 
   * </pre>
   */
  public static abstract class PersonsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Use this to create new persons.
     * </pre>
     */
    public void createPerson(com.furo.baseperson.CreatePersonRequest request,
        io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePersonMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * We use this to disable a person in the list, we do not delete them.
     * </pre>
     */
    public void deletePerson(com.furo.baseperson.DeletePersonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePersonMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Fireing some persons can increase the performance of the other persons POST. Do not use this to much.
     * </pre>
     */
    public void firePerson(com.furo.baseperson.FirePersonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getFirePersonMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single person.
     * </pre>
     */
    public void getPerson(com.furo.baseperson.GetPersonRequest request,
        io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * List persons with pagination.
     * </pre>
     */
    public void listPersons(com.furo.baseperson.ListPersonsRequest request,
        io.grpc.stub.StreamObserver<com.furo.baseperson.PersonCollection> responseObserver) {
      asyncUnimplementedUnaryCall(getListPersonsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Use this to update existing persons. PATCH is also supported
     * </pre>
     */
    public void updatePerson(com.furo.baseperson.UpdatePersonRequest request,
        io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePersonMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePersonMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseperson.CreatePersonRequest,
                pro.furo.signatures.EmptyEntity>(
                  this, METHODID_CREATE_PERSON)))
          .addMethod(
            getDeletePersonMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseperson.DeletePersonRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PERSON)))
          .addMethod(
            getFirePersonMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseperson.FirePersonRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_FIRE_PERSON)))
          .addMethod(
            getGetPersonMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseperson.GetPersonRequest,
                com.furo.baseperson.PersonEntity>(
                  this, METHODID_GET_PERSON)))
          .addMethod(
            getListPersonsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseperson.ListPersonsRequest,
                com.furo.baseperson.PersonCollection>(
                  this, METHODID_LIST_PERSONS)))
          .addMethod(
            getUpdatePersonMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.furo.baseperson.UpdatePersonRequest,
                com.furo.baseperson.PersonEntity>(
                  this, METHODID_UPDATE_PERSON)))
          .build();
    }
  }

  /**
   * <pre>
   * People / persons are important to us, they should do the work for us.
   * 
   * </pre>
   */
  public static final class PersonsStub extends io.grpc.stub.AbstractStub<PersonsStub> {
    private PersonsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use this to create new persons.
     * </pre>
     */
    public void createPerson(com.furo.baseperson.CreatePersonRequest request,
        io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePersonMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * We use this to disable a person in the list, we do not delete them.
     * </pre>
     */
    public void deletePerson(com.furo.baseperson.DeletePersonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePersonMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fireing some persons can increase the performance of the other persons POST. Do not use this to much.
     * </pre>
     */
    public void firePerson(com.furo.baseperson.FirePersonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFirePersonMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single person.
     * </pre>
     */
    public void getPerson(com.furo.baseperson.GetPersonRequest request,
        io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List persons with pagination.
     * </pre>
     */
    public void listPersons(com.furo.baseperson.ListPersonsRequest request,
        io.grpc.stub.StreamObserver<com.furo.baseperson.PersonCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPersonsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Use this to update existing persons. PATCH is also supported
     * </pre>
     */
    public void updatePerson(com.furo.baseperson.UpdatePersonRequest request,
        io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePersonMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * People / persons are important to us, they should do the work for us.
   * 
   * </pre>
   */
  public static final class PersonsBlockingStub extends io.grpc.stub.AbstractStub<PersonsBlockingStub> {
    private PersonsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use this to create new persons.
     * </pre>
     */
    public pro.furo.signatures.EmptyEntity createPerson(com.furo.baseperson.CreatePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePersonMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * We use this to disable a person in the list, we do not delete them.
     * </pre>
     */
    public com.google.protobuf.Empty deletePerson(com.furo.baseperson.DeletePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePersonMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fireing some persons can increase the performance of the other persons POST. Do not use this to much.
     * </pre>
     */
    public com.google.protobuf.Empty firePerson(com.furo.baseperson.FirePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getFirePersonMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single person.
     * </pre>
     */
    public com.furo.baseperson.PersonEntity getPerson(com.furo.baseperson.GetPersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List persons with pagination.
     * </pre>
     */
    public com.furo.baseperson.PersonCollection listPersons(com.furo.baseperson.ListPersonsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPersonsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Use this to update existing persons. PATCH is also supported
     * </pre>
     */
    public com.furo.baseperson.PersonEntity updatePerson(com.furo.baseperson.UpdatePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePersonMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * People / persons are important to us, they should do the work for us.
   * 
   * </pre>
   */
  public static final class PersonsFutureStub extends io.grpc.stub.AbstractStub<PersonsFutureStub> {
    private PersonsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use this to create new persons.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.furo.signatures.EmptyEntity> createPerson(
        com.furo.baseperson.CreatePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePersonMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * We use this to disable a person in the list, we do not delete them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePerson(
        com.furo.baseperson.DeletePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePersonMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fireing some persons can increase the performance of the other persons POST. Do not use this to much.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> firePerson(
        com.furo.baseperson.FirePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFirePersonMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single person.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.furo.baseperson.PersonEntity> getPerson(
        com.furo.baseperson.GetPersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List persons with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.furo.baseperson.PersonCollection> listPersons(
        com.furo.baseperson.ListPersonsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPersonsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Use this to update existing persons. PATCH is also supported
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.furo.baseperson.PersonEntity> updatePerson(
        com.furo.baseperson.UpdatePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePersonMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PERSON = 0;
  private static final int METHODID_DELETE_PERSON = 1;
  private static final int METHODID_FIRE_PERSON = 2;
  private static final int METHODID_GET_PERSON = 3;
  private static final int METHODID_LIST_PERSONS = 4;
  private static final int METHODID_UPDATE_PERSON = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((com.furo.baseperson.CreatePersonRequest) request,
              (io.grpc.stub.StreamObserver<pro.furo.signatures.EmptyEntity>) responseObserver);
          break;
        case METHODID_DELETE_PERSON:
          serviceImpl.deletePerson((com.furo.baseperson.DeletePersonRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FIRE_PERSON:
          serviceImpl.firePerson((com.furo.baseperson.FirePersonRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PERSON:
          serviceImpl.getPerson((com.furo.baseperson.GetPersonRequest) request,
              (io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity>) responseObserver);
          break;
        case METHODID_LIST_PERSONS:
          serviceImpl.listPersons((com.furo.baseperson.ListPersonsRequest) request,
              (io.grpc.stub.StreamObserver<com.furo.baseperson.PersonCollection>) responseObserver);
          break;
        case METHODID_UPDATE_PERSON:
          serviceImpl.updatePerson((com.furo.baseperson.UpdatePersonRequest) request,
              (io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity>) responseObserver);
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

  private static abstract class PersonsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.furo.baseperson.PersonserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Persons");
    }
  }

  private static final class PersonsFileDescriptorSupplier
      extends PersonsBaseDescriptorSupplier {
    PersonsFileDescriptorSupplier() {}
  }

  private static final class PersonsMethodDescriptorSupplier
      extends PersonsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonsMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonsFileDescriptorSupplier())
              .addMethod(getCreatePersonMethodHelper())
              .addMethod(getDeletePersonMethodHelper())
              .addMethod(getFirePersonMethodHelper())
              .addMethod(getGetPersonMethodHelper())
              .addMethod(getListPersonsMethodHelper())
              .addMethod(getUpdatePersonMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
