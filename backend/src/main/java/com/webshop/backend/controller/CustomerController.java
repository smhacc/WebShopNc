package com.webshop.backend.controller;

import com.webshop.backend.exception.ResourceNotFoundException;
import com.webshop.backend.model.CustomerEntity;
import com.webshop.backend.repository.CustomerRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/all")
    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("/all")
    public CustomerEntity createCustomer(@Valid @RequestBody CustomerEntity customer) {
        return customerRepository.save(customer);
    }


    @GetMapping("/{id}")
    public CustomerEntity getCustomerById(@PathVariable(value = "id") Long customerId) {
        return customerRepository.findById(customerId)
            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));
    }

    @GetMapping("/{login}")
    public CustomerEntity getCustomerByLogin(@PathVariable(value = "login") String customerLogin) {
        return customerRepository.findByLogin(customerLogin)
            .orElseThrow(() -> new ResourceNotFoundException("Customer", "login", customerLogin));
    }



    @PutMapping("/{id}")
    public CustomerEntity updateCustomer(@PathVariable(value = "id") Long customerId,
                           @Valid @RequestBody CustomerEntity customerDetails) {

        CustomerEntity customer = customerRepository.findById(customerId)
            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));

        customer.setLogin(customerDetails.getLogin());
        customer.setFirst_name(customerDetails.getFirst_name());
        customer.setLast_name(customerDetails.getLast_name());
        customer.setPassword(customerDetails.getPassword());
        customer.setEmail(customerDetails.getEmail());
        customer.setPhone_number(customerDetails.getPhone_number());
        customer.setDelivery(customerDetails.getDelivery());
        customer.setOrder(customerDetails.getOrder());


        CustomerEntity updatedCustomer = customerRepository.save(customer);
        return updatedCustomer;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable(value = "id") Long customerId) {
        CustomerEntity customer = customerRepository.findById(customerId)
            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));

        customerRepository.delete(customer);

        return ResponseEntity.ok().build();
    }
}

