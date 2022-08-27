package com.example.BTVN_Week2_2.entity.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeDTO {
    private long employeeId;
    private String name;
    private Date birthDate;
    private Boolean gender;
    private Long departmentId;

    public EmployeeDTO() {
    }
    public EmployeeDTO(long employeeId,String name, Date birthDate,Boolean gender,Long departmentId)
    {
        this.employeeId=employeeId;
        this.name=name;
        this.birthDate=birthDate;
        this.gender=gender;
        this.departmentId=departmentId;
    }
}
