// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth/reqmsgs.proto

package com.furo.baseauth;

public interface CreateAuthSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auth.CreateAuthSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Body with auth.Credentials
   * </pre>
   *
   * <code>.auth.Credentials body = 1;</code>
   */
  boolean hasBody();
  /**
   * <pre>
   * Body with auth.Credentials
   * </pre>
   *
   * <code>.auth.Credentials body = 1;</code>
   */
  com.furo.baseauth.Credentials getBody();
  /**
   * <pre>
   * Body with auth.Credentials
   * </pre>
   *
   * <code>.auth.Credentials body = 1;</code>
   */
  com.furo.baseauth.CredentialsOrBuilder getBodyOrBuilder();
}
