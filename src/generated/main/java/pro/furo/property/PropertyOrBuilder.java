// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: furo/property.proto

package pro.furo.property;

public interface PropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:furo.Property)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the property
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id of the property
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * String representation of the property
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * String representation of the property
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * data part of the property
   * </pre>
   *
   * <code>.google.protobuf.Any data = 3;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * data part of the property
   * </pre>
   *
   * <code>.google.protobuf.Any data = 3;</code>
   */
  com.google.protobuf.Any getData();
  /**
   * <pre>
   * data part of the property
   * </pre>
   *
   * <code>.google.protobuf.Any data = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * Meta for the response
   * </pre>
   *
   * <code>.furo.Meta meta = 4;</code>
   */
  boolean hasMeta();
  /**
   * <pre>
   * Meta for the response
   * </pre>
   *
   * <code>.furo.Meta meta = 4;</code>
   */
  pro.furo.Meta getMeta();
  /**
   * <pre>
   * Meta for the response
   * </pre>
   *
   * <code>.furo.Meta meta = 4;</code>
   */
  pro.furo.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * property code for additional settings
   * </pre>
   *
   * <code>string code = 5;</code>
   */
  java.lang.String getCode();
  /**
   * <pre>
   * property code for additional settings
   * </pre>
   *
   * <code>string code = 5;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * Optional attribute flags e.g. is-overwritable
   * </pre>
   *
   * <code>repeated string flags = 6;</code>
   */
  java.util.List<java.lang.String>
      getFlagsList();
  /**
   * <pre>
   * Optional attribute flags e.g. is-overwritable
   * </pre>
   *
   * <code>repeated string flags = 6;</code>
   */
  int getFlagsCount();
  /**
   * <pre>
   * Optional attribute flags e.g. is-overwritable
   * </pre>
   *
   * <code>repeated string flags = 6;</code>
   */
  java.lang.String getFlags(int index);
  /**
   * <pre>
   * Optional attribute flags e.g. is-overwritable
   * </pre>
   *
   * <code>repeated string flags = 6;</code>
   */
  com.google.protobuf.ByteString
      getFlagsBytes(int index);

  /**
   * <pre>
   * Optional flag indicating that the property differs from the original value
   * </pre>
   *
   * <code>bool is_overwritten = 7;</code>
   */
  boolean getIsOverwritten();
}
