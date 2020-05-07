package com.webshop.service;

import java.util.List;
import java.util.Optional;
import com.webshop.model.DeliveryEntity;
import com.webshop.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService implements IDeliveryService {

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