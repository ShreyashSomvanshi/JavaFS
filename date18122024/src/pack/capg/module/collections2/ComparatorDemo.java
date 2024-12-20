package pack.capg.module.collections2;
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.age == o.age) {
			return 0;
		}else {
			return this.age > o.age?1:-1;
		}
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("abc", 21);
		Person p2 = new Person("xyz", 22);
		int agediff = p1.compareTo(p2);
		switch(agediff) {
		case -1:
		{
			System.out.println(p2.getName()+" is older than " + p1.getName() );
			break;
		}
		case 1:
		{
			System.out.println(p1.getName()+" is older than "+p2.getName());
			break;
		}
		default:
			System.out.println(p1.getName()+" and "+p2.getName()+" hhave same age,");
		}
	}

}
