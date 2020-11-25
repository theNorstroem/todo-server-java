package pro.furo.todo.impl.task;

import com.furo.baseperson.Reference;
import com.google.type.Date;
import pro.furo.Link;
import pro.furo.todo.Task;
import pro.furo.todo.TaskCollection;
import pro.furo.todo.TaskEntity;

public class TaskMock {

   public static final Task TASK_1 = Task.newBuilder()
         .setId("1")
         .setDisplayName("Task 1")
         .setNote("note for task 1")
         .addInvolvedPersons(Reference.newBuilder().setId("1").setDisplayName("Max Musterman"))
         .setDueDate(Date.newBuilder().setDay(1).setMonth(12).setYear(2020).build())
         .build();

   public static final Task TASK_2 = Task.newBuilder()
         .setId("2")
         .setDisplayName("Task 2")
         .setNote("note for task 2")
         .addInvolvedPersons(Reference.newBuilder().setId("2").setDisplayName("Peter Zimmerman"))
         .setDueDate(Date.newBuilder().setDay(2).setMonth(2).setYear(2021).build())
         .build();

   public static final TaskEntity TASK_ENTITY_1 = TaskEntity.newBuilder()
         .setData(TASK_1)
         .addLinks(Link.newBuilder().setRel("self").setHref("/api/tasks/1").setMethod("get"))
         .build();

   public static final TaskEntity TASK_ENTITY_2 = TaskEntity.newBuilder()
         .setData(TASK_2)
         .addLinks(Link.newBuilder().setRel("self").setHref("/api/tasks/2").setMethod("get"))
         .build();

   public static final TaskCollection TASK_COLLECTION_1 = TaskCollection.newBuilder()
         .addEntities( TASK_ENTITY_1)
         .addEntities( TASK_ENTITY_2 ).build();

}
