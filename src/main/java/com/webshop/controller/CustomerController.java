package com.webshop.controller;

import com.webshop.model.CustomerEntity;
import com.webshop.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping("/cust-page")
    public String viewCustPage(Model model) {
        List<CustomerEntity> listCustomer = customerService.listAll();
        model.addAttribute("listCustomer", listCustomer);
        return "cust-page";
    }

    @RequestMapping("/new-customer")
    public String showNewCustPage(Model model) {
        CustomerEntity customer = new CustomerEntity();
        model.addAttribute("customer", customer);
        return "new_customer";
    }

    @RequestMapping(value = "/save-customer", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("order") CustomerEntity customer) {
        customerService.save(customer);
        return "redirect:/cust-page";
    }

    @RequestMapping("/edit-customer/{id}")
    public ModelAndView showEditCustomerPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        CustomerEntity customer = customerService.get(id);
        mav.addObject("customer", customer);

        return mav;
    }

    @RequestMapping("/delete-customer/{id}")
    public String deleteCustomer(@PathVariable(name = "id") int id) {
        customerService.delete(id);
        return "redirect:/cust-page";
    }

//
//    @GetMapping("/all")
//    public List<CustomerEntity> getAllCustomers() {
//        return customerRepository.findAll();
//    }
//
//    @PostMapping("/all")
//    public CustomerEntity createCustomer(@Valid @RequestBody CustomerEntity customer) {
//        return customerRepository.save(customer);
//    }
//
//
//    @GetMapping("/{id}")
//    public CustomerEntity getCustomerById(@PathVariable(value = "id") Long customerId) {
//        return customerRepository.findById(customerId)
//            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));
//    }
//
//
//
//
//    @PutMapping("/{id}")
//    public CustomerEntity updateCustomer(@PathVariable(value = "id") Long customerId,
//                           @Valid @RequestBody CustomerEntity customerDetails) {
//
//        CustomerEntity customer = customerRepository.findById(customerId)
//            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));
//        if (customerDetails.getLogin() !=null) {
//            customer.setLogin(customerDetails.getLogin());
//        }
//        customer.setFirst_name(customerDetails.getFirst_name());
//        customer.setLast_name(customerDetails.getLast_name());
//        customer.setPassword(customerDetails.getPassword());
//        customer.setEmail(customerDetails.getEmail());
//        customer.setPhone_number(customerDetails.getPhone_number());
//        customer.setDelivery(customerDetails.getDelivery());
//        customer.setOrder(customerDetails.getOrder());
//
//
//        CustomerEntity updatedCustomer = customerRepository.save(customer);
//        return updatedCustomer;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteCustomer(@PathVariable(value = "id") Long customerId) {
//        CustomerEntity customer = customerRepository.findById(customerId)
//            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));
//
//        customerRepository.delete(customer);
//
//        return ResponseEntity.ok().build();
//    }
}

