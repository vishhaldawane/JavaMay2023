
public class PersonTest {
	public static void main(String[] args) {
		
		Person person1 = new Person('F',23,"Jane");
		Person person2 = new Person('F',23,"Julie");
				
		Corporation corp = new Corporation();
		
		Gossip g = corp.discussion(person1, person2);
		
		System.out.println("gossip is : "+g);
		
		
	
	}
}

class Gossip
{
	String secret;
	int level;
	
	public Gossip(String secret, int level) {
		super();
		this.secret = secret;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Gossip [secret=" + secret + ", level=" + level + "]";
	}
	
	
}

class Corporation
{
	void changePersonalDetails(Person x) { // here x is a proxy of person1
		System.out.println("Changing personal details...");
		x.setName("Julie"); //
		x.setGender('F');
		x.setAge(25);
	}
	
	Gossip discussion(Person x, Person y) {
		System.out.println("discussion going on....between "+x.getName()+" and "+y.getName());
		Gossip gossip = new Gossip("Hey do u know her salary??? its double than us", 10);
		return gossip;
	}
}



class Person
{
	private char gender;
	private int age;
	private String name;
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

/*
 * 
 * Person person2 = person1;
		System.out.println("person2 : "+person2.hashCode());
		
		Person person3 = person2;
		System.out.println("person3 : "+person3.hashCode());
		
		person2.setName("Robert");
		
		System.out.println("person  : "+person1);
		System.out.println("person2 : "+person2);
		System.out.println("person3 : "+person3);
		
		person1.setGender('F');
		
		System.out.println("person  : "+person1);
		System.out.println("person2 : "+person2);
		System.out.println("person3 : "+person3);
		
 */
