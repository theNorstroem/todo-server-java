// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package com.google.api;

public final class MonitoredResourceProto {
  private MonitoredResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResource_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResource_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/api/monitored_resource.proto\022\ng" +
      "oogle.api\032\026google/api/label.proto\032\035googl" +
      "e/api/launch_stage.proto\032\034google/protobu" +
      "f/struct.proto\"\300\001\n\033MonitoredResourceDesc" +
      "riptor\022\014\n\004name\030\005 \001(\t\022\014\n\004type\030\001 \001(\t\022\024\n\014di" +
      "splay_name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022+\n" +
      "\006labels\030\004 \003(\0132\033.google.api.LabelDescript" +
      "or\022-\n\014launch_stage\030\007 \001(\0162\027.google.api.La" +
      "unchStage\"\213\001\n\021MonitoredResource\022\014\n\004type\030" +
      "\001 \001(\t\0229\n\006labels\030\002 \003(\0132).google.api.Monit" +
      "oredResource.LabelsEntry\032-\n\013LabelsEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\312\001\n\031Moni" +
      "toredResourceMetadata\022.\n\rsystem_labels\030\001" +
      " \001(\0132\027.google.protobuf.Struct\022J\n\013user_la" +
      "bels\030\002 \003(\01325.google.api.MonitoredResourc" +
      "eMetadata.UserLabelsEntry\0321\n\017UserLabelsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001By\n\016" +
      "com.google.apiB\026MonitoredResourceProtoP\001" +
      "ZCgoogle.golang.org/genproto/googleapis/" +
      "api/monitoredres;monitoredres\370\001\001\242\002\004GAPIb" +
      "\006proto3"
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
          com.google.api.LabelProto.getDescriptor(),
          com.google.api.LaunchStageProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_MonitoredResourceDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_MonitoredResourceDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceDescriptor_descriptor,
        new java.lang.String[] { "Name", "Type", "DisplayName", "Description", "Labels", "LaunchStage", });
    internal_static_google_api_MonitoredResource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_MonitoredResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResource_descriptor,
        new java.lang.String[] { "Type", "Labels", });
    internal_static_google_api_MonitoredResource_LabelsEntry_descriptor =
      internal_static_google_api_MonitoredResource_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MonitoredResource_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResource_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_MonitoredResourceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_MonitoredResourceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceMetadata_descriptor,
        new java.lang.String[] { "SystemLabels", "UserLabels", });
    internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_descriptor =
      internal_static_google_api_MonitoredResourceMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.LabelProto.getDescriptor();
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
