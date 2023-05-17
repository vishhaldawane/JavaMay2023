
public class InterfaceTest {
	public static void main(String[] args) {
			//Object slicing
		
			Studying x = new Student();
		//	x.react();
		//	x.answer();
		//	x.response();
			x.study();
	}
}

interface Reactive
{
	void react();
}
class Person implements Reactive
{
	public void react() {
		System.out.println("Person is reacting...");
	}
}
interface Answering {
	void answer();
}
interface Responsive extends Reactive,Answering
{
	void response(); //default is public and abstract function
}
interface Studying {
	void study();
}
interface Attentive {
	void attend();
}

class Student extends Person implements Responsive, Studying, Attentive
{
	public void answer() {
		System.out.println("Student is answering....");
	}
	public void response() {
		System.out.println("Student is responding...");
	}
	public void study() {
		System.out.println("Student is studying...");
	}
	public void attend() {
		System.out.println("Student is attending...");
	}
}

interface Working {
	void work();
}
class Employee extends Student implements Working
{
	public void work() {
		System.out.println("Employee is working...");
	}
}

interface Animal
{
	void breathing();
}

//Head First Java

//The Java Programming Language
	//James Gosling - Ken Arnold, David Holmes

interface Bird { //Nitin
	void fly(); // Eagle ... 300 ft...
}
interface Mammal { //Niraj
	void fly(); // 30ft...
}
class Bat implements Bird,Mammal //Abhijeet
{
	public void fly() {
		// TODO Auto-generated method stub
	}
	//public void fly() { /*.150 ft...*/ }
}
/*
 
 			Object
 			|
 			|  Reactive
 			|   |react();
 			Person
 			|
 			|  Responsive 	Studying Attentive
 			|	|response();   |study();   |attend();	
 			|	-------------------------------
 			|	|
 			Student
 			|
 			|  Working
 			|	| work();
 			|   |
 			Employee
 
 */
