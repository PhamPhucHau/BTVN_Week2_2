package com.example.BTVN_Week2_2.Service;

import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTOV2;
import com.example.BTVN_Week2_2.entity.Employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Optional<Employee> getEmployeeById(long id);
    public EmployeeDTO CreateEmployee(EmployeeDTO employee);

    public String UpdateEmployee(Employee employee,long id);
    public String DeleteEmployee( long id);
    public EmployeeDTOV2 findEmployeeById(long employee_id);

}
