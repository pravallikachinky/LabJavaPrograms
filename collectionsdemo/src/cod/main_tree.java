package cod;

import java.util.TreeSet;

public class main_tree {

	public main_tree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<student> ts=new TreeSet<>();
		ts.add(new student("1","A"));
		ts.add(new student("2","B"));
		System.out.println(ts);
		
		TreeSet<person> p=new TreeSet<>(new person("",""));
		p.add(new person("1","chinky"));
		p.add(new person("2","hello"));
		System.out.println(p);
		
 employee e1=new employee("chinky","chinky@gmail.com","cap",1239);
 employee e2=new employee("pinky","pinky@gmail.com","cts",123);
 employee e3=new employee("sunny","sunny@gmail.com","cap",12);
		
    e.equals()
		
	}

}
