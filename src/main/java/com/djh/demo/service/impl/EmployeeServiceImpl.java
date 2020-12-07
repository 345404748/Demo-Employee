package com.djh.demo.service.impl;

import com.djh.demo.bean.Employee;
import com.djh.demo.dao.EmployeeDao;
import com.djh.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 * 实现类
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> selectById(Integer id) {
        return this.employeeDao.selectById(id);
}

    @Override
    public void saveEmployee(String employee_name, String employee_age, Integer department_id) {
            employeeDao.saveEmployee(employee_name,employee_age,department_id);
    }

    @Override
    public void deleteEmployee(Integer employee_id) {
        employeeDao.deleteEmployee(employee_id);
    }

    @Override
    public void updateEmployee(Integer employee_id, String employee_name, Integer employee_age ,Integer department_id ) {
            employeeDao.updateEmployee(employee_id,employee_name,employee_age,department_id );
    }

    @Override
    public Employee selectoneid(Integer employee_id) {
        return this.employeeDao.selectoneid(employee_id);
    }

    @Override
    public List<Employee> selectallid() {
        return this.employeeDao.selectallid();
    }

}
