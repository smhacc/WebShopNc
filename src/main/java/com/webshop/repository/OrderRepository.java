/*
 * Copyright
 */
package com.webshop.repository;

import com.webshop.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Order repository.
 */

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
