package com.example.ormlearn.dao;

import com.example.ormlearn.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public int addEmployee(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        return (int) session.save(employee);
    }
}
