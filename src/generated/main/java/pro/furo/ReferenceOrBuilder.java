// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: furo/furo.proto

package pro.furo;

public interface ReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:furo.Reference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String representation of the reference
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * String representation of the reference
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Id of the reference
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id of the reference
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Hateoas link
   * </pre>
   *
   * <code>.furo.Link link = 3;</code>
   */
  boolean hasLink();
  /**
   * <pre>
   * Hateoas link
   * </pre>
   *
   * <code>.furo.Link link = 3;</code>
   */
  pro.furo.Link getLink();
  /**
   * <pre>
   * Hateoas link
   * </pre>
   *
   * <code>.furo.Link link = 3;</code>
   */
  pro.furo.LinkOrBuilder getLinkOrBuilder();
}