// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task/reqmsgs.proto

package pro.furo.todo;

public interface ListTasksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:task.ListTasksRequest)
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
   * Use this to search for a task by text.
   * </pre>
   *
   * <code>string q = 2;</code>
   */
  java.lang.String getQ();
  /**
   * <pre>
   * Use this to search for a task by text.
   * </pre>
   *
   * <code>string q = 2;</code>
   */
  com.google.protobuf.ByteString
      getQBytes();

  /**
   * <pre>
   * Use this field to filter the tasks, this is not searching.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Use this field to filter the tasks, this is not searching.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Use this field to specify the ordering.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Use this field to specify the ordering.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Use this field to specify page to display.
   * </pre>
   *
   * <code>uint32 page = 5;</code>
   */
  int getPage();

  /**
   * <pre>
   * Define the size of a page.
   * </pre>
   *
   * <code>uint32 page_size = 6;</code>
   */
  int getPageSize();
}