package com.example.BTVN_Week2_2.entity.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeDTOV2 {
    private long employeeId;
    private String name;
    private Date birthDate;
    private Boolean gender;
    private Long departmentId;
    private String deptName;
    private String description;
}
