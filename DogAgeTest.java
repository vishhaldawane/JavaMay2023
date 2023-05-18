import java.util.Scanner;

import myexceptions.DogAgeExceededException;
import myexceptions.DogAgeNegativeException;

public class DogAgeTest {
	public static void main(String[] args) {
		System.out.println("Main begins");
			
		do {
			try {
				System.out.println("Enter age : ");
				Scanner scan = new Scanner(System.in);
				int age = scan.nextInt();
				Dog d1 = new Dog("Tommy",age);
				System.out.println("d1 "+d1);
				if(d1 !=null) {
					break;
				}
			}
			/*catch(RuntimeException e) {
			  System.out.println("Problem : "+e.getMessage());
			}*/
			catch(DogAgeExceededException e) {
				System.out.println("Problem 1: "+e.getMessage());
			}
			catch(DogAgeNegativeException e) {
				System.out.println("Problem 2: "+e.getMessage());
			}
			
		} while(true);	
			
		System.out.println("Main Ends");
	}
}
class Dog
{
	String name;
	int age;
	//a ctor cannot return a value, but it can throw an exception
	public Dog(String name, int age) {
		System.out.println("\n\tDog(String,int) ctor...STARTED");
		System.out.println("\tsetting the name");
		this.name = name;
		System.out.println("\tsetting the age");
		
		if(age>14) {
			//throw new RuntimeException("Dogs age cannot exceed 14 years");
			throw new DogAgeExceededException("Dogs age cannot exceed 14 years");
		}
		else if ( age <=0 ) {
			//throw new DogAgeNegativeException("Dogs age cannot be ZERO or negative");
			throw new DogAgeNegativeException("Dogs age cannot be ZERO or negative");
		}
		else
			this.age = age;
		
		System.out.println("\tDog(String,int) ctor...FINISHED\n");
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
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
}
