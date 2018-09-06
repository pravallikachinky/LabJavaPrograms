package lab3prg;

public class Prm3_2 {
	public static void method(String s1)
	{
		int count=0,count1=0;
		char ch[]=s1.toCharArray();
		//char ch2[]=s1.toCharArray();
		int len=s1.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]<ch[j])
					count++;

				else 
					continue;
			}
			
		}
		System.out.println(count);
	//	System.out.println(len);
		for(int j=len-1;j>0;j--)
		{
			count1=count1+j;
		}

		System.out.println(count1);
		if(count==count1)
			System.out.println("string is positive");
		else
			System.out.println("string is negative");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method("abcdefga");
}
}