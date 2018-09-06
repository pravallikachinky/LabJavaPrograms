package acc;
import java.util.Scanner;


public class CurrentAccount extends Account {
 int overdraft=2000;
public void withdraw()
 {
	System.out.println("enter the money in current account");
	Scanner lim=new Scanner(System.in);
	String str=lim.next();
	int lim1=Integer.parseInt(str);
	boolean i=(lim1<=overdraft);
	System.out.println(i);
	
	
	

 }
}
