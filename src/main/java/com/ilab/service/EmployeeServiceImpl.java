package com.ilab.service;

import com.ilab.object.Employee;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Xiang on 4/8/2014.
 */
public class EmployeeServiceImpl implements EmployeeService {

//    EmployeeDao employeeDao = new EmployeeDaoImpl();
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
//        employeeDao.save(employee);
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public void delete(Serializable id) {
//        employeeDao.delete(id);
    }

    @Override
    public void update(Employee employee) {
//        employeeDao.update(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
//        List<Employee> employees = employeeDao.getAllEmployees();
//        return employees;
        return null;
    }
}
