// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: furo/fat/fat.proto

package pro.furo.fat;

public interface EmptyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:furo.fat.Empty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Labels / flags for the value, something like unspecified, empty, confidential, absent,... Can be used for AI, UI, Business Logic,...
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Labels / flags for the value, something like unspecified, empty, confidential, absent,... Can be used for AI, UI, Business Logic,...
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels / flags for the value, something like unspecified, empty, confidential, absent,... Can be used for AI, UI, Business Logic,...
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Labels / flags for the value, something like unspecified, empty, confidential, absent,... Can be used for AI, UI, Business Logic,...
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * Attributes for a value, something like confidential-msg: you are not allowed to see this value 
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Attributes for a value, something like confidential-msg: you are not allowed to see this value 
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <pre>
   * Attributes for a value, something like confidential-msg: you are not allowed to see this value 
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <pre>
   * Attributes for a value, something like confidential-msg: you are not allowed to see this value 
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */

  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Attributes for a value, something like confidential-msg: you are not allowed to see this value 
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */

  java.lang.String getAttributesOrThrow(
      java.lang.String key);
}
