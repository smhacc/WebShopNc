/*
 * Copyright
 */
package com.webshop.repository;

import java.util.List;
import com.webshop.model.DeliveryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Delivery repository.
 */

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryEntity, Long> {
//    List<DeliveryEntity> findByUserName(String user);

}
