package com.nemnous.client.service;

import com.nemnous.client.dto.EmployeeDto;

public interface EmployeeClientService {
    EmployeeDto getEmployeeById(Integer employeeId);
}
