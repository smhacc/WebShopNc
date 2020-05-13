package com.webshop.controller;

import com.webshop.model.OrderEntity;
import com.webshop.service.OrderService;
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
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/order-page")
	public String viewOrderPage(Model model) {
		List<OrderEntity> listOrders = orderService.listAll();
		model.addAttribute("listOrders", listOrders);
		return "order-page";
	}

	@RequestMapping("/new-order")
	public String showNewCartPage(Model model) {
        OrderEntity order = new OrderEntity();
		model.addAttribute("order", order);
		return "new_order";
	}

	@RequestMapping(value = "/save-order", method = RequestMethod.POST)
	public String saveOrder(@ModelAttribute("order") OrderEntity order) {
		orderService.save(order);
		return "redirect:/order-page";
	}

	@RequestMapping("/edit-order/{id}")
	public ModelAndView showEditOrderPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
        OrderEntity order = orderService.get(id);
		mav.addObject("order", order);

		return mav;
	}

	@RequestMapping("/delete-order/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		orderService.delete(id);
		return "redirect:/order-page";
	}




/*    @Autowired
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
    }*/
}

