package lab3prg;

import java.util.Arrays;

public class Prm3_8 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
       String[] arr={"i","am","hello"};
				Arrays.sort(arr);
				
		       int len=arr.length;
		       
		       System.out.println(len);
		       if(len%2==0)
		       {
		    	   for(int i=0;i<(len/2);i++)
		    	   {
		    		   arr[i]=arr[i].toUpperCase();
		    	   }
		       }
		       else
		       {
		    	   for(int i=0;i<((len+1)/2);i++)
		    	   {
		    		   arr[i]=arr[i].toUpperCase();
		    	   }

		       }
		       for(int i=0;i<len;i++)
		    	   System.out.println(arr[i]);
	}

	
}
