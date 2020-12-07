package com.djh.demo.service;
import com.djh.demo.bean.Employee;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 */

public interface EmployeeService {

    List<Employee> selectById( Integer id);

    void saveEmployee ( String employee_name,String employee_age,Integer department_id);

    void deleteEmployee(Integer employee_id);

    void updateEmployee( Integer employee_id,  String employee_name,  Integer employee_age,Integer department_id );

    Employee selectoneid(Integer employee_id);

    List<Employee> selectallid();
}
