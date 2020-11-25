package pro.furo.todo.impl.person;

import com.furo.baseperson.Person;
import com.furo.baseperson.PersonCollection;
import com.furo.baseperson.PersonEntity;
import pro.furo.Link;

public class PersonMock {

   public static final Person PERSON_1 = Person.newBuilder()
         .setId("1")
         .setDisplayName("Max Musterman")
         .build();

   public static final Person PERSON_2 = Person.newBuilder()
         .setId("2")
         .setDisplayName("Peter Zimmerman")
         .build();

   public static final PersonEntity PERSON_ENTITY_1 = PersonEntity.newBuilder()
         .setData(PERSON_1)
         .addLinks(Link.newBuilder().setRel("self").setHref("/api/persons/1").setMethod("get"))
         .build();

   public static final PersonEntity PERSON_ENTITY_2 = PersonEntity.newBuilder()
         .setData(PERSON_2)
         .addLinks(Link.newBuilder().setRel("self").setHref("/api/persons/2").setMethod("get"))
         .build();

   public static final PersonCollection PERSON_COLLECTION_1 = PersonCollection.newBuilder()
         .addEntities( PERSON_ENTITY_1)
         .addEntities( PERSON_ENTITY_2 ).build();
}
