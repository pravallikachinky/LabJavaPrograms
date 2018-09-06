package com.cg.cakeorder.dao;

import java.util.HashMap;

import java.util.Map;
import java.util.Random;

import com.cg.cakeorder.bean.CakeOrder;
import com.cg.cakeorder.exception.CakeOrderException;
import com.cg.customer.bean.Customer;
import com.sun.webkit.ThemeClient;
/**
 * Class name:CakeDao
 * Interface implemented:
 *
 *
 */

public class CakeOderDao implements ICakeOrderDao {
	Map<Integer,CakeOrder> cakeMap=new HashMap<Integer,CakeOrder>();
	Map<Integer,Customer> customerMap=new HashMap<Integer,Customer>();
	@Override
	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeOrderException {
		Random rand=new Random();
		int custId=rand.nextInt(1000);
		cake.setCustomerId(custId);
		Random rand1=new Random();
		int cakeId=rand1.nextInt(1000);
		cake.setOrderId(cakeId);
		cakeMap.put(cakeId, cake);
		customerMap.put(custId, customer);
		return cake.getOrderId();
		}
	@Override
	public CakeOrder getOrderDetails(int orderid) throws CakeOrderException {
		
		return cakeMap.get(orderid);
	}

	
}
