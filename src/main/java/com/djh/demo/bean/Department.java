package com.djh.demo.bean;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 */
public class Department {
    private Integer department_id;
    private String department_name;
    private List<Employee> employees;

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", employees=" + employees +
                '}';
    }

}
