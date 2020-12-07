package com.djh.demo.dao;

import com.djh.demo.bean.Department;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author HP
 * @data 2020-12-04
 */
@Mapper
public interface DepartmentDao {

    List<Department> getall ();

}
