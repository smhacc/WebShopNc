package com.webshop.service;

import com.webshop.model.DeliveryEntity;
import com.webshop.repository.DeliveryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<DeliveryEntity> listAll() {
        return deliveryRepository.findAll();
    }

    public void save(DeliveryEntity product) {
        deliveryRepository.save(product);
    }

    public DeliveryEntity get(long id) {
        return deliveryRepository.findById(id).get();
    }

    public void delete(long id) {deliveryRepository.deleteById(id); }

//    @Autowired
//    private DeliveryRepository deliveryRepository;
//
//    @Override
//    public List<DeliveryEntity> getDeliveryByUser(String user) {
//        return deliveryRepository.findByUserName(user);
//    }
//
//    @Override
//    public Optional<DeliveryEntity> getDeliveryById(long id) {
//        return deliveryRepository.findById(id);
//    }
//
//    @Override
//    public void addDelivery(String city, String street, String home, String apartment) {
//        deliveryRepository.save(new Delivery(city, street, home, apartment));
//    }
}