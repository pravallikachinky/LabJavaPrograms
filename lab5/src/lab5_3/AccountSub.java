package lab5_3;


public class AccountSub extends Account {
	public void withdraw(double wit)
	{
		setBalance(getBalance()-wit);
		System.out.println("after deposit balance" +getBalance());
	}


}
