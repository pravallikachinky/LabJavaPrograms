package com.cg.cakeorder.dao;

import com.cg.cakeorder.bean.CakeOrder;
import com.cg.cakeorder.exception.CakeOrderException;
import com.cg.customer.bean.Customer;

public interface ICakeOrderDao {
	public int placeOrder(Customer customer,CakeOrder cake) 
			throws CakeOrderException;
	public CakeOrder getOrderDetails(int orderid) throws CakeOrderException;
}
