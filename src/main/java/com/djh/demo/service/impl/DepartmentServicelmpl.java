package com.djh.demo.service.impl;

import com.djh.demo.bean.Department;
import com.djh.demo.dao.DepartmentDao;
import com.djh.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 */
@Service("DepartmentService")
public class DepartmentServicelmpl implements DepartmentService{
    @Autowired
    DepartmentDao departmentDao;


    @Override
    public List<Department> getall() {
        return departmentDao.getall();
    }
}
