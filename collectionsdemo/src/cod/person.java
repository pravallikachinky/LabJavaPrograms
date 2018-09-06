package cod;

import java.util.Comparator;

public class person implements Comparator<person> {
	String pid,pname;
	@Override
	public int compare(person p1, person p2) {
		// TODO Auto-generated method stub
		String name1=p1.pname;
		String name2=p2.pname;
		int st=name1.compareTo(name2);
		
		return st;
	}
	public person(String pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + "]";
	}

}
