package com.Food.Delivery.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Food.Delivery.EO.Orders;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public Orders save(Orders order) {
		String insertSql =
				"INSERT INTO orders (order_number, amount, customer_name) VALUES (?, ?, ?)";
        jdbcTemplate.update(
                insertSql,
                order.getOrderNumber(),
                order.getAmount(),
                order.getCustomerName()
        );
        return order;
	}

}
