package com.Food.Delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Food.Delivery.DTO.OrderDTO;
import com.Food.Delivery.EO.Orders;
import com.Food.Delivery.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

   
    @PostMapping("/")
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
        

        // Mapping and validation are successful
        Orders orderEO = mapToOrders(orderDTO); // Implement this mapping method
        
        // Call service layer to create the order
        Orders createdOrder = orderService.createOrder(orderEO);

        // Map the created order back to DTO if needed
        OrderDTO createdOrderDTO = mapToOrderDTO(createdOrder); // Implement this mapping method

        return new ResponseEntity<>(createdOrderDTO, HttpStatus.CREATED);
    }
    private Orders mapToOrders(OrderDTO orderDTO) {
        return new Orders(
                orderDTO.getOrderNumber(),
                orderDTO.getAmount(),
                orderDTO.getCustomerName()
                );
    }

    private OrderDTO mapToOrderDTO(Orders orderEO) {
        return new OrderDTO(
                orderEO.getOrderNumber(),
                orderEO.getAmount(),
                orderEO.getCustomerName()
        );
}
}