package com.djh.demo;


import com.djh.demo.dao.DepartmentDao;
import com.djh.demo.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void contextLoads() {
        System.out.println(employeeDao.selectoneid(41));
    }

}
