package lab3prg;


public class Prg1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  

	String a="pravallika";
	int i,j,count=0;
	char ch1[]=a.toCharArray();

	int len=a.length();
	char ch[]=a.toCharArray();
	System.out.println(a+a);
	
	for( i=0;i<len;i++)
	{ 
		if(i%2!=0)
	
		ch[i]=ch[i];
		else
			ch[i]='#';
			
	}
	//a=new String(ch);
	System.out.println(ch);
	char ch2[]=a.toCharArray();
	 StringBuffer sb=new StringBuffer("hello");
	 char c[]=a.toCharArray();

	
/*	for( i=0;i<len;i++)
	{
	for(j=0;j<len;j++)
	{
      if(ch2[i]==c[j])
    	  count++;
	}
	if(count==1)
	{
	 ch2[i]=c[j];
	}
	else
		sb.deleteCharAt(j);
	}	
a=new String(c);
System.out.println(a);*/



	
	for( i=0;i<len;i++)
	{ 
		if(i%2!=0)
	
		ch1[i]=ch1[i];
		else
			ch1[i]=Character.toUpperCase(ch1[i]);
			
	}
	System.out.println(ch1);
	}

	

	
}
