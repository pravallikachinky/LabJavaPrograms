package lab3prg;

import java.util.Scanner;

public class Prm3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;
    System.out.println("enter the name");
    Scanner st=new Scanner(System.in);
    String st1=st.next();
    len=st1.length();
    String st2="_job";
    String st3=st1.substring(len-4);
    if((len-4)>=8 && (st3.equals(st2)))
    {
    	//System.out.println(st1);
    	System.out.println("true");
    }
    else
    	System.out.println("false");
    
	}

}
