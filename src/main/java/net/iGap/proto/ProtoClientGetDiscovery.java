// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientGetDiscovery.proto

package net.iGap.proto;

public final class ProtoClientGetDiscovery {
  private ProtoClientGetDiscovery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientGetDiscoveryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientGetDiscovery)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    boolean hasRequest();
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    net.iGap.proto.ProtoRequest.Request getRequest();

    /**
     * <code>optional uint32 page_id = 2;</code>
     */
    int getPageId();

    /**
     * <code>optional uint32 project_id = 3;</code>
     */
    int getProjectId();
  }
  /**
   * Protobuf type {@code proto.ClientGetDiscovery}
   */
  public  static final class ClientGetDiscovery extends
      com.google.protobuf.GeneratedMessageLite<
          ClientGetDiscovery, ClientGetDiscovery.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientGetDiscovery)
      ClientGetDiscoveryOrBuilder {
    private ClientGetDiscovery() {
    }
    public static final int REQUEST_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoRequest.Request request_;
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public boolean hasRequest() {
      return request_ != null;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public net.iGap.proto.ProtoRequest.Request getRequest() {
      return request_ == null ? net.iGap.proto.ProtoRequest.Request.getDefaultInstance() : request_;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (value == null) {
        throw new NullPointerException();
      }
      request_ = value;
      
      }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(
        net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
      request_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (request_ != null &&
          request_ != net.iGap.proto.ProtoRequest.Request.getDefaultInstance()) {
        request_ =
          net.iGap.proto.ProtoRequest.Request.newBuilder(request_).mergeFrom(value).buildPartial();
      } else {
        request_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void clearRequest() {  request_ = null;
      
    }

    public static final int PAGE_ID_FIELD_NUMBER = 2;
    private int pageId_;
    /**
     * <code>optional uint32 page_id = 2;</code>
     */
    public int getPageId() {
      return pageId_;
    }
    /**
     * <code>optional uint32 page_id = 2;</code>
     */
    private void setPageId(int value) {
      
      pageId_ = value;
    }
    /**
     * <code>optional uint32 page_id = 2;</code>
     */
    private void clearPageId() {
      
      pageId_ = 0;
    }

    public static final int PROJECT_ID_FIELD_NUMBER = 3;
    private int projectId_;
    /**
     * <code>optional uint32 project_id = 3;</code>
     */
    public int getProjectId() {
      return projectId_;
    }
    /**
     * <code>optional uint32 project_id = 3;</code>
     */
    private void setProjectId(int value) {
      
      projectId_ = value;
    }
    /**
     * <code>optional uint32 project_id = 3;</code>
     */
    private void clearProjectId() {
      
      projectId_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (pageId_ != 0) {
        output.writeUInt32(2, pageId_);
      }
      if (projectId_ != 0) {
        output.writeUInt32(3, projectId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (request_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRequest());
      }
      if (pageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pageId_);
      }
      if (projectId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, projectId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientGetDiscovery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientGetDiscovery)
        net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryOrBuilder {
      // Construct using net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public boolean hasRequest() {
        return instance.hasRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public net.iGap.proto.ProtoRequest.Request getRequest() {
        return instance.getRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.setRequest(value);
        return this;
        }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(
          net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
        copyOnWrite();
        instance.setRequest(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.mergeRequest(value);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder clearRequest() {  copyOnWrite();
        instance.clearRequest();
        return this;
      }

      /**
       * <code>optional uint32 page_id = 2;</code>
       */
      public int getPageId() {
        return instance.getPageId();
      }
      /**
       * <code>optional uint32 page_id = 2;</code>
       */
      public Builder setPageId(int value) {
        copyOnWrite();
        instance.setPageId(value);
        return this;
      }
      /**
       * <code>optional uint32 page_id = 2;</code>
       */
      public Builder clearPageId() {
        copyOnWrite();
        instance.clearPageId();
        return this;
      }

      /**
       * <code>optional uint32 project_id = 3;</code>
       */
      public int getProjectId() {
        return instance.getProjectId();
      }
      /**
       * <code>optional uint32 project_id = 3;</code>
       */
      public Builder setProjectId(int value) {
        copyOnWrite();
        instance.setProjectId(value);
        return this;
      }
      /**
       * <code>optional uint32 project_id = 3;</code>
       */
      public Builder clearProjectId() {
        copyOnWrite();
        instance.clearProjectId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientGetDiscovery)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery other = (net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          pageId_ = visitor.visitInt(pageId_ != 0, pageId_,
              other.pageId_ != 0, other.pageId_);
          projectId_ = visitor.visitInt(projectId_ != 0, projectId_,
              other.projectId_ != 0, other.projectId_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  net.iGap.proto.ProtoRequest.Request.Builder subBuilder = null;
                  if (request_ != null) {
                    subBuilder = request_.toBuilder();
                  }
                  request_ = input.readMessage(net.iGap.proto.ProtoRequest.Request.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(request_);
                    request_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {

                  pageId_ = input.readUInt32();
                  break;
                }
                case 24: {

                  projectId_ = input.readUInt32();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.ClientGetDiscovery)
    private static final net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientGetDiscovery();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscovery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientGetDiscovery> PARSER;

    public static com.google.protobuf.Parser<ClientGetDiscovery> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ClientGetDiscoveryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientGetDiscoveryResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    boolean hasResponse();
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    net.iGap.proto.ProtoResponse.Response getResponse();

    /**
     * <code>optional string title = 2;</code>
     */
    java.lang.String getTitle();
    /**
     * <code>optional string title = 2;</code>
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    java.util.List<net.iGap.proto.ProtoGlobal.Discovery> 
        getDiscoveriesList();
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    net.iGap.proto.ProtoGlobal.Discovery getDiscoveries(int index);
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    int getDiscoveriesCount();
  }
  /**
   * Protobuf type {@code proto.ClientGetDiscoveryResponse}
   */
  public  static final class ClientGetDiscoveryResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ClientGetDiscoveryResponse, ClientGetDiscoveryResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientGetDiscoveryResponse)
      ClientGetDiscoveryResponseOrBuilder {
    private ClientGetDiscoveryResponse() {
      title_ = "";
      discoveries_ = emptyProtobufList();
    }
    private int bitField0_;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoResponse.Response response_;
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public boolean hasResponse() {
      return response_ != null;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public net.iGap.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (value == null) {
        throw new NullPointerException();
      }
      response_ = value;
      
      }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(
        net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
      response_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (response_ != null &&
          response_ != net.iGap.proto.ProtoResponse.Response.getDefaultInstance()) {
        response_ =
          net.iGap.proto.ProtoResponse.Response.newBuilder(response_).mergeFrom(value).buildPartial();
      } else {
        response_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void clearResponse() {  response_ = null;
      
    }

    public static final int TITLE_FIELD_NUMBER = 2;
    private java.lang.String title_;
    /**
     * <code>optional string title = 2;</code>
     */
    public java.lang.String getTitle() {
      return title_;
    }
    /**
     * <code>optional string title = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(title_);
    }
    /**
     * <code>optional string title = 2;</code>
     */
    private void setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
    }
    /**
     * <code>optional string title = 2;</code>
     */
    private void clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
    }
    /**
     * <code>optional string title = 2;</code>
     */
    private void setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value.toStringUtf8();
    }

    public static final int DISCOVERIES_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.ProtobufList<net.iGap.proto.ProtoGlobal.Discovery> discoveries_;
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    public java.util.List<net.iGap.proto.ProtoGlobal.Discovery> getDiscoveriesList() {
      return discoveries_;
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    public java.util.List<? extends net.iGap.proto.ProtoGlobal.DiscoveryOrBuilder> 
        getDiscoveriesOrBuilderList() {
      return discoveries_;
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    public int getDiscoveriesCount() {
      return discoveries_.size();
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    public net.iGap.proto.ProtoGlobal.Discovery getDiscoveries(int index) {
      return discoveries_.get(index);
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    public net.iGap.proto.ProtoGlobal.DiscoveryOrBuilder getDiscoveriesOrBuilder(
        int index) {
      return discoveries_.get(index);
    }
    private void ensureDiscoveriesIsMutable() {
      if (!discoveries_.isModifiable()) {
        discoveries_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(discoveries_);
       }
    }

    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void setDiscoveries(
        int index, net.iGap.proto.ProtoGlobal.Discovery value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDiscoveriesIsMutable();
      discoveries_.set(index, value);
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void setDiscoveries(
        int index, net.iGap.proto.ProtoGlobal.Discovery.Builder builderForValue) {
      ensureDiscoveriesIsMutable();
      discoveries_.set(index, builderForValue.build());
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void addDiscoveries(net.iGap.proto.ProtoGlobal.Discovery value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDiscoveriesIsMutable();
      discoveries_.add(value);
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void addDiscoveries(
        int index, net.iGap.proto.ProtoGlobal.Discovery value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDiscoveriesIsMutable();
      discoveries_.add(index, value);
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void addDiscoveries(
        net.iGap.proto.ProtoGlobal.Discovery.Builder builderForValue) {
      ensureDiscoveriesIsMutable();
      discoveries_.add(builderForValue.build());
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void addDiscoveries(
        int index, net.iGap.proto.ProtoGlobal.Discovery.Builder builderForValue) {
      ensureDiscoveriesIsMutable();
      discoveries_.add(index, builderForValue.build());
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void addAllDiscoveries(
        java.lang.Iterable<? extends net.iGap.proto.ProtoGlobal.Discovery> values) {
      ensureDiscoveriesIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, discoveries_);
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void clearDiscoveries() {
      discoveries_ = emptyProtobufList();
    }
    /**
     * <code>repeated .proto.Discovery discoveries = 3;</code>
     */
    private void removeDiscoveries(int index) {
      ensureDiscoveriesIsMutable();
      discoveries_.remove(index);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (!title_.isEmpty()) {
        output.writeString(2, getTitle());
      }
      for (int i = 0; i < discoveries_.size(); i++) {
        output.writeMessage(3, discoveries_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (response_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResponse());
      }
      if (!title_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTitle());
      }
      for (int i = 0; i < discoveries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, discoveries_.get(i));
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientGetDiscoveryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientGetDiscoveryResponse)
        net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public boolean hasResponse() {
        return instance.hasResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public net.iGap.proto.ProtoResponse.Response getResponse() {
        return instance.getResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.setResponse(value);
        return this;
        }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(
          net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
        copyOnWrite();
        instance.setResponse(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.mergeResponse(value);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder clearResponse() {  copyOnWrite();
        instance.clearResponse();
        return this;
      }

      /**
       * <code>optional string title = 2;</code>
       */
      public java.lang.String getTitle() {
        return instance.getTitle();
      }
      /**
       * <code>optional string title = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        return instance.getTitleBytes();
      }
      /**
       * <code>optional string title = 2;</code>
       */
      public Builder setTitle(
          java.lang.String value) {
        copyOnWrite();
        instance.setTitle(value);
        return this;
      }
      /**
       * <code>optional string title = 2;</code>
       */
      public Builder clearTitle() {
        copyOnWrite();
        instance.clearTitle();
        return this;
      }
      /**
       * <code>optional string title = 2;</code>
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTitleBytes(value);
        return this;
      }

      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public java.util.List<net.iGap.proto.ProtoGlobal.Discovery> getDiscoveriesList() {
        return java.util.Collections.unmodifiableList(
            instance.getDiscoveriesList());
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public int getDiscoveriesCount() {
        return instance.getDiscoveriesCount();
      }/**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public net.iGap.proto.ProtoGlobal.Discovery getDiscoveries(int index) {
        return instance.getDiscoveries(index);
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder setDiscoveries(
          int index, net.iGap.proto.ProtoGlobal.Discovery value) {
        copyOnWrite();
        instance.setDiscoveries(index, value);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder setDiscoveries(
          int index, net.iGap.proto.ProtoGlobal.Discovery.Builder builderForValue) {
        copyOnWrite();
        instance.setDiscoveries(index, builderForValue);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder addDiscoveries(net.iGap.proto.ProtoGlobal.Discovery value) {
        copyOnWrite();
        instance.addDiscoveries(value);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder addDiscoveries(
          int index, net.iGap.proto.ProtoGlobal.Discovery value) {
        copyOnWrite();
        instance.addDiscoveries(index, value);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder addDiscoveries(
          net.iGap.proto.ProtoGlobal.Discovery.Builder builderForValue) {
        copyOnWrite();
        instance.addDiscoveries(builderForValue);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder addDiscoveries(
          int index, net.iGap.proto.ProtoGlobal.Discovery.Builder builderForValue) {
        copyOnWrite();
        instance.addDiscoveries(index, builderForValue);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder addAllDiscoveries(
          java.lang.Iterable<? extends net.iGap.proto.ProtoGlobal.Discovery> values) {
        copyOnWrite();
        instance.addAllDiscoveries(values);
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder clearDiscoveries() {
        copyOnWrite();
        instance.clearDiscoveries();
        return this;
      }
      /**
       * <code>repeated .proto.Discovery discoveries = 3;</code>
       */
      public Builder removeDiscoveries(int index) {
        copyOnWrite();
        instance.removeDiscoveries(index);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientGetDiscoveryResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          discoveries_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse other = (net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          title_ = visitor.visitString(!title_.isEmpty(), title_,
              !other.title_.isEmpty(), other.title_);
          discoveries_= visitor.visitList(discoveries_, other.discoveries_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  net.iGap.proto.ProtoResponse.Response.Builder subBuilder = null;
                  if (response_ != null) {
                    subBuilder = response_.toBuilder();
                  }
                  response_ = input.readMessage(net.iGap.proto.ProtoResponse.Response.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(response_);
                    response_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  title_ = s;
                  break;
                }
                case 26: {
                  if (!discoveries_.isModifiable()) {
                    discoveries_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(discoveries_);
                  }
                  discoveries_.add(
                      input.readMessage(net.iGap.proto.ProtoGlobal.Discovery.parser(), extensionRegistry));
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.ClientGetDiscoveryResponse)
    private static final net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientGetDiscoveryResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientGetDiscovery.ClientGetDiscoveryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientGetDiscoveryResponse> PARSER;

    public static com.google.protobuf.Parser<ClientGetDiscoveryResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
