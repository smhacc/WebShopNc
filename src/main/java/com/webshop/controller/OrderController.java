package com.webshop.controller;

import com.webshop.exception.ResourceNotFoundException;
import com.webshop.model.OrderEntity;
import com.webshop.repository.OrderRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/all")
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("/all")
    public OrderEntity createOrder(@Valid @RequestBody OrderEntity order) {
        return orderRepository.save(order);
    }

    @GetMapping("/{id}")
    public OrderEntity getOrderById(@PathVariable(value = "id") Long orderId) {
        return orderRepository.findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order", "id", orderId));
    }



    @PutMapping("/{id}")
    public OrderEntity updateOrder(@PathVariable(value = "id") Long orderId,
                                   @Valid @RequestBody OrderEntity orderDetails) {

        OrderEntity order = orderRepository.findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order", "id", orderId));

        order.setDiscount(orderDetails.getDiscount());
        order.setComment(orderDetails.getComment());



        OrderEntity updatedOrder = orderRepository.save(order);
        return updatedOrder;
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable(value = "id") Long orderId) {
        OrderEntity order = orderRepository.findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order", "id", orderId));

        orderRepository.delete(order);

        return ResponseEntity.ok().build();
    }
}

