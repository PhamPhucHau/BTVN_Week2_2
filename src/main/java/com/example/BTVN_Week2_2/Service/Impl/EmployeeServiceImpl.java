package com.example.BTVN_Week2_2.Service.Impl;

import com.example.BTVN_Week2_2.Repository.DepartmentRepository;
import com.example.BTVN_Week2_2.Repository.EmpoyeeRepository;
import com.example.BTVN_Week2_2.Repository.MyBatisRepository;
import com.example.BTVN_Week2_2.Service.EmployeeService;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTOV2;
import com.example.BTVN_Week2_2.entity.Department;
import com.example.BTVN_Week2_2.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;
import org.modelmapper.ModelMapper;
import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmpoyeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    @Resource
    MyBatisRepository myBatisRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public EmployeeDTO CreateEmployee(EmployeeDTO employeeDTO)
    {
        Employee employee=modelMapper.map(employeeDTO,Employee.class);
            return  modelMapper.map(employeeRepository.save(employee),EmployeeDTO.class);


    }

    @Override
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Employee> getEmployeeById(long id)
    {
        return employeeRepository.findById(id);
    }
    @Override
    public String UpdateEmployee(Employee employee,long id)
    {
        Optional<Employee> foundedEmployee= employeeRepository.findById(id);
        if(!foundedEmployee.isEmpty())
        {
            employee.setEmployeeId(id);
            employeeRepository.save(employee);
            return "Update success";
        }
        else
        {
            return "Employee is not exist";
        }
    }
    @Override
    public String DeleteEmployee( long id)
    {
        Boolean IsExistDeletedEmployee=employeeRepository.existsById(id);
        if(IsExistDeletedEmployee)
        {
            employeeRepository.deleteById(id);
            return "Delete success";
        }
        else
        {
            return "The Deleted Department is not existed";
        }
    }
    @Override
    public EmployeeDTOV2 findEmployeeById(long employee_id)
    {
        return myBatisRepository.getEmployeeById(employee_id);
    }
}
