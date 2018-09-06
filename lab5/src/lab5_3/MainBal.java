package lab5_3;

public class MainBal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("smith",23);
		
		Account acc=new AccountSub();
		acc.setAccholder(p);
		acc.setBalance(2000);
		System.out.println(acc);
		acc.deposit(2000);
		
		
		Person p1=new Person("kathy",23);
		Account acc1=new AccountSub();
		acc1.setAccholder(p1);

		acc.setBalance(3000);
		System.out.println(acc1);
		acc.withdraw(2000);
		
		
	}

}
