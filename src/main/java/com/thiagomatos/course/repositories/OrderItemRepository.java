package com.thiagomatos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomatos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
