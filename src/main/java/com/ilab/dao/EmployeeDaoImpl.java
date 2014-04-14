package com.ilab.dao;

import com.ilab.object.Employee;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Xiang on 4/8/2014.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}
