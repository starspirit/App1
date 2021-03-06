package com.ilab.service;

import com.ilab.object.Employee;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Xiang on 4/8/2014.
 * 这里配置@Transactional用处是让spring的事务管理器接管该Service的事务
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

//    EmployeeDao employeeDao = new EmployeeDaoImpl();
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

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
