// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SignalingLeave.proto

package net.iGap.proto;

public final class ProtoSignalingLeave {
  private ProtoSignalingLeave() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface SignalingLeaveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.SignalingLeave)
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
   * Protobuf type {@code proto.SignalingLeave}
   */
  public  static final class SignalingLeave extends
      com.google.protobuf.GeneratedMessageLite<
          SignalingLeave, SignalingLeave.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.SignalingLeave)
      SignalingLeaveOrBuilder {
    private SignalingLeave() {
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

    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoSignalingLeave.SignalingLeave prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.SignalingLeave}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoSignalingLeave.SignalingLeave, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.SignalingLeave)
        net.iGap.proto.ProtoSignalingLeave.SignalingLeaveOrBuilder {
      // Construct using net.iGap.proto.ProtoSignalingLeave.SignalingLeave.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:proto.SignalingLeave)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoSignalingLeave.SignalingLeave();
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
          net.iGap.proto.ProtoSignalingLeave.SignalingLeave other = (net.iGap.proto.ProtoSignalingLeave.SignalingLeave) arg1;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoSignalingLeave.SignalingLeave.class) {
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


    // @@protoc_insertion_point(class_scope:proto.SignalingLeave)
    private static final net.iGap.proto.ProtoSignalingLeave.SignalingLeave DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SignalingLeave();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeave getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<SignalingLeave> PARSER;

    public static com.google.protobuf.Parser<SignalingLeave> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface SignalingLeaveResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.SignalingLeaveResponse)
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
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    int getTypeValue();
    /**
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type getType();
  }
  /**
   * Protobuf type {@code proto.SignalingLeaveResponse}
   */
  public  static final class SignalingLeaveResponse extends
      com.google.protobuf.GeneratedMessageLite<
          SignalingLeaveResponse, SignalingLeaveResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.SignalingLeaveResponse)
      SignalingLeaveResponseOrBuilder {
    private SignalingLeaveResponse() {
    }
    /**
     * Protobuf enum {@code proto.SignalingLeaveResponse.Type}
     */
    public enum Type
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>MISSED = 0;</code>
       */
      MISSED(0),
      /**
       * <code>REJECTED = 1;</code>
       */
      REJECTED(1),
      /**
       * <code>ACCEPTED = 2;</code>
       */
      ACCEPTED(2),
      /**
       * <code>NOT_ANSWERED = 3;</code>
       */
      NOT_ANSWERED(3),
      /**
       * <code>UNAVAILABLE = 4;</code>
       */
      UNAVAILABLE(4),
      /**
       * <code>DISCONNECTED = 5;</code>
       */
      DISCONNECTED(5),
      /**
       * <code>FINISHED = 6;</code>
       */
      FINISHED(6),
      /**
       * <code>TOO_LONG = 7;</code>
       */
      TOO_LONG(7),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>MISSED = 0;</code>
       */
      public static final int MISSED_VALUE = 0;
      /**
       * <code>REJECTED = 1;</code>
       */
      public static final int REJECTED_VALUE = 1;
      /**
       * <code>ACCEPTED = 2;</code>
       */
      public static final int ACCEPTED_VALUE = 2;
      /**
       * <code>NOT_ANSWERED = 3;</code>
       */
      public static final int NOT_ANSWERED_VALUE = 3;
      /**
       * <code>UNAVAILABLE = 4;</code>
       */
      public static final int UNAVAILABLE_VALUE = 4;
      /**
       * <code>DISCONNECTED = 5;</code>
       */
      public static final int DISCONNECTED_VALUE = 5;
      /**
       * <code>FINISHED = 6;</code>
       */
      public static final int FINISHED_VALUE = 6;
      /**
       * <code>TOO_LONG = 7;</code>
       */
      public static final int TOO_LONG_VALUE = 7;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      public static Type forNumber(int value) {
        switch (value) {
          case 0: return MISSED;
          case 1: return REJECTED;
          case 2: return ACCEPTED;
          case 3: return NOT_ANSWERED;
          case 4: return UNAVAILABLE;
          case 5: return DISCONNECTED;
          case 6: return FINISHED;
          case 7: return TOO_LONG;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:proto.SignalingLeaveResponse.Type)
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

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    public net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type getType() {
      net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type result = net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type.forNumber(type_);
      return result == null ? net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    private void setTypeValue(int value) {
        type_ = value;
    }
    /**
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    private void setType(net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
    }
    /**
     * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
     */
    private void clearType() {
      
      type_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (type_ != net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type.MISSED.getNumber()) {
        output.writeEnum(2, type_);
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
      if (type_ != net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type.MISSED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.SignalingLeaveResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.SignalingLeaveResponse)
        net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.newBuilder()
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
       * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
       */
      public int getTypeValue() {
        return instance.getTypeValue();
      }
      /**
       * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
       */
      public Builder setTypeValue(int value) {
        copyOnWrite();
        instance.setTypeValue(value);
        return this;
      }
      /**
       * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
       */
      public net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type getType() {
        return instance.getType();
      }
      /**
       * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
       */
      public Builder setType(net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.Type value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <code>optional .proto.SignalingLeaveResponse.Type type = 2;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.SignalingLeaveResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse();
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
          net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse other = (net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
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
                  int rawValue = input.readEnum();

                  type_ = rawValue;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.SignalingLeaveResponse)
    private static final net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SignalingLeaveResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoSignalingLeave.SignalingLeaveResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<SignalingLeaveResponse> PARSER;

    public static com.google.protobuf.Parser<SignalingLeaveResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
