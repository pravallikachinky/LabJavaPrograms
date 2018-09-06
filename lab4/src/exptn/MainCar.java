package exptn;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1;
		Car c=new Car();
		c.readDataFromSensor();
		try{
		 c1=12/0;
		}
		catch(ArithmeticException e){
			System.out.println("abnormally");
		}
		
	}

}
