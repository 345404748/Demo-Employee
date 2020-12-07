package com.djh.demo.controller;

import com.djh.demo.bean.Department;
import com.djh.demo.bean.Employee;
import com.djh.demo.service.DepartmentService;
import com.djh.demo.service.EmployeeService;
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
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/queryEmpByDept")
    public String queryEmpByDept (ModelMap modelMap,Integer department_id){
        if(department_id == null){
            List<Employee> employees = employeeService.selectallid();
            modelMap.put("employees",employees);
            //全查询
        }else {
            List<Employee> employees = employeeService.selectById(department_id);
            modelMap.put("employees",employees);}

        modelMap.put("department_id",department_id);

        List<Department> departments = departmentService.getall();
        modelMap.put("departments",departments);

        return "admin";
    }
    @GetMapping("/saveEmployee")
    public String saveEmployee(ModelMap modelMap ,String employee_name , String employee_age , Integer department_id){
        employeeService.saveEmployee(employee_name,employee_age,department_id);
        List<Department> departments = departmentService.getall();

        modelMap.put("departments",departments);

        return "admin";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(Integer employee_id){

        employeeService.deleteEmployee(employee_id);

        return "redirect:/admin";
    }
    @GetMapping("/updateEmployee")
    //编辑操作
    public String updateEmployee(ModelMap modelMap,Integer employee_id , String employee_name , Integer employee_age ,Integer department_id ){
        employeeService.updateEmployee(employee_id,employee_name,employee_age,department_id );
        List<Department> departments = departmentService.getall();
        modelMap.put("departments",departments);
        return "redirect:/queryEmpByDept?department_id="+department_id;
    }

    @GetMapping("/update_selectoneid_Employee")
    //进入编辑页面
    public String update_selectoneid_Employee(ModelMap modelMap,Integer employee_id){
        Employee employee = employeeService.selectoneid(employee_id);
        modelMap.put("employee",employee);

        List<Department> departments = departmentService.getall();
        modelMap.put("departments" , departments);

        return "/update";
    }
}
