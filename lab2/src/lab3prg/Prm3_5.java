package lab3prg;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prm3_5 {
	//private DateTimeFormatter dfr = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter frm=	DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
		System.out.println("enter the date");
        Scanner d1=new Scanner(System.in);
        String s=d1.next();
        
        LocalDate obj=LocalDate.parse(s,frm);
        
        System.out.println("enter the month");
        //Scanner d2=new Scanner(System.in);
        int mon= d1.nextInt();
       
        System.out.println("year");
        int yr= d1.nextInt();
        //Scanner d3=new Scanner(System.in);
        
              //  int mont=obj.getMonth();
        // int year=obj.getYear();
       //  System.out.println(yr);
       //  System.out.println(mont);
       LocalDate ob2= obj.plusMonths(mon); 
       LocalDate ob3=ob2.plusYears(yr); 
        System.out.println("expires at:" +ob3);
        
        
	}

}
