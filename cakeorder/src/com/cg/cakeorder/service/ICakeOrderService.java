package com.cg.cakeorder.service;

import com.cg.cakeorder.bean.CakeOrder;
import com.cg.cakeorder.exception.CakeOrderException;
import com.cg.customer.bean.Customer;

public interface ICakeOrderService {
	public int placeOrder(Customer customer,CakeOrder cake) 
			throws CakeOrderException;
	boolean validatePhone(String phone) throws CakeOrderException;
	public int calcCake(String type) throws CakeOrderException;
	public CakeOrder getOrderDetails(int orderid) throws CakeOrderException;
}
