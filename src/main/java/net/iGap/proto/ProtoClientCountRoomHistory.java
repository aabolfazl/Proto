// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientCountRoomHistory.proto

package net.iGap.proto;

public final class ProtoClientCountRoomHistory {
  private ProtoClientCountRoomHistory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientCountRoomHistoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientCountRoomHistory)
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
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();
  }
  /**
   * Protobuf type {@code proto.ClientCountRoomHistory}
   */
  public  static final class ClientCountRoomHistory extends
      com.google.protobuf.GeneratedMessageLite<
          ClientCountRoomHistory, ClientCountRoomHistory.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientCountRoomHistory)
      ClientCountRoomHistoryOrBuilder {
    private ClientCountRoomHistory() {
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

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
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
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientCountRoomHistory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientCountRoomHistory)
        net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryOrBuilder {
      // Construct using net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory.newBuilder()
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
       * <code>optional uint64 room_id = 2;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientCountRoomHistory)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory();
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
          net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory other = (net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
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

                  roomId_ = input.readUInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientCountRoomHistory)
    private static final net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientCountRoomHistory();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistory getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientCountRoomHistory> PARSER;

    public static com.google.protobuf.Parser<ClientCountRoomHistory> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ClientCountRoomHistoryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientCountRoomHistoryResponse)
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
     * <code>optional uint32 media = 2;</code>
     */
    int getMedia();

    /**
     * <code>optional uint32 image = 3;</code>
     */
    int getImage();

    /**
     * <code>optional uint32 video = 4;</code>
     */
    int getVideo();

    /**
     * <code>optional uint32 audio = 5;</code>
     */
    int getAudio();

    /**
     * <code>optional uint32 voice = 6;</code>
     */
    int getVoice();

    /**
     * <code>optional uint32 gif = 7;</code>
     */
    int getGif();

    /**
     * <code>optional uint32 file = 8;</code>
     */
    int getFile();

    /**
     * <code>optional uint32 url = 9;</code>
     */
    int getUrl();
  }
  /**
   * Protobuf type {@code proto.ClientCountRoomHistoryResponse}
   */
  public  static final class ClientCountRoomHistoryResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ClientCountRoomHistoryResponse, ClientCountRoomHistoryResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientCountRoomHistoryResponse)
      ClientCountRoomHistoryResponseOrBuilder {
    private ClientCountRoomHistoryResponse() {
    }
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

    public static final int MEDIA_FIELD_NUMBER = 2;
    private int media_;
    /**
     * <code>optional uint32 media = 2;</code>
     */
    public int getMedia() {
      return media_;
    }
    /**
     * <code>optional uint32 media = 2;</code>
     */
    private void setMedia(int value) {
      
      media_ = value;
    }
    /**
     * <code>optional uint32 media = 2;</code>
     */
    private void clearMedia() {
      
      media_ = 0;
    }

    public static final int IMAGE_FIELD_NUMBER = 3;
    private int image_;
    /**
     * <code>optional uint32 image = 3;</code>
     */
    public int getImage() {
      return image_;
    }
    /**
     * <code>optional uint32 image = 3;</code>
     */
    private void setImage(int value) {
      
      image_ = value;
    }
    /**
     * <code>optional uint32 image = 3;</code>
     */
    private void clearImage() {
      
      image_ = 0;
    }

    public static final int VIDEO_FIELD_NUMBER = 4;
    private int video_;
    /**
     * <code>optional uint32 video = 4;</code>
     */
    public int getVideo() {
      return video_;
    }
    /**
     * <code>optional uint32 video = 4;</code>
     */
    private void setVideo(int value) {
      
      video_ = value;
    }
    /**
     * <code>optional uint32 video = 4;</code>
     */
    private void clearVideo() {
      
      video_ = 0;
    }

    public static final int AUDIO_FIELD_NUMBER = 5;
    private int audio_;
    /**
     * <code>optional uint32 audio = 5;</code>
     */
    public int getAudio() {
      return audio_;
    }
    /**
     * <code>optional uint32 audio = 5;</code>
     */
    private void setAudio(int value) {
      
      audio_ = value;
    }
    /**
     * <code>optional uint32 audio = 5;</code>
     */
    private void clearAudio() {
      
      audio_ = 0;
    }

    public static final int VOICE_FIELD_NUMBER = 6;
    private int voice_;
    /**
     * <code>optional uint32 voice = 6;</code>
     */
    public int getVoice() {
      return voice_;
    }
    /**
     * <code>optional uint32 voice = 6;</code>
     */
    private void setVoice(int value) {
      
      voice_ = value;
    }
    /**
     * <code>optional uint32 voice = 6;</code>
     */
    private void clearVoice() {
      
      voice_ = 0;
    }

    public static final int GIF_FIELD_NUMBER = 7;
    private int gif_;
    /**
     * <code>optional uint32 gif = 7;</code>
     */
    public int getGif() {
      return gif_;
    }
    /**
     * <code>optional uint32 gif = 7;</code>
     */
    private void setGif(int value) {
      
      gif_ = value;
    }
    /**
     * <code>optional uint32 gif = 7;</code>
     */
    private void clearGif() {
      
      gif_ = 0;
    }

    public static final int FILE_FIELD_NUMBER = 8;
    private int file_;
    /**
     * <code>optional uint32 file = 8;</code>
     */
    public int getFile() {
      return file_;
    }
    /**
     * <code>optional uint32 file = 8;</code>
     */
    private void setFile(int value) {
      
      file_ = value;
    }
    /**
     * <code>optional uint32 file = 8;</code>
     */
    private void clearFile() {
      
      file_ = 0;
    }

    public static final int URL_FIELD_NUMBER = 9;
    private int url_;
    /**
     * <code>optional uint32 url = 9;</code>
     */
    public int getUrl() {
      return url_;
    }
    /**
     * <code>optional uint32 url = 9;</code>
     */
    private void setUrl(int value) {
      
      url_ = value;
    }
    /**
     * <code>optional uint32 url = 9;</code>
     */
    private void clearUrl() {
      
      url_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (media_ != 0) {
        output.writeUInt32(2, media_);
      }
      if (image_ != 0) {
        output.writeUInt32(3, image_);
      }
      if (video_ != 0) {
        output.writeUInt32(4, video_);
      }
      if (audio_ != 0) {
        output.writeUInt32(5, audio_);
      }
      if (voice_ != 0) {
        output.writeUInt32(6, voice_);
      }
      if (gif_ != 0) {
        output.writeUInt32(7, gif_);
      }
      if (file_ != 0) {
        output.writeUInt32(8, file_);
      }
      if (url_ != 0) {
        output.writeUInt32(9, url_);
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
      if (media_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, media_);
      }
      if (image_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, image_);
      }
      if (video_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, video_);
      }
      if (audio_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, audio_);
      }
      if (voice_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, voice_);
      }
      if (gif_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gif_);
      }
      if (file_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, file_);
      }
      if (url_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, url_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientCountRoomHistoryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientCountRoomHistoryResponse)
        net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse.newBuilder()
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
       * <code>optional uint32 media = 2;</code>
       */
      public int getMedia() {
        return instance.getMedia();
      }
      /**
       * <code>optional uint32 media = 2;</code>
       */
      public Builder setMedia(int value) {
        copyOnWrite();
        instance.setMedia(value);
        return this;
      }
      /**
       * <code>optional uint32 media = 2;</code>
       */
      public Builder clearMedia() {
        copyOnWrite();
        instance.clearMedia();
        return this;
      }

      /**
       * <code>optional uint32 image = 3;</code>
       */
      public int getImage() {
        return instance.getImage();
      }
      /**
       * <code>optional uint32 image = 3;</code>
       */
      public Builder setImage(int value) {
        copyOnWrite();
        instance.setImage(value);
        return this;
      }
      /**
       * <code>optional uint32 image = 3;</code>
       */
      public Builder clearImage() {
        copyOnWrite();
        instance.clearImage();
        return this;
      }

      /**
       * <code>optional uint32 video = 4;</code>
       */
      public int getVideo() {
        return instance.getVideo();
      }
      /**
       * <code>optional uint32 video = 4;</code>
       */
      public Builder setVideo(int value) {
        copyOnWrite();
        instance.setVideo(value);
        return this;
      }
      /**
       * <code>optional uint32 video = 4;</code>
       */
      public Builder clearVideo() {
        copyOnWrite();
        instance.clearVideo();
        return this;
      }

      /**
       * <code>optional uint32 audio = 5;</code>
       */
      public int getAudio() {
        return instance.getAudio();
      }
      /**
       * <code>optional uint32 audio = 5;</code>
       */
      public Builder setAudio(int value) {
        copyOnWrite();
        instance.setAudio(value);
        return this;
      }
      /**
       * <code>optional uint32 audio = 5;</code>
       */
      public Builder clearAudio() {
        copyOnWrite();
        instance.clearAudio();
        return this;
      }

      /**
       * <code>optional uint32 voice = 6;</code>
       */
      public int getVoice() {
        return instance.getVoice();
      }
      /**
       * <code>optional uint32 voice = 6;</code>
       */
      public Builder setVoice(int value) {
        copyOnWrite();
        instance.setVoice(value);
        return this;
      }
      /**
       * <code>optional uint32 voice = 6;</code>
       */
      public Builder clearVoice() {
        copyOnWrite();
        instance.clearVoice();
        return this;
      }

      /**
       * <code>optional uint32 gif = 7;</code>
       */
      public int getGif() {
        return instance.getGif();
      }
      /**
       * <code>optional uint32 gif = 7;</code>
       */
      public Builder setGif(int value) {
        copyOnWrite();
        instance.setGif(value);
        return this;
      }
      /**
       * <code>optional uint32 gif = 7;</code>
       */
      public Builder clearGif() {
        copyOnWrite();
        instance.clearGif();
        return this;
      }

      /**
       * <code>optional uint32 file = 8;</code>
       */
      public int getFile() {
        return instance.getFile();
      }
      /**
       * <code>optional uint32 file = 8;</code>
       */
      public Builder setFile(int value) {
        copyOnWrite();
        instance.setFile(value);
        return this;
      }
      /**
       * <code>optional uint32 file = 8;</code>
       */
      public Builder clearFile() {
        copyOnWrite();
        instance.clearFile();
        return this;
      }

      /**
       * <code>optional uint32 url = 9;</code>
       */
      public int getUrl() {
        return instance.getUrl();
      }
      /**
       * <code>optional uint32 url = 9;</code>
       */
      public Builder setUrl(int value) {
        copyOnWrite();
        instance.setUrl(value);
        return this;
      }
      /**
       * <code>optional uint32 url = 9;</code>
       */
      public Builder clearUrl() {
        copyOnWrite();
        instance.clearUrl();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientCountRoomHistoryResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse();
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
          net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse other = (net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          media_ = visitor.visitInt(media_ != 0, media_,
              other.media_ != 0, other.media_);
          image_ = visitor.visitInt(image_ != 0, image_,
              other.image_ != 0, other.image_);
          video_ = visitor.visitInt(video_ != 0, video_,
              other.video_ != 0, other.video_);
          audio_ = visitor.visitInt(audio_ != 0, audio_,
              other.audio_ != 0, other.audio_);
          voice_ = visitor.visitInt(voice_ != 0, voice_,
              other.voice_ != 0, other.voice_);
          gif_ = visitor.visitInt(gif_ != 0, gif_,
              other.gif_ != 0, other.gif_);
          file_ = visitor.visitInt(file_ != 0, file_,
              other.file_ != 0, other.file_);
          url_ = visitor.visitInt(url_ != 0, url_,
              other.url_ != 0, other.url_);
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
                case 16: {

                  media_ = input.readUInt32();
                  break;
                }
                case 24: {

                  image_ = input.readUInt32();
                  break;
                }
                case 32: {

                  video_ = input.readUInt32();
                  break;
                }
                case 40: {

                  audio_ = input.readUInt32();
                  break;
                }
                case 48: {

                  voice_ = input.readUInt32();
                  break;
                }
                case 56: {

                  gif_ = input.readUInt32();
                  break;
                }
                case 64: {

                  file_ = input.readUInt32();
                  break;
                }
                case 72: {

                  url_ = input.readUInt32();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientCountRoomHistoryResponse)
    private static final net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientCountRoomHistoryResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientCountRoomHistory.ClientCountRoomHistoryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientCountRoomHistoryResponse> PARSER;

    public static com.google.protobuf.Parser<ClientCountRoomHistoryResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
