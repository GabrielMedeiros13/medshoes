package com.medshoes.springbootapi.repository;

import com.medshoes.springbootapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {

    User findByUsername( String username);

    User findByName(String name);
}
