package com.webshop.backend.controller;

import com.webshop.backend.exception.ResourceNotFoundException;
import com.webshop.backend.model.OrderEntity;
import com.webshop.backend.repository.OrderRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/order")
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

