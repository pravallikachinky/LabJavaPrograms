package lab5_3;

public class Person {
	private String name;
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	private float age;
	}
