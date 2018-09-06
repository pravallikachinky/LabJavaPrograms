/**
 * 
 */
package login;

import java.util.Date;

/**
 * @author pgilla
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d=new Date();
		
				System.out.println(d);
		Calc obj=new Calc();
		obj.print();

		int y=obj.addition(10,10);
		System.out.println("THE VALUE OF ADD IS " +y);
		System.out.println("HELLO WORLD");

	}

}
