package com.thiagomatos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomatos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
