package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ee=new Employee("14h51a0479","chinky","ana",43000);
		EmployeeService es=new EmployeeService();
		String ret1=es.insurance(ee.getSalary(),ee.getDesignation());
		
		System.out.println("EMPLOYEENAME :" +ee.getName() + "  "+
				"EMPLOYEEID:" +ee.getId()+"  "+
				"EMPLOYEESALARY:" +ee.getSalary()+"  "+
				"EMPLOYEEDESGINATION:" +ee.getDesignation()+"  "+
				"EMPLOYEEINSURANCESCHEME:" +ret1);
		
	}
	
	}
