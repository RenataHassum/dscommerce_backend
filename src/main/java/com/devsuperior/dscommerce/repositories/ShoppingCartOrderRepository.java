package com.devsuperior.dscommerce.repositories;


import com.devsuperior.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartOrderRepository extends JpaRepository<Order, Long> {

}
