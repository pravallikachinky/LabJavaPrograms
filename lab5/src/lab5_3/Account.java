package lab5_3;

abstract class Account {
 private long accnum;
 public long getAccnum() {
	 accnum=(long)(123456789*Math.random());
	return accnum;
}
public void setAccnum(long accnum) {
	this.accnum = accnum;
}
public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccholder() {
	return accholder;
}
public void setAccholder(Person accholder) {
	this.accholder = accholder;
}
private double balance;
 private Person accholder;
 
 @Override
 public String toString() {
 	return "account [accnum=" + this.getAccnum() + ", balance=" + balance
 			+ ", accholder=" + accholder + "]";
 }


public void deposit(double dep)
{
	this.balance=dep+this.balance;
	System.out.println("after deposit balance"+this.balance);
}
 abstract void withdraw(double wit);

	public double getbalance()

{
	return balance;
}
}