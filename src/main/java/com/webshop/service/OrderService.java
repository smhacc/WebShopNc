package com.webshop.service;
import com.webshop.model.OrderEntity;
import com.webshop.repository.OrderRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderEntity> listAll() {
        return orderRepository.findAll();
    }

    public void save(OrderEntity product) {
        orderRepository.save(product);
    }

    public OrderEntity get(long id) {
        return orderRepository.findById(id).get();
    }

    public void delete(long id) {orderRepository.deleteById(id); }
}