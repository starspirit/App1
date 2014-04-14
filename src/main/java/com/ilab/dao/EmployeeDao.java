package com.ilab.dao;

import com.ilab.object.Employee;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Xiang on 4/8/2014.
 */
public interface EmployeeDao {

    public void save(Employee employee);

    public void delete(Serializable id);

    public void update(Employee employee);

    public List<Employee> getAllEmployees();
}
