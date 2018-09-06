package com.cg.booking.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.booking.bean.Request;
import com.cg.booking.exception.BookingException;
import com.cg.booking.service.BookingService;
import com.cg.booking.service.IBookingService;

public class Client {

	
	IBookingService bookingService=new BookingService();
		Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("******Booking App******");
			Client c=new Client();
			
		String option="";
			while(true){
				System.out.println("1.Raise a Cab Request");
				System.out.println("2.View Cab Request Status");
				System.out.println("3.Exit");
				System.out.println("Enter your Choice");
				option=c.sc.nextLine();
				switch (option) {
				case "1":
						c.addRequest();
					break;
				case "2":
						c.displayRequest();
					break;
				case "3":
						System.exit(0);
					break;

				default:
					System.out.println("Please enter the number between 1 to 3");
					break;
				}
			}
	}
		private void addRequest(){
			Request req=new Request();
			System.out.println("Enter the customer name");
			req.setCustomerName(sc.nextLine());
			System.out.println("Enter the phone number");
			req.setPhone(sc.nextLine());
			System.out.println("Enter Pickup address");
			req.setAddressOfPickup(sc.nextLine());
			System.out.println("Enter pin");
			req.setPincode(sc.nextLine());
			req.setRequestStatus("Not Accepted");
			req.setDateOfRequest(LocalDate.now());
			try {
				boolean result=bookingService.validateRequest(req);
				if(result){
					int ret=bookingService.addRequest(req);
					System.out.println("Request with the Id = " +ret+ " is added successfully");
				}
			} catch (BookingException e) {
				System.out.println();
				System.err.println(e.getMessage());
				System.out.println();
			}
		}
		private void displayRequest(){
			System.out.println("Enter Request Id");
			int id=Integer.parseInt(sc.nextLine());
			try {
				Request req=bookingService.getRequestById(id);
				System.out.println("Customer Name:" +req.getCustomerName() );
				System.out.println("Request Status:" +req.getRequestStatus());
				System.out.println("Cab Number:" +req.getCabNumber());
				System.out.println("Request date:" +req.getDateOfRequest());
				System.out.println("Pickup Address:" +req.getAddressOfPickup());
			} catch (BookingException e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println();
			}
			
		}
}
