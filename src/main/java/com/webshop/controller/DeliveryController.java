package com.webshop.controller;

import java.util.List;
import javax.validation.Valid;
import com.webshop.exception.ResourceNotFoundException;
import com.webshop.model.DeliveryEntity;
import com.webshop.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    DeliveryRepository deliveryRepository;

    @GetMapping("/all")
    public List<DeliveryEntity> getAllDeliverys() {
        return deliveryRepository.findAll();
    }

    @PostMapping("/all")
    public DeliveryEntity createDelivery(@Valid @RequestBody DeliveryEntity delivery) {
        return deliveryRepository.save(delivery);
    }

    @GetMapping("/{id}")
    public DeliveryEntity getDeliveryById(@PathVariable(value = "id") Long deliveryId) {
        return deliveryRepository.findById(deliveryId)
            .orElseThrow(() -> new ResourceNotFoundException("Delivery", "id", deliveryId));
    }



    @PutMapping("/{id}")
    public DeliveryEntity updateDelivery(@PathVariable(value = "id") Long deliveryId,
                                         @Valid @RequestBody DeliveryEntity deliveryDetails) {

        DeliveryEntity delivery = deliveryRepository.findById(deliveryId)
            .orElseThrow(() -> new ResourceNotFoundException("Delivery", "id", deliveryId));

        delivery.setCity(deliveryDetails.getCity());
        delivery.setStreet(deliveryDetails.getStreet());
        delivery.setHome(deliveryDetails.getHome());
        delivery.setApartment(deliveryDetails.getApartment());



        DeliveryEntity updatedDelivery = deliveryRepository.save(delivery);
        return updatedDelivery;
    }

    @DeleteMapping("/delivery/{id}")
    public ResponseEntity<?> deleteDelivery(@PathVariable(value = "id") Long deliveryId) {
        DeliveryEntity delivery = deliveryRepository.findById(deliveryId)
            .orElseThrow(() -> new ResourceNotFoundException("Delivery", "id", deliveryId));

        deliveryRepository.delete(delivery);

        return ResponseEntity.ok().build();
    }

//    @GetMapping(value = "/add-delivery")
//    public String showPage(ModelMap model) {
//        model.addAttribute("deliveryadd", new Delivery());
//        return "deliveryadd";
//    }
}

