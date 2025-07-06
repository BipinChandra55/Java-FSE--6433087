package com.example.ormlearn.service;

import com.example.ormlearn.dao.EmployeeDao;
import com.example.ormlearn.entity.Employee;
import com.example.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public void addEmployeeWithJPA(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void addEmployeeWithHibernate(Employee employee) {
        employeeDao.addEmployee(employee);
    }
}
