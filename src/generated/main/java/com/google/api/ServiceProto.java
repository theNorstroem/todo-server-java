// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/service.proto

package com.google.api;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Service_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/service.proto\022\ngoogle.api\032\025" +
      "google/api/auth.proto\032\030google/api/backen" +
      "d.proto\032\030google/api/billing.proto\032\030googl" +
      "e/api/context.proto\032\030google/api/control." +
      "proto\032\036google/api/documentation.proto\032\031g" +
      "oogle/api/endpoint.proto\032\025google/api/htt" +
      "p.proto\032\026google/api/label.proto\032\024google/" +
      "api/log.proto\032\030google/api/logging.proto\032" +
      "\027google/api/metric.proto\032#google/api/mon" +
      "itored_resource.proto\032\033google/api/monito" +
      "ring.proto\032\026google/api/quota.proto\032\031goog" +
      "le/api/resource.proto\032\034google/api/source" +
      "_info.proto\032!google/api/system_parameter" +
      ".proto\032\026google/api/usage.proto\032\031google/p" +
      "rotobuf/any.proto\032\031google/protobuf/api.p" +
      "roto\032\032google/protobuf/type.proto\032\036google" +
      "/protobuf/wrappers.proto\"\326\007\n\007Service\0224\n\016" +
      "config_version\030\024 \001(\0132\034.google.protobuf.U" +
      "Int32Value\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030! \001(\t\022\r\n\005" +
      "title\030\002 \001(\t\022\033\n\023producer_project_id\030\026 \001(\t" +
      "\022\"\n\004apis\030\003 \003(\0132\024.google.protobuf.Api\022$\n\005" +
      "types\030\004 \003(\0132\025.google.protobuf.Type\022$\n\005en" +
      "ums\030\005 \003(\0132\025.google.protobuf.Enum\0220\n\rdocu" +
      "mentation\030\006 \001(\0132\031.google.api.Documentati" +
      "on\022$\n\007backend\030\010 \001(\0132\023.google.api.Backend" +
      "\022\036\n\004http\030\t \001(\0132\020.google.api.Http\022 \n\005quot" +
      "a\030\n \001(\0132\021.google.api.Quota\0222\n\016authentica" +
      "tion\030\013 \001(\0132\032.google.api.Authentication\022$" +
      "\n\007context\030\014 \001(\0132\023.google.api.Context\022 \n\005" +
      "usage\030\017 \001(\0132\021.google.api.Usage\022\'\n\tendpoi" +
      "nts\030\022 \003(\0132\024.google.api.Endpoint\022$\n\007contr" +
      "ol\030\025 \001(\0132\023.google.api.Control\022\'\n\004logs\030\027 " +
      "\003(\0132\031.google.api.LogDescriptor\022-\n\007metric" +
      "s\030\030 \003(\0132\034.google.api.MetricDescriptor\022D\n" +
      "\023monitored_resources\030\031 \003(\0132\'.google.api." +
      "MonitoredResourceDescriptor\022$\n\007billing\030\032" +
      " \001(\0132\023.google.api.Billing\022$\n\007logging\030\033 \001" +
      "(\0132\023.google.api.Logging\022*\n\nmonitoring\030\034 " +
      "\001(\0132\026.google.api.Monitoring\0227\n\021system_pa" +
      "rameters\030\035 \001(\0132\034.google.api.SystemParame" +
      "ters\022+\n\013source_info\030% \001(\0132\026.google.api.S" +
      "ourceInfoBn\n\016com.google.apiB\014ServiceProt" +
      "oP\001ZEgoogle.golang.org/genproto/googleap" +
      "is/api/serviceconfig;serviceconfig\242\002\004GAP" +
      "Ib\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AuthProto.getDescriptor(),
          com.google.api.BackendProto.getDescriptor(),
          com.google.api.BillingProto.getDescriptor(),
          com.google.api.ContextProto.getDescriptor(),
          com.google.api.ControlProto.getDescriptor(),
          com.google.api.DocumentationProto.getDescriptor(),
          com.google.api.EndpointProto.getDescriptor(),
          com.google.api.HttpProto.getDescriptor(),
          com.google.api.LabelProto.getDescriptor(),
          com.google.api.LogProto.getDescriptor(),
          com.google.api.LoggingProto.getDescriptor(),
          com.google.api.MetricProto.getDescriptor(),
          com.google.api.MonitoredResourceProto.getDescriptor(),
          com.google.api.MonitoringProto.getDescriptor(),
          com.google.api.QuotaProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.SourceInfoProto.getDescriptor(),
          com.google.api.SystemParameterProto.getDescriptor(),
          com.google.api.UsageProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.ApiProto.getDescriptor(),
          com.google.protobuf.TypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_Service_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Service_descriptor,
        new java.lang.String[] { "ConfigVersion", "Name", "Id", "Title", "ProducerProjectId", "Apis", "Types", "Enums", "Documentation", "Backend", "Http", "Quota", "Authentication", "Context", "Usage", "Endpoints", "Control", "Logs", "Metrics", "MonitoredResources", "Billing", "Logging", "Monitoring", "SystemParameters", "SourceInfo", });
    com.google.api.AuthProto.getDescriptor();
    com.google.api.BackendProto.getDescriptor();
    com.google.api.BillingProto.getDescriptor();
    com.google.api.ContextProto.getDescriptor();
    com.google.api.ControlProto.getDescriptor();
    com.google.api.DocumentationProto.getDescriptor();
    com.google.api.EndpointProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    com.google.api.LabelProto.getDescriptor();
    com.google.api.LogProto.getDescriptor();
    com.google.api.LoggingProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.MonitoringProto.getDescriptor();
    com.google.api.QuotaProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.SourceInfoProto.getDescriptor();
    com.google.api.SystemParameterProto.getDescriptor();
    com.google.api.UsageProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.ApiProto.getDescriptor();
    com.google.protobuf.TypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
