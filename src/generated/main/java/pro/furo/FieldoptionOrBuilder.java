// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: furo/furo.proto

package pro.furo;

public interface FieldoptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:furo.Fieldoption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * a list with options, use furo.optionitem or your own
   * </pre>
   *
   * <code>repeated .google.protobuf.Any list = 1;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getListList();
  /**
   * <pre>
   * a list with options, use furo.optionitem or your own
   * </pre>
   *
   * <code>repeated .google.protobuf.Any list = 1;</code>
   */
  com.google.protobuf.Any getList(int index);
  /**
   * <pre>
   * a list with options, use furo.optionitem or your own
   * </pre>
   *
   * <code>repeated .google.protobuf.Any list = 1;</code>
   */
  int getListCount();
  /**
   * <pre>
   * a list with options, use furo.optionitem or your own
   * </pre>
   *
   * <code>repeated .google.protobuf.Any list = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * a list with options, use furo.optionitem or your own
   * </pre>
   *
   * <code>repeated .google.protobuf.Any list = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * Add flags for your field. This can be something like "searchable". 
   * //The flags can be used by generators, ui components,...
   * 
   * </pre>
   *
   * <code>repeated string flags = 2;</code>
   */
  java.util.List<java.lang.String>
      getFlagsList();
  /**
   * <pre>
   * Add flags for your field. This can be something like "searchable". 
   * //The flags can be used by generators, ui components,...
   * 
   * </pre>
   *
   * <code>repeated string flags = 2;</code>
   */
  int getFlagsCount();
  /**
   * <pre>
   * Add flags for your field. This can be something like "searchable". 
   * //The flags can be used by generators, ui components,...
   * 
   * </pre>
   *
   * <code>repeated string flags = 2;</code>
   */
  java.lang.String getFlags(int index);
  /**
   * <pre>
   * Add flags for your field. This can be something like "searchable". 
   * //The flags can be used by generators, ui components,...
   * 
   * </pre>
   *
   * <code>repeated string flags = 2;</code>
   */
  com.google.protobuf.ByteString
      getFlagsBytes(int index);
}
