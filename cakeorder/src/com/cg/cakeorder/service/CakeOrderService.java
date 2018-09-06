package com.cg.cakeorder.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.cg.cakeorder.bean.CakeOrder;
import com.cg.cakeorder.dao.CakeOderDao;
import com.cg.cakeorder.dao.ICakeOrderDao;
import com.cg.cakeorder.exception.CakeOrderException;
import com.cg.customer.bean.Customer;

public final class CakeOrderService implements ICakeOrderService {
	ICakeOrderDao cakeDao=new CakeOderDao();
	
	@Override
	public int placeOrder(Customer customer, CakeOrder cake)
			throws CakeOrderException {
		return cakeDao.placeOrder(customer, cake);
	}
	public int calcCake(String type) throws CakeOrderException{
		FileInputStream fis=null;
		int sum=0;
		try {
			 fis=new FileInputStream("cakeType.properties");
			 Properties p=new Properties();
			 p.load(fis);
			 String price=p.getProperty(type);
			 if(price!=null){
				 

				 int i=Integer.parseInt(price);
				  sum=i+500;
				 }			 
		} catch (FileNotFoundException e) {
			throw new CakeOrderException(e.getMessage());
			
		} catch (IOException e) {
			throw new CakeOrderException(e.getMessage());
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				throw new CakeOrderException(e.getMessage());
			}
		}
		return sum;
		}

	@Override
	public boolean validatePhone(String phone) throws CakeOrderException {
		if(!phone.matches("\\d{10}")){
			throw new CakeOrderException("Enter the 10 digits number");
		}
		return true;
	}
	@Override
	public CakeOrder getOrderDetails(int orderid) throws CakeOrderException {
		// TODO Auto-generated method stub
		return cakeDao.getOrderDetails(orderid);
		
	}


}