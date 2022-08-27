package com.example.BTVN_Week2_2.Controller;

import com.example.BTVN_Week2_2.Service.DepartmentService;
import com.example.BTVN_Week2_2.entity.DTO.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/department")
public class DepartmentControllerVersion2 {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDTO> getDepartmentByid(@PathVariable("id") long id)
    {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

}
