package com.example.BTVN_Week2_2.Repository;
import com.example.BTVN_Week2_2.entity.DTO.DepartmentDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTO;
import com.example.BTVN_Week2_2.entity.DTO.EmployeeDTOV2;
import com.example.BTVN_Week2_2.entity.Department;
import org.apache.ibatis.annotations.*;
@Mapper
public interface MyBatisRepository {
    @Select("SELECT DEPARTMENT.DEPARTMENT_ID,DEPARTMENT_NAME,DESCRIPTION, COUNT(*)  NUMBEROFEMPLOYEE FROM DEPARTMENT JOIN EMPLOYEE ON EMPLOYEE.DEPARTMENT_ID=DEPARTMENT.DEPARTMENT_ID WHERE DEPARTMENT.DEPARTMENT_ID=#{department_id}")
    @Results(value={@Result(property = "id",column = "DEPARTMENT_ID"),@Result(property = "department_name",column = "DEPARTMENT_NAME"),@Result(property = "description",column = "DESCRIPTION"),@Result(property="NumberOfEmployees",column = "NUMBEROFEMPLOYEE")})
    DepartmentDTO getDepartmentById(long department_id);

    @Select("SELECT E.*,DEPARTMENT_NAME,DESCRIPTION FROM EMPLOYEE E JOIN DEPARTMENT D ON E.DEPARTMENT_ID=D.DEPARTMENT_ID WHERE E.EMPLOYEE_ID=#{employee_id} ")
    @Results(value={@Result(property = "employeeId",column = "EMPLOYEE_ID"),@Result(property = "name",column = "NAME"),@Result(property = "birthDate",column = "Date_Of_Birth"),@Result(property ="gender" ,column = "GENDER "),@Result(property = "departmentId", column = "DEPARTMENT_ID"),@Result(property = "department_name", column = "departmentName"),@Result(property = "description", column = "DESCRIPTION")})
    EmployeeDTOV2 getEmployeeById(long employee_id);

}
