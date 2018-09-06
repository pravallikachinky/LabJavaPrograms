package lab3prg;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the name");
		Scanner name=new Scanner(System.in);
		String st1=name.next();
		StringBuilder st=new StringBuilder(st1);
		int len=st.length();
		for(int i=0;i<len;i++)
		{
			char ch=st.charAt(i);
			for(int j=i+1;j<len;j++)
			{
				char c=st.charAt(j);
				if(c==ch)
				{
					st.deleteCharAt(j);
					len--;
				}
			}
		}
		System.out.println(st);
	}

}
