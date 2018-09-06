package com.cg.cakeorder.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.cakeorder.bean.CakeOrder;
import com.cg.cakeorder.dao.ICakeOrderDao;
import com.cg.cakeorder.exception.CakeOrderException;
import com.cg.cakeorder.service.CakeOrderService;
import com.cg.cakeorder.service.ICakeOrderService;
import com.cg.customer.bean.Customer;

public class Client {
	Scanner scan=new Scanner(System.in);
	ICakeOrderService cakeService=new CakeOrderService();
	public static void main(String[] args) {
		
		
		String option="";
		Client c=new Client();
		while(true){
			System.out.println("1.Add your Request");
			System.out.println("2.Display the details of order");
			System.out.println("3.exit");
			System.out.println("Enter your choice");
			option=c.scan.nextLine();
			switch (option) {
			case "1":
					c.placeOrder();
				break;
			case "2":
					c.displayOrder();
				break;
			case "3":
					System.exit(0);
				break;


			default:System.out.println("Please enter the number between 1 to 3");
				break;
			}
		}
		
	}
	private void placeOrder(){
		Customer cus=new Customer();
		CakeOrder cake=new CakeOrder();
		System.out.println("Enter the Customer name");
		cus.setCustName(scan.nextLine());
		System.out.println("Enter Customer address");
		cus.setAddress(scan.nextLine());
		System.out.println("Enter the Customer phone num");
		cus.setPhone(scan.nextLine());
		System.out.println("Enter the type of cake");
		String type=scan.nextLine();
	     System.out.println(LocalDate.now());
		try {
			boolean result=cakeService.validatePhone(cus.getPhone());
			int sum=cakeService.calcCake(type);
			cake.setTotalPrice(sum);
			if(result){
				int oId=cakeService.placeOrder(cus, cake);
			System.out.println("Price : " +sum);
			System.out.println(LocalDate.now());
			System.out.println("Customer with orderId=" +oId+ " is placed successfully" );
			System.out.println(sum);
			}
		} catch (CakeOrderException e) {
			System.out.println();
			System.err.println("An error occured:" +e.getMessage());
			System.out.println();
		}
		
	}
	private void displayOrder(){
		System.out.println("Enter the order id");
		int id=Integer.parseInt(scan.nextLine());
		
		try {
			CakeOrder co=cakeService.getOrderDetails(id);
			if(co==null)
				throw new CakeOrderException("OrderId not found");
			System.out.println("Customerid: " +co.getCustomerId());
			System.out.println("Orderid : " +co.getOrderId());
			System.out.println("TotalPrice: " +co.getTotalPrice());
			
		} catch (CakeOrderException e) {
			System.out.println();
			System.err.println("An error occured:" +e.getMessage());
			System.out.println();
		}
		
		
	}
}
