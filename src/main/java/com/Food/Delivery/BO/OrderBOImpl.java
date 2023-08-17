package com.Food.Delivery.BO;
import org.springframework.stereotype.Service;

import com.Food.Delivery.DAO.OrderDAO;
import com.Food.Delivery.EO.Orders;

@Service
public class OrderBOImpl implements OrderBO {

	private final OrderDAO orderDAO;

    public OrderBOImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }
	
	@Override
	public Orders createOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderDAO.save(order);
	}

	@Override
	public Orders getOrder(long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
