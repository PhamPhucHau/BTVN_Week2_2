package com.example.BTVN_Week2_2.Service;

import com.example.BTVN_Week2_2.entity.DTO.DepartmentDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import  com.example.BTVN_Week2_2.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {

    public List<Department> getAllDepartment();
    public Department CreateDepartment(Department department);
    public Optional<Department> findDepartmentById(long department_id);
    public String UpdateDepartment(Department department,long id);
    public String DeleteDepartment(long id);
    public void InitDepartment();
    public DepartmentDTO getDepartmentById(long department_id);


}
