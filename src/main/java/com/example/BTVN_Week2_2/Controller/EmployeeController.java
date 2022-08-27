package com.example.BTVN_Week2_2.Controller;

import com.example.BTVN_Week2_2.Service.DepartmentService;
import com.example.BTVN_Week2_2.Service.EmployeeService;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import com.example.BTVN_Week2_2.entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    DepartmentService departmentService;

    @GetMapping("")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") long id)
    {
        return employeeService.getEmployeeById(id);
    }
    //Ham nay con loi 
    @PostMapping("/create")
    public EmployeeDTO CreateNewEmployee(@RequestBody EmployeeDTO employee)
    {

            return employeeService.CreateEmployee(employee);
    }
    @PutMapping("/{id}")
    public void UpdateEmployee(Employee employee,@PathVariable("id") long id)
    {
        employeeService.UpdateEmployee(employee,id);
    }
    @DeleteMapping("/{id}")
    public void DeleteEmployee(@PathVariable("id") long id)
    {
        employeeService.DeleteEmployee(id);
    }

}
