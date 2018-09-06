package cod;

public class employee {
	String name,email,companyname;
	int id;

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		employee e=(employee)obj;
		employee current=this;
		if(e.email.equals(current.email))
		{
			flag=true;
		}
		return flag;
	
	
	}
	public employee(String name, String email, String companyname, int id) {
		super();
		this.name = name;
		this.email = email;
		this.companyname = companyname;
		this.id = id;
	}

}
