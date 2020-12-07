package com.djh.demo.controller;

import com.djh.demo.bean.Department;
import com.djh.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 */
@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/admin")
    public String admin(ModelMap modelMap){
        List<Department> departments = departmentService.getall();
        modelMap.put("departments" , departments);
        return "admin";
    }

    @GetMapping("/toadd")
    public String departments(ModelMap modelMap){
        List<Department> departments = departmentService.getall();
        modelMap.put("departments" , departments);
        return "add";
    }
}
