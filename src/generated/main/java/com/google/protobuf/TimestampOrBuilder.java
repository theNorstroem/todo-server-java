// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/timestamp.proto

package com.google.protobuf;

public interface TimestampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Timestamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents seconds of UTC time since Unix epoch
   *  1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
   *  9999-12-31T23:59:59Z inclusive.
   * </pre>
   *
   * <code>int64 seconds = 1;</code>
   */
  long getSeconds();

  /**
   * <pre>
   * Non-negative fractions of a second at nanosecond resolution. Negative
   *  second values with fractions must still have non-negative nanos values
   *  that count forward in time. Must be from 0 to 999,999,999
   *  inclusive.
   * </pre>
   *
   * <code>int32 nanos = 2;</code>
   */
  int getNanos();
}
