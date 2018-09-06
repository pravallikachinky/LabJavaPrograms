package acc;

import java.util.Scanner;


public class SavingAccount extends Account {
    void withdraw()
  {
    	System.out.println("enter the money in saving account");
    	Scanner min=new Scanner(System.in);
    	String str=min.next();
    	final int minbal=Integer.parseInt(str);
	  if(minbal==0)
		  System.out.println("balance is zero");
	  
  }
}
