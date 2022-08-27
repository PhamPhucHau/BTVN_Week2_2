package com.example.BTVN_Week2_2.Repository;

import  com.example.BTVN_Week2_2.entity.Department;
import  com.example.BTVN_Week2_2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
