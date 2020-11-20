// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task/task.proto

package pro.furo.todo;

public interface TaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:task.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Task id (is a ULID).
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Task id (is a ULID).
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * We use this field label the task
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * We use this field label the task
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Add some notes
   * </pre>
   *
   * <code>string note = 3;</code>
   */
  java.lang.String getNote();
  /**
   * <pre>
   * Add some notes
   * </pre>
   *
   * <code>string note = 3;</code>
   */
  com.google.protobuf.ByteString
      getNoteBytes();

  /**
   * <pre>
   * The parent for this task
   * </pre>
   *
   * <code>.task.Reference parent = 4;</code>
   */
  boolean hasParent();
  /**
   * <pre>
   * The parent for this task
   * </pre>
   *
   * <code>.task.Reference parent = 4;</code>
   */
  pro.furo.todo.Reference getParent();
  /**
   * <pre>
   * The parent for this task
   * </pre>
   *
   * <code>.task.Reference parent = 4;</code>
   */
  pro.furo.todo.ReferenceOrBuilder getParentOrBuilder();

  /**
   * <pre>
   * A task can have a checklist (more work)
   * </pre>
   *
   * <code>repeated string checklist = 5;</code>
   */
  java.util.List<java.lang.String>
      getChecklistList();
  /**
   * <pre>
   * A task can have a checklist (more work)
   * </pre>
   *
   * <code>repeated string checklist = 5;</code>
   */
  int getChecklistCount();
  /**
   * <pre>
   * A task can have a checklist (more work)
   * </pre>
   *
   * <code>repeated string checklist = 5;</code>
   */
  java.lang.String getChecklist(int index);
  /**
   * <pre>
   * A task can have a checklist (more work)
   * </pre>
   *
   * <code>repeated string checklist = 5;</code>
   */
  com.google.protobuf.ByteString
      getChecklistBytes(int index);

  /**
   * <pre>
   * Use this to give pressure.
   * </pre>
   *
   * <code>.google.type.Date due_date = 6;</code>
   */
  boolean hasDueDate();
  /**
   * <pre>
   * Use this to give pressure.
   * </pre>
   *
   * <code>.google.type.Date due_date = 6;</code>
   */
  com.google.type.Date getDueDate();
  /**
   * <pre>
   * Use this to give pressure.
   * </pre>
   *
   * <code>.google.type.Date due_date = 6;</code>
   */
  com.google.type.DateOrBuilder getDueDateOrBuilder();

  /**
   * <pre>
   * Maybe we can benefit.
   * </pre>
   *
   * <code>repeated .task.Reference related_tasks = 7;</code>
   */
  java.util.List<pro.furo.todo.Reference> 
      getRelatedTasksList();
  /**
   * <pre>
   * Maybe we can benefit.
   * </pre>
   *
   * <code>repeated .task.Reference related_tasks = 7;</code>
   */
  pro.furo.todo.Reference getRelatedTasks(int index);
  /**
   * <pre>
   * Maybe we can benefit.
   * </pre>
   *
   * <code>repeated .task.Reference related_tasks = 7;</code>
   */
  int getRelatedTasksCount();
  /**
   * <pre>
   * Maybe we can benefit.
   * </pre>
   *
   * <code>repeated .task.Reference related_tasks = 7;</code>
   */
  java.util.List<? extends pro.furo.todo.ReferenceOrBuilder> 
      getRelatedTasksOrBuilderList();
  /**
   * <pre>
   * Maybe we can benefit.
   * </pre>
   *
   * <code>repeated .task.Reference related_tasks = 7;</code>
   */
  pro.furo.todo.ReferenceOrBuilder getRelatedTasksOrBuilder(
      int index);

  /**
   * <pre>
   * Sometimes a task is to hard for one person only.
   * </pre>
   *
   * <code>repeated .person.Reference involved_persons = 8;</code>
   */
  java.util.List<com.furo.baseperson.Reference> 
      getInvolvedPersonsList();
  /**
   * <pre>
   * Sometimes a task is to hard for one person only.
   * </pre>
   *
   * <code>repeated .person.Reference involved_persons = 8;</code>
   */
  com.furo.baseperson.Reference getInvolvedPersons(int index);
  /**
   * <pre>
   * Sometimes a task is to hard for one person only.
   * </pre>
   *
   * <code>repeated .person.Reference involved_persons = 8;</code>
   */
  int getInvolvedPersonsCount();
  /**
   * <pre>
   * Sometimes a task is to hard for one person only.
   * </pre>
   *
   * <code>repeated .person.Reference involved_persons = 8;</code>
   */
  java.util.List<? extends com.furo.baseperson.ReferenceOrBuilder> 
      getInvolvedPersonsOrBuilderList();
  /**
   * <pre>
   * Sometimes a task is to hard for one person only.
   * </pre>
   *
   * <code>repeated .person.Reference involved_persons = 8;</code>
   */
  com.furo.baseperson.ReferenceOrBuilder getInvolvedPersonsOrBuilder(
      int index);

  /**
   * <pre>
   * If something goes wrong, we should be able to make some one responsible for it. This is aligned with our CYA strategy.
   * </pre>
   *
   * <code>.person.Reference responsible_person = 9;</code>
   */
  boolean hasResponsiblePerson();
  /**
   * <pre>
   * If something goes wrong, we should be able to make some one responsible for it. This is aligned with our CYA strategy.
   * </pre>
   *
   * <code>.person.Reference responsible_person = 9;</code>
   */
  com.furo.baseperson.Reference getResponsiblePerson();
  /**
   * <pre>
   * If something goes wrong, we should be able to make some one responsible for it. This is aligned with our CYA strategy.
   * </pre>
   *
   * <code>.person.Reference responsible_person = 9;</code>
   */
  com.furo.baseperson.ReferenceOrBuilder getResponsiblePersonOrBuilder();

  /**
   * <pre>
   * this si maybe the main feature.
   * </pre>
   *
   * <code>bool done = 10;</code>
   */
  boolean getDone();
}