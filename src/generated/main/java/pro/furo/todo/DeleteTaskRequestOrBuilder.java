// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task/reqmsgs.proto

package pro.furo.todo;

public interface DeleteTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:task.DeleteTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Body with google.protobuf.Empty
   * </pre>
   *
   * <code>.google.protobuf.Empty body = 1;</code>
   */
  boolean hasBody();
  /**
   * <pre>
   * Body with google.protobuf.Empty
   * </pre>
   *
   * <code>.google.protobuf.Empty body = 1;</code>
   */
  com.google.protobuf.Empty getBody();
  /**
   * <pre>
   * Body with google.protobuf.Empty
   * </pre>
   *
   * <code>.google.protobuf.Empty body = 1;</code>
   */
  com.google.protobuf.EmptyOrBuilder getBodyOrBuilder();

  /**
   * <pre>
   * tsk string.
   * </pre>
   *
   * <code>string tsk = 2;</code>
   */
  java.lang.String getTsk();
  /**
   * <pre>
   * tsk string.
   * </pre>
   *
   * <code>string tsk = 2;</code>
   */
  com.google.protobuf.ByteString
      getTskBytes();
}
