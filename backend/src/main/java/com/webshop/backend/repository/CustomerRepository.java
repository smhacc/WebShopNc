package com.webshop.backend.repository;

import com.webshop.backend.model.CustomerEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    List<CustomerEntity> findByLogin(String login);
}
