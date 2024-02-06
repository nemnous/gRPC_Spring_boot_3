package com.nemnous.client.service.impl;

import com.nemnous.client.service.EmployeeClientService;
import com.nemnous.proto.Employee;
import com.nemnous.proto.EmployeeServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeClientServiceImpl implements EmployeeClientService {

    @Gr
    private EmployeeServiceGrpc.EmployeeServiceBlockingStub employeeServiceBlockingStub;

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return null;
    }
}
