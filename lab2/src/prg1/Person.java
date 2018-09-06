package prg1;


public class Person {
	  private String firstName,lastName ;
	 private char Gender;
	
	private String phonenum;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstName, String lastName, char gender,
			String phonenum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		this.phonenum = phonenum;
	}

	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	
	
	
	
}
