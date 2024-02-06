package com.nemnous.client.controller;

import com.nemnous.client.dto.EmployeeDto;
import com.nemnous.client.service.EmployeeClientService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employees")
@Log4j2
public class EmployeeClientController {

    private final EmployeeClientService employeeClientService;

    public EmployeeClientController(EmployeeClientService employeeClientService) {
        this.employeeClientService = employeeClientService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Integer employeeId) {
       log.info("Getting Employee by id: {}", employeeId);
        EmployeeDto employee = employeeClientService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
