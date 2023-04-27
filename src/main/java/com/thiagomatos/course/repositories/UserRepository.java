package com.thiagomatos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomatos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
