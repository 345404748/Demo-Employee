package com.djh.demo.dao;

import com.djh.demo.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 */
@Mapper
public interface EmployeeDao {
    Employee selectid(Integer id);

    List<Employee> selectById( Integer id);

    void saveEmployee(@Param("employee_name") String employee_name,@Param("employee_age") String employee_age,@Param("department_id") Integer department_id);

    void deleteEmployee(Integer employee_id);

    Employee selectoneid(Integer employee_id);

    List<Employee> selectallid();

    void updateEmployee(@Param("employee_id") Integer employee_id,@Param("employee_name") String employee_name,@Param("employee_age") Integer employee_age,@Param("department_id") Integer department_id );
}
