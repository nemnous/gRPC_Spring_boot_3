package com.nemnous.client.service;

import com.nemnous.proto.Employee;

public interface EmployeeClientService {
    Employee getEmployeeById(Integer employeeId);
}
