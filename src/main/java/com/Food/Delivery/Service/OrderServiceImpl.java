package com.Food.Delivery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.Delivery.BO.OrderBO;
import com.Food.Delivery.EO.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderBO orderBO;
 
	@Override
	public Orders createOrder(Orders order) {
		
        return orderBO.createOrder(order);

	}

	@Override
	public Orders getOrder(long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
