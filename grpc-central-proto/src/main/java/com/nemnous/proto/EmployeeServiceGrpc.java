package com.nemnous.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Define the service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: employees.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nemnous.proto.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nemnous.proto.GetEmployeeByIdRequest,
      com.nemnous.proto.Employee> getGetEmployeeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeById",
      requestType = com.nemnous.proto.GetEmployeeByIdRequest.class,
      responseType = com.nemnous.proto.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nemnous.proto.GetEmployeeByIdRequest,
      com.nemnous.proto.Employee> getGetEmployeeByIdMethod() {
    io.grpc.MethodDescriptor<com.nemnous.proto.GetEmployeeByIdRequest, com.nemnous.proto.Employee> getGetEmployeeByIdMethod;
    if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeByIdMethod = getGetEmployeeByIdMethod = 
              io.grpc.MethodDescriptor.<com.nemnous.proto.GetEmployeeByIdRequest, com.nemnous.proto.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.nemnous.proto.EmployeeService", "getEmployeeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nemnous.proto.GetEmployeeByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nemnous.proto.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeById"))
                  .build();
          }
        }
     }
     return getGetEmployeeByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to get an employee by ID
     * </pre>
     */
    public void getEmployeeById(com.nemnous.proto.GetEmployeeByIdRequest request,
        io.grpc.stub.StreamObserver<com.nemnous.proto.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeeByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nemnous.proto.GetEmployeeByIdRequest,
                com.nemnous.proto.Employee>(
                  this, METHODID_GET_EMPLOYEE_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get an employee by ID
     * </pre>
     */
    public void getEmployeeById(com.nemnous.proto.GetEmployeeByIdRequest request,
        io.grpc.stub.StreamObserver<com.nemnous.proto.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get an employee by ID
     * </pre>
     */
    public com.nemnous.proto.Employee getEmployeeById(com.nemnous.proto.GetEmployeeByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmployeeByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get an employee by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nemnous.proto.Employee> getEmployeeById(
        com.nemnous.proto.GetEmployeeByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_BY_ID:
          serviceImpl.getEmployeeById((com.nemnous.proto.GetEmployeeByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.nemnous.proto.Employee>) responseObserver);
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

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nemnous.proto.Employees.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
