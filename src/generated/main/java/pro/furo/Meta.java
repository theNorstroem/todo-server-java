// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: furo/furo.proto

package pro.furo;

/**
 * <pre>
 * meta info
 * </pre>
 *
 * Protobuf type {@code furo.Meta}
 */
public  final class Meta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:furo.Meta)
    MetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Meta.newBuilder() to construct.
  private Meta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Meta() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Meta(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              fields_ = com.google.protobuf.MapField.newMapField(
                  FieldsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, pro.furo.MetaField>
            fields__ = input.readMessage(
                FieldsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            fields_.getMutableMap().put(
                fields__.getKey(), fields__.getValue());
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pro.furo.FuroProto.internal_static_furo_Meta_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFields();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pro.furo.FuroProto.internal_static_furo_Meta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pro.furo.Meta.class, pro.furo.Meta.Builder.class);
  }

  public static final int FIELDS_FIELD_NUMBER = 1;
  private static final class FieldsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, pro.furo.MetaField> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, pro.furo.MetaField>newDefaultInstance(
                pro.furo.FuroProto.internal_static_furo_Meta_FieldsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                pro.furo.MetaField.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, pro.furo.MetaField> fields_;
  private com.google.protobuf.MapField<java.lang.String, pro.furo.MetaField>
  internalGetFields() {
    if (fields_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FieldsDefaultEntryHolder.defaultEntry);
    }
    return fields_;
  }

  public int getFieldsCount() {
    return internalGetFields().getMap().size();
  }
  /**
   * <pre>
   * fields of meta info
   * </pre>
   *
   * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
   */

  public boolean containsFields(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetFields().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, pro.furo.MetaField> getFields() {
    return getFieldsMap();
  }
  /**
   * <pre>
   * fields of meta info
   * </pre>
   *
   * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
   */

  public java.util.Map<java.lang.String, pro.furo.MetaField> getFieldsMap() {
    return internalGetFields().getMap();
  }
  /**
   * <pre>
   * fields of meta info
   * </pre>
   *
   * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
   */

  public pro.furo.MetaField getFieldsOrDefault(
      java.lang.String key,
      pro.furo.MetaField defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, pro.furo.MetaField> map =
        internalGetFields().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * fields of meta info
   * </pre>
   *
   * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
   */

  public pro.furo.MetaField getFieldsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, pro.furo.MetaField> map =
        internalGetFields().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetFields(),
        FieldsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, pro.furo.MetaField> entry
         : internalGetFields().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, pro.furo.MetaField>
      fields__ = FieldsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fields__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof pro.furo.Meta)) {
      return super.equals(obj);
    }
    pro.furo.Meta other = (pro.furo.Meta) obj;

    boolean result = true;
    result = result && internalGetFields().equals(
        other.internalGetFields());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetFields().getMap().isEmpty()) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFields().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pro.furo.Meta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pro.furo.Meta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pro.furo.Meta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pro.furo.Meta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pro.furo.Meta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pro.furo.Meta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pro.furo.Meta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pro.furo.Meta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pro.furo.Meta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pro.furo.Meta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pro.furo.Meta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pro.furo.Meta parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pro.furo.Meta prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * meta info
   * </pre>
   *
   * Protobuf type {@code furo.Meta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:furo.Meta)
      pro.furo.MetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pro.furo.FuroProto.internal_static_furo_Meta_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFields();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFields();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pro.furo.FuroProto.internal_static_furo_Meta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pro.furo.Meta.class, pro.furo.Meta.Builder.class);
    }

    // Construct using pro.furo.Meta.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableFields().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pro.furo.FuroProto.internal_static_furo_Meta_descriptor;
    }

    @java.lang.Override
    public pro.furo.Meta getDefaultInstanceForType() {
      return pro.furo.Meta.getDefaultInstance();
    }

    @java.lang.Override
    public pro.furo.Meta build() {
      pro.furo.Meta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pro.furo.Meta buildPartial() {
      pro.furo.Meta result = new pro.furo.Meta(this);
      int from_bitField0_ = bitField0_;
      result.fields_ = internalGetFields();
      result.fields_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pro.furo.Meta) {
        return mergeFrom((pro.furo.Meta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pro.furo.Meta other) {
      if (other == pro.furo.Meta.getDefaultInstance()) return this;
      internalGetMutableFields().mergeFrom(
          other.internalGetFields());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      pro.furo.Meta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pro.furo.Meta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, pro.furo.MetaField> fields_;
    private com.google.protobuf.MapField<java.lang.String, pro.furo.MetaField>
    internalGetFields() {
      if (fields_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FieldsDefaultEntryHolder.defaultEntry);
      }
      return fields_;
    }
    private com.google.protobuf.MapField<java.lang.String, pro.furo.MetaField>
    internalGetMutableFields() {
      onChanged();;
      if (fields_ == null) {
        fields_ = com.google.protobuf.MapField.newMapField(
            FieldsDefaultEntryHolder.defaultEntry);
      }
      if (!fields_.isMutable()) {
        fields_ = fields_.copy();
      }
      return fields_;
    }

    public int getFieldsCount() {
      return internalGetFields().getMap().size();
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */

    public boolean containsFields(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetFields().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFieldsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, pro.furo.MetaField> getFields() {
      return getFieldsMap();
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */

    public java.util.Map<java.lang.String, pro.furo.MetaField> getFieldsMap() {
      return internalGetFields().getMap();
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */

    public pro.furo.MetaField getFieldsOrDefault(
        java.lang.String key,
        pro.furo.MetaField defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, pro.furo.MetaField> map =
          internalGetFields().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */

    public pro.furo.MetaField getFieldsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, pro.furo.MetaField> map =
          internalGetFields().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFields() {
      internalGetMutableFields().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */

    public Builder removeFields(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFields().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, pro.furo.MetaField>
    getMutableFields() {
      return internalGetMutableFields().getMutableMap();
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */
    public Builder putFields(
        java.lang.String key,
        pro.furo.MetaField value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFields().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * fields of meta info
     * </pre>
     *
     * <code>map&lt;string, .furo.MetaField&gt; fields = 1;</code>
     */

    public Builder putAllFields(
        java.util.Map<java.lang.String, pro.furo.MetaField> values) {
      internalGetMutableFields().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:furo.Meta)
  }

  // @@protoc_insertion_point(class_scope:furo.Meta)
  private static final pro.furo.Meta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pro.furo.Meta();
  }

  public static pro.furo.Meta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Meta>
      PARSER = new com.google.protobuf.AbstractParser<Meta>() {
    @java.lang.Override
    public Meta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Meta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Meta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Meta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pro.furo.Meta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
