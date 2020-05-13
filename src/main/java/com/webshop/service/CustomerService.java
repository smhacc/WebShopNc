package com.webshop.service;

import com.webshop.model.CustomerEntity;
import com.webshop.model.OrderEntity;
import com.webshop.repository.CustomerRepository;
import com.webshop.repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> listAll() {
        return customerRepository.findAll();
    }

    public void save(CustomerEntity product) {
        customerRepository.save(product);
    }

    public CustomerEntity get(long id) {
        return customerRepository.findById(id).get();
    }

    public void delete(long id) {customerRepository.deleteById(id); }
}