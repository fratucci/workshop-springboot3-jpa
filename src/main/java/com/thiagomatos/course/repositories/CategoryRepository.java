package com.thiagomatos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomatos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
