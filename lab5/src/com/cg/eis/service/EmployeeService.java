package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeService implements Service {
	/*private employee emp;
	

	public employee getEmp() {
		return emp;
	}

	public void setEmp(employee emp) {
		this.emp = emp;
	}
*/
	public String insurance(long salary, String designation)
	{
		String ret = null;
		if (salary>=40000){
			if(designation=="ana")
			{
				ret="insurance A";
						}
			if(designation=="sen")
			{
				ret="insurance B";
		}
			if(designation=="manager")
			{
				ret="insurance C";
		}
	}
		else if(salary>=20000 && salary<=40000)
		{
			if(designation=="jana")
			{
				ret="insurance A1";
						}
			if(designation=="jsen")
			{
				ret="insurance B1";
		}
			if(designation=="jmanager")
			{
				ret="insurance C1";
		}
			
		}
		else
			System.out.println("please enter valid designation and salary");
		return ret;
}
}
