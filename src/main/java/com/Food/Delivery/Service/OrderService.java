package com.Food.Delivery.Service;

import com.Food.Delivery.EO.Orders;

public interface OrderService {

	
	Orders createOrder(Orders order);
	Orders getOrder(long orderId);

}
