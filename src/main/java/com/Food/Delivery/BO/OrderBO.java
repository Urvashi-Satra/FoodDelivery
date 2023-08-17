package com.Food.Delivery.BO;

import com.Food.Delivery.EO.Orders;

public interface OrderBO {
	 Orders createOrder(Orders order);
	    Orders getOrder(long orderId);
	    
}
