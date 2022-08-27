package com.example.BTVN_Week2_2.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="EMPLOYEE")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="employeeId",nullable = false)
    private long employeeId;
    @Column(name="name",length = 64,nullable = false)
    private String name;
    @Temporal(TemporalType.DATE)
    @Column(name="Date_Of_Birth",nullable=false)
    private Date birthDate;
    @Column(name="gender",nullable = false)
    private Boolean gender;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departmentId")
    @EqualsAndHashCode.Exclude
    @JsonBackReference
    private Department department;
    public Employee(String name, Date birthDate, Boolean gender, Department department){
        this.name=name;
        this.birthDate=birthDate;
        this.gender=gender;
        this.department=department;
    }
    public Employee()
    {

    }

}