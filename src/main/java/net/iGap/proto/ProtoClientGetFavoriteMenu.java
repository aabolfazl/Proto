// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientGetFavoriteMenu.proto

package net.iGap.proto;

public final class ProtoClientGetFavoriteMenu {
  private ProtoClientGetFavoriteMenu() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientGetFavoriteMenuOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientGetFavoriteMenu)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    boolean hasRequest();
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    net.iGap.proto.ProtoRequest.Request getRequest();
  }
  /**
   * Protobuf type {@code proto.ClientGetFavoriteMenu}
   */
  public  static final class ClientGetFavoriteMenu extends
      com.google.protobuf.GeneratedMessageLite<
          ClientGetFavoriteMenu, ClientGetFavoriteMenu.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientGetFavoriteMenu)
      ClientGetFavoriteMenuOrBuilder {
    private ClientGetFavoriteMenu() {
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

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
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
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientGetFavoriteMenu}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientGetFavoriteMenu)
        net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuOrBuilder {
      // Construct using net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:proto.ClientGetFavoriteMenu)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu();
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
          net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu other = (net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientGetFavoriteMenu)
    private static final net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientGetFavoriteMenu();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenu getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientGetFavoriteMenu> PARSER;

    public static com.google.protobuf.Parser<ClientGetFavoriteMenu> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ClientGetFavoriteMenuResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientGetFavoriteMenuResponse)
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
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    java.util.List<net.iGap.proto.ProtoGlobal.Favorite> 
        getFavoritesList();
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    net.iGap.proto.ProtoGlobal.Favorite getFavorites(int index);
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    int getFavoritesCount();
  }
  /**
   * Protobuf type {@code proto.ClientGetFavoriteMenuResponse}
   */
  public  static final class ClientGetFavoriteMenuResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ClientGetFavoriteMenuResponse, ClientGetFavoriteMenuResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientGetFavoriteMenuResponse)
      ClientGetFavoriteMenuResponseOrBuilder {
    private ClientGetFavoriteMenuResponse() {
      favorites_ = emptyProtobufList();
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

    public static final int FAVORITES_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.ProtobufList<net.iGap.proto.ProtoGlobal.Favorite> favorites_;
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    public java.util.List<net.iGap.proto.ProtoGlobal.Favorite> getFavoritesList() {
      return favorites_;
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    public java.util.List<? extends net.iGap.proto.ProtoGlobal.FavoriteOrBuilder> 
        getFavoritesOrBuilderList() {
      return favorites_;
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    public int getFavoritesCount() {
      return favorites_.size();
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    public net.iGap.proto.ProtoGlobal.Favorite getFavorites(int index) {
      return favorites_.get(index);
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    public net.iGap.proto.ProtoGlobal.FavoriteOrBuilder getFavoritesOrBuilder(
        int index) {
      return favorites_.get(index);
    }
    private void ensureFavoritesIsMutable() {
      if (!favorites_.isModifiable()) {
        favorites_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(favorites_);
       }
    }

    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void setFavorites(
        int index, net.iGap.proto.ProtoGlobal.Favorite value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFavoritesIsMutable();
      favorites_.set(index, value);
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void setFavorites(
        int index, net.iGap.proto.ProtoGlobal.Favorite.Builder builderForValue) {
      ensureFavoritesIsMutable();
      favorites_.set(index, builderForValue.build());
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void addFavorites(net.iGap.proto.ProtoGlobal.Favorite value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFavoritesIsMutable();
      favorites_.add(value);
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void addFavorites(
        int index, net.iGap.proto.ProtoGlobal.Favorite value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFavoritesIsMutable();
      favorites_.add(index, value);
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void addFavorites(
        net.iGap.proto.ProtoGlobal.Favorite.Builder builderForValue) {
      ensureFavoritesIsMutable();
      favorites_.add(builderForValue.build());
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void addFavorites(
        int index, net.iGap.proto.ProtoGlobal.Favorite.Builder builderForValue) {
      ensureFavoritesIsMutable();
      favorites_.add(index, builderForValue.build());
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void addAllFavorites(
        java.lang.Iterable<? extends net.iGap.proto.ProtoGlobal.Favorite> values) {
      ensureFavoritesIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, favorites_);
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void clearFavorites() {
      favorites_ = emptyProtobufList();
    }
    /**
     * <code>repeated .proto.Favorite favorites = 2;</code>
     */
    private void removeFavorites(int index) {
      ensureFavoritesIsMutable();
      favorites_.remove(index);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      for (int i = 0; i < favorites_.size(); i++) {
        output.writeMessage(2, favorites_.get(i));
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
      for (int i = 0; i < favorites_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, favorites_.get(i));
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientGetFavoriteMenuResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientGetFavoriteMenuResponse)
        net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse.newBuilder()
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
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public java.util.List<net.iGap.proto.ProtoGlobal.Favorite> getFavoritesList() {
        return java.util.Collections.unmodifiableList(
            instance.getFavoritesList());
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public int getFavoritesCount() {
        return instance.getFavoritesCount();
      }/**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public net.iGap.proto.ProtoGlobal.Favorite getFavorites(int index) {
        return instance.getFavorites(index);
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder setFavorites(
          int index, net.iGap.proto.ProtoGlobal.Favorite value) {
        copyOnWrite();
        instance.setFavorites(index, value);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder setFavorites(
          int index, net.iGap.proto.ProtoGlobal.Favorite.Builder builderForValue) {
        copyOnWrite();
        instance.setFavorites(index, builderForValue);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder addFavorites(net.iGap.proto.ProtoGlobal.Favorite value) {
        copyOnWrite();
        instance.addFavorites(value);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder addFavorites(
          int index, net.iGap.proto.ProtoGlobal.Favorite value) {
        copyOnWrite();
        instance.addFavorites(index, value);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder addFavorites(
          net.iGap.proto.ProtoGlobal.Favorite.Builder builderForValue) {
        copyOnWrite();
        instance.addFavorites(builderForValue);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder addFavorites(
          int index, net.iGap.proto.ProtoGlobal.Favorite.Builder builderForValue) {
        copyOnWrite();
        instance.addFavorites(index, builderForValue);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder addAllFavorites(
          java.lang.Iterable<? extends net.iGap.proto.ProtoGlobal.Favorite> values) {
        copyOnWrite();
        instance.addAllFavorites(values);
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder clearFavorites() {
        copyOnWrite();
        instance.clearFavorites();
        return this;
      }
      /**
       * <code>repeated .proto.Favorite favorites = 2;</code>
       */
      public Builder removeFavorites(int index) {
        copyOnWrite();
        instance.removeFavorites(index);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientGetFavoriteMenuResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          favorites_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse other = (net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          favorites_= visitor.visitList(favorites_, other.favorites_);
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
                  if (!favorites_.isModifiable()) {
                    favorites_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(favorites_);
                  }
                  favorites_.add(
                      input.readMessage(net.iGap.proto.ProtoGlobal.Favorite.parser(), extensionRegistry));
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientGetFavoriteMenuResponse)
    private static final net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientGetFavoriteMenuResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientGetFavoriteMenu.ClientGetFavoriteMenuResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientGetFavoriteMenuResponse> PARSER;

    public static com.google.protobuf.Parser<ClientGetFavoriteMenuResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
