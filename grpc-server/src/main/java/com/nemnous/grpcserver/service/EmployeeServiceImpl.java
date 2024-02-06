package com.nemnous.grpcserver.service;

import com.nemnous.proto.Employee;
import com.nemnous.proto.EmployeeServiceGrpc;
import com.nemnous.proto.GetEmployeeByIdRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
@GrpcService
public class EmployeeServiceImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    @Override
    public void getEmployeeById(GetEmployeeByIdRequest request, StreamObserver<Employee> responseObserver) {
        responseObserver.onNext(Employee.newBuilder().setName("nemnous").setId(1303).build());
        responseObserver.onCompleted();
    }

}
