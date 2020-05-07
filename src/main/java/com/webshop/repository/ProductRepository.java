/*
 * Copyright
 */
package com.webshop.repository;


import com.webshop.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Product repository.
 */

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
