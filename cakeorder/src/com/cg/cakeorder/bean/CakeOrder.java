package com.cg.cakeorder.bean;
/**
 * Class name: CakeOrder
 * 
 * @author Gilla Pravallika
 * Date of creation: 6-11-2018
 * 
 */
public class CakeOrder {
	private int orderId;
	private int customerId;
	private double totalPrice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
