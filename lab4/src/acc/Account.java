package acc;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SavingAccount sa=new SavingAccount();
		sa.withdraw();
		CurrentAccount ca=new CurrentAccount();
		ca.withdraw();
	}

}
