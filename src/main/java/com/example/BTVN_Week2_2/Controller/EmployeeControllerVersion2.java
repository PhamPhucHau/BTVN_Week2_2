package com.example.BTVN_Week2_2.Controller;

import com.example.BTVN_Week2_2.Service.EmployeeService;
import com.example.BTVN_Week2_2.entity.DTO.DepartmentDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTOV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeControllerVersion2 {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTOV2> getEmployeeByid(@PathVariable("id") long id)
    {
        return ResponseEntity.ok(employeeService.findEmployeeById(id));
    }
}
