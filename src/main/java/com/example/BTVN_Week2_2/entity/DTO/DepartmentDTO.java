package com.example.BTVN_Week2_2.entity.DTO;

import com.example.BTVN_Week2_2.entity.Employee;
import lombok.Data;

import java.util.Collection;
@Data
public class DepartmentDTO {
    private long id;
    private String department_name;
    private String description;
    private int NumberOfEmployees;
}
