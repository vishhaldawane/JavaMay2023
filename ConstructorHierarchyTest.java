
public class ConstructorHierarchyTest {
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.farming();
		
		System.out.println("-------------------");
		Father father = new Father();
		father.banking();
		father.farming();
		
		
		System.out.println("-------------------");
		Child child = new Child();
		child.coding();
		child.farming();
	}
}
class GrandFather
{
	GrandFather() {
		super();
		System.out.println("GrandFather() ctor");
	
	}
	void farming() {
		System.out.println("GrandFather is farming...using bull ");
	}
}
class Father extends GrandFather
{
	Father() {
		super();
		System.out.println("\tFather() ctor");
		
	}
	void banking() {
		System.out.println("Father is banking....");
	}
	void farming() {
		System.out.println("Father is farming...using tractor....");
	}
}
class Child extends Father 
{
	Child() {
		super(); // means invoke teh nearest super class ctor...
		System.out.println("\t\tChild() ctor");
		//throw new RuntimeException("gadbad");
	}
	void coding() {
		System.out.println("child is coding...");
	}
	void banking() {
		System.out.println("Child is banking.using mobile......");
	}
	void farming() { 
		System.out.println("Child is farming...using robotic tractor...");
	}
	void mobiling() {
		System.out.println("child is busy with mobiling...");
	}
}
/*
 * 		Person
 * 		|gender,dob, address
 * 		|
 * 		Student
 * 		| rollno,collegename,degree,marksheets
 * 		Employee
 * 			empno,desg,dept,basic, hra,da,ta		
 * 
 * Employee e = new Employee();
 * 
 */

