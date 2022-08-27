package com.example.BTVN_Week2_2.Service.Impl;

import com.example.BTVN_Week2_2.Repository.DepartmentRepository;
import com.example.BTVN_Week2_2.Repository.MyBatisRepository;
import com.example.BTVN_Week2_2.Service.DepartmentService;
import com.example.BTVN_Week2_2.entity.DTO.DepartmentDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import com.example.BTVN_Week2_2.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Resource
    MyBatisRepository myBatisRepository;
    @Override
    public List<Department> getAllDepartment() {
        List<Department> lstDepartment = departmentRepository.findAll().stream().collect(Collectors.toList());
        return lstDepartment;
    }
    @Override
    public Department CreateDepartment(Department department)
    {
        return departmentRepository.save(department);
    }
    @Override
    public Optional<Department> findDepartmentById(long department_id)
    {
        return departmentRepository.findById((department_id));
    }
    @Override
    public String UpdateDepartment(Department department,long id)
    {
        Optional<Department> foundedDepartment= departmentRepository.findById(id);
        if(!foundedDepartment.isEmpty())
        {
            department.setId(id);
            departmentRepository.save(department);
            return "Update success";
        }
        else
        {
            return "Department not exist";
        }

    }
@Override
    public String DeleteDepartment(long id)
    {
        Boolean IsExistDeletedDepartment=departmentRepository.existsById(id);
        if(IsExistDeletedDepartment)
        {
            departmentRepository.deleteById(id);
            return "Delete success";
        }
        else
        {
            return "The Deleted Department is not existed";
        }

    }
    @Override
    public void InitDepartment()
    {
        Department department1=new Department("Produce","Making product");
        departmentRepository.save(department1);
        Department department2=new Department("Security","Protect company");
        departmentRepository.save(department2);
        Department department3=new Department("Managerment","Manage the human resource and money");
        departmentRepository.save(department3);

    }
    public DepartmentDTO getDepartmentById(long department_id)
    {
        return myBatisRepository.getDepartmentById(department_id);
    }

}
