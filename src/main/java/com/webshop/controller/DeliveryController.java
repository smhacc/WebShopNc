package com.webshop.controller;

import com.webshop.model.DeliveryEntity;
import com.webshop.service.DeliveryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping("/delivery-page")
    public String viewDeliveryPage(Model model) {
        List<DeliveryEntity> listDeliverys = deliveryService.listAll();
        model.addAttribute("listDeliverys", listDeliverys);
        return "delivery-page";
    }

    @RequestMapping("/new-delivery")
    public String showNewCartPage(Model model) {
        DeliveryEntity delivery = new DeliveryEntity();
        model.addAttribute("delivery", delivery);
        return "delivery-page";
    }

    @RequestMapping(value = "/save-delivery", method = RequestMethod.POST)
    public String saveDelivery(@ModelAttribute("delivery") DeliveryEntity delivery) {
        deliveryService.save(delivery);
        return "redirect:/delivery-page";
    }

    @RequestMapping("/edit-delivery/{id}")
    public ModelAndView showEditDeliveryPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        DeliveryEntity delivery = deliveryService.get(id);
        mav.addObject("delivery", delivery);

        return mav;
    }

    @RequestMapping("/delete-delivery/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        deliveryService.delete(id);
        return "redirect:/delivery-page";
    }
    
//    @Autowired
//    DeliveryRepository deliveryRepository;
//
//    @GetMapping("/all")
//    public List<DeliveryEntity> getAllDeliverys() {
//        return deliveryRepository.findAll();
//    }
//
//    @PostMapping("/all")
//    public DeliveryEntity createDelivery(@Valid @RequestBody DeliveryEntity delivery) {
//        return deliveryRepository.save(delivery);
//    }
//
//    @GetMapping("/{id}")
//    public DeliveryEntity getDeliveryById(@PathVariable(value = "id") Long deliveryId) {
//        return deliveryRepository.findById(deliveryId)
//            .orElseThrow(() -> new ResourceNotFoundException("Delivery", "id", deliveryId));
//    }
//
//
//    @PutMapping("/{id}")
//    public DeliveryEntity updateDelivery(@PathVariable(value = "id") Long deliveryId,
//                                         @Valid @RequestBody DeliveryEntity deliveryDetails) {
//
//        DeliveryEntity delivery = deliveryRepository.findById(deliveryId)
//            .orElseThrow(() -> new ResourceNotFoundException("Delivery", "id", deliveryId));
//
//        delivery.setCity(deliveryDetails.getCity());
//        delivery.setStreet(deliveryDetails.getStreet());
//        delivery.setHome(deliveryDetails.getHome());
//        delivery.setApartment(deliveryDetails.getApartment());
//
//
//        DeliveryEntity updatedDelivery = deliveryRepository.save(delivery);
//        return updatedDelivery;
//    }
//
//    @DeleteMapping("/delivery/{id}")
//    public ResponseEntity<?> deleteDelivery(@PathVariable(value = "id") Long deliveryId) {
//        DeliveryEntity delivery = deliveryRepository.findById(deliveryId)
//            .orElseThrow(() -> new ResourceNotFoundException("Delivery", "id", deliveryId));
//
//        deliveryRepository.delete(delivery);
//
//        return ResponseEntity.ok().build();
//    }
}


