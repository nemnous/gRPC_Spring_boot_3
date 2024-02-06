package com.nemnous.grpcserver.dao;

import com.nemnous.grpcserver.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    EmployeeEntity findEmployeeEntityById(Integer employeeId);

}
