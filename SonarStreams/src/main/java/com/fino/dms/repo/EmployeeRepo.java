package com.fino.dms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fino.dms.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
