package com.springjpauser.hibernate.Service;

import com.springjpauser.hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepositor extends JpaRepository<User, Long>{

}