package com.nemnous.client.service.impl;

import com.nemnous.client.dto.EmployeeDto;
import com.nemnous.client.service.EmployeeClientService;
import com.nemnous.proto.Employee;
import com.nemnous.proto.EmployeeServiceGrpc;
import com.nemnous.proto.GetEmployeeByIdRequest;
import lombok.extern.log4j.Log4j2;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EmployeeClientServiceImpl implements EmployeeClientService {

    @GrpcClient("grpcServer")
    private EmployeeServiceGrpc.EmployeeServiceBlockingStub employeeServiceBlockingStub;

    @Override
    public EmployeeDto getEmployeeById(Integer employeeId) {
        log.info("Calling employee service blocking stub");
        Employee employee = employeeServiceBlockingStub.getEmployeeById(
                GetEmployeeByIdRequest.newBuilder().setId(employeeId).build());
        log.info("Response from employee blocking stub: " + employee);
        return new EmployeeDto(employee.getId(), employee.getName(), employee.getDepartment());
    }
}
