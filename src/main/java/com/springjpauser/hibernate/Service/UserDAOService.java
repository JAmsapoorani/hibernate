package com.springjpauser.hibernate.Service;

import com.springjpauser.hibernate.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository

public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public long insert(User user)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        return user.getId();
    }
}
