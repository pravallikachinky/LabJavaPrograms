package prg1;

public class prmmain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person a=new Person();
	    a.setFirstName("pravallika");
		a.setLastName("gilla");
		
		a.setGender('f');
		String first=a.getFirstName();
		String last=a.getLastName();
		char gen=a.getGender();
		System.out.println("FIRSTNAME:" +first);
		System.out.println("LASTNAME:" +last);
        System.out.println("GENDER:" +gen);
       
        a.setFirstName(args[0]);
		a.setLastName(args[1]);
		
		a.setGender(args[2].charAt(0));
		String first1=a.getFirstName();
		String last1=a.getLastName();
		char gen1=a.getGender();
		System.out.println("PERSONAL DETAILS");
		System.out.println("------------------------");
		System.out.println("FIRSTNAME:" +first1);
		System.out.println("LASTNAME:" +last1);
        System.out.println("GENDER:" +gen1);
        
        Person obj1=new Person("prathyusha","gilla",'f',"9866099893l");
        System.out.println(obj1.getFirstName());
        System.out.println(obj1.getLastName());
        System.out.println(obj1.getPhonenum());
        System.out.println(obj1.getGender());
	}

	
	

}
