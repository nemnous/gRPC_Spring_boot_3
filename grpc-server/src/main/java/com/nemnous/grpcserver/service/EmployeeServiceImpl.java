package com.nemnous.grpcserver.service;

import com.nemnous.grpcserver.dao.EmployeeRepository;
import com.nemnous.grpcserver.entities.EmployeeEntity;
import com.nemnous.proto.Employee;
import com.nemnous.proto.EmployeeServiceGrpc;
import com.nemnous.proto.GetEmployeeByIdRequest;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Log4j2
public class EmployeeServiceImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void getEmployeeById(GetEmployeeByIdRequest request, StreamObserver<Employee> responseObserver) {
       log.info("Getting employee by id: {}", request);
        EmployeeEntity employeeEntity = employeeRepository.findEmployeeEntityById(request.getId());
        Employee employee = Employee.newBuilder().setName(employeeEntity.getName()).setId(employeeEntity.getId())
                .setDepartment(employeeEntity.getDepartment()).build();
        log.info("Employee details from DB: {}", employee);
        responseObserver.onNext(employee);
        responseObserver.onCompleted();
    }

}
