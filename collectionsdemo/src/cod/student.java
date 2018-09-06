package cod;

public class student implements Comparable<student> {
	String id,name;

	@Override
	public int compareTo(student second) {
		// TODO Auto-generated method stub
		String name=this.name;
		String name2=second.name;
		
		return name2.compareTo(name);
	}

	public student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
	

}
