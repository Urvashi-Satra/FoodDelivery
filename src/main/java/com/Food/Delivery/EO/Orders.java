package com.Food.Delivery.EO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Orders")
public class Orders {
    
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "order_number", nullable = false, unique = true)
	    private String orderNumber;

	    @Column(name = "amount", nullable = false)
	    private Double amount;

	    @Column(name = "customer_name", nullable = false)
	    private String customerName;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrderNumber() {
			return orderNumber;
		}

		public void setOrderNumber(String orderNumber) {
			this.orderNumber = orderNumber;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		@Override
		public String toString() {
			return "Orders [id=" + id + ", orderNumber=" + orderNumber + ", amount=" + amount + ", customerName="
					+ customerName + "]";
		}

		public Orders( String orderNumber, Double amount, String customerName) {
			super();
			this.orderNumber = orderNumber;
			this.amount = amount;
			this.customerName = customerName;
		}

		
	    







}
