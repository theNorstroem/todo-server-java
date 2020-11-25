package pro.furo.todo.impl.person;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import com.furo.baseperson.PersonCollection;
import com.furo.baseperson.PersonEntity;
import com.furo.baseperson.PersonsGrpc;

public class PersonServiceImpl extends PersonsGrpc.PersonsImplBase {

   @Override
   public void listPersons(com.furo.baseperson.ListPersonsRequest request,
         io.grpc.stub.StreamObserver<com.furo.baseperson.PersonCollection> responseObserver) {

      PersonCollection res = PersonMock.PERSON_COLLECTION_1;

      responseObserver.onNext(res);
      responseObserver.onCompleted();
   }

   @Override
   public void getPerson(com.furo.baseperson.GetPersonRequest request,
         io.grpc.stub.StreamObserver<com.furo.baseperson.PersonEntity> responseObserver) {

      PersonEntity res = PersonMock.PERSON_ENTITY_1;

      responseObserver.onNext(res);
      responseObserver.onCompleted();

   }
}
