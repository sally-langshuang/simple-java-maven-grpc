package com.olivia.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: cpu.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CpuServiceGrpc {

  private CpuServiceGrpc() {}

  public static final String SERVICE_NAME = "cpu.CpuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.olivia.proto.Empty,
      com.olivia.proto.Cpu> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.olivia.proto.Empty.class,
      responseType = com.olivia.proto.Cpu.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.olivia.proto.Empty,
      com.olivia.proto.Cpu> getPingMethod() {
    io.grpc.MethodDescriptor<com.olivia.proto.Empty, com.olivia.proto.Cpu> getPingMethod;
    if ((getPingMethod = CpuServiceGrpc.getPingMethod) == null) {
      synchronized (CpuServiceGrpc.class) {
        if ((getPingMethod = CpuServiceGrpc.getPingMethod) == null) {
          CpuServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.olivia.proto.Empty, com.olivia.proto.Cpu>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.olivia.proto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.olivia.proto.Cpu.getDefaultInstance()))
              .setSchemaDescriptor(new CpuServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CpuServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CpuServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CpuServiceStub>() {
        @java.lang.Override
        public CpuServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CpuServiceStub(channel, callOptions);
        }
      };
    return CpuServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CpuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CpuServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CpuServiceBlockingStub>() {
        @java.lang.Override
        public CpuServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CpuServiceBlockingStub(channel, callOptions);
        }
      };
    return CpuServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CpuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CpuServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CpuServiceFutureStub>() {
        @java.lang.Override
        public CpuServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CpuServiceFutureStub(channel, callOptions);
        }
      };
    return CpuServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CpuServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.olivia.proto.Empty request,
        io.grpc.stub.StreamObserver<com.olivia.proto.Cpu> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.olivia.proto.Empty,
                com.olivia.proto.Cpu>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class CpuServiceStub extends io.grpc.stub.AbstractAsyncStub<CpuServiceStub> {
    private CpuServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CpuServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CpuServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.olivia.proto.Empty request,
        io.grpc.stub.StreamObserver<com.olivia.proto.Cpu> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CpuServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CpuServiceBlockingStub> {
    private CpuServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CpuServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CpuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.olivia.proto.Cpu ping(com.olivia.proto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CpuServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CpuServiceFutureStub> {
    private CpuServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CpuServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CpuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.olivia.proto.Cpu> ping(
        com.olivia.proto.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CpuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CpuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.olivia.proto.Empty) request,
              (io.grpc.stub.StreamObserver<com.olivia.proto.Cpu>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CpuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CpuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.olivia.proto.Computer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CpuService");
    }
  }

  private static final class CpuServiceFileDescriptorSupplier
      extends CpuServiceBaseDescriptorSupplier {
    CpuServiceFileDescriptorSupplier() {}
  }

  private static final class CpuServiceMethodDescriptorSupplier
      extends CpuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CpuServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CpuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CpuServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
