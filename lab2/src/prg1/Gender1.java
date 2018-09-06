package prg1;

public class Gender1 {
	private String firstname,lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Gender getGen() {
		return gen;
	}
	public void setGen(Gender gen) {
		this.gen = gen;
	}
	private Gender gen;
	public void printdetails()
	{
		System.out.println("FIRSTNAME:" +firstname);
		System.out.println("LASTNAME:" +lastname);

		System.out.println("GENDER:" +gen);
	}
	public Gender1(String firstname, String lastname, Gender gen) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gen = gen;
	}
}
