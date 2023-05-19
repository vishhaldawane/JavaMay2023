import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultiThreadTest {
	public static void main(String[] args) {
		Car car1 = new Car("Car1",100,200,200,150); //3
		Car car2 = new Car("Car2",400,200,200,150); //3
		Car car3 = new Car("Car3",800,200,200,150); //3
		
		Thread t1 = new Thread(car1); //pass object to Runnable
		Thread t2 = new Thread(car2); //pass object to Runnable
		Thread t3 = new Thread(car3); //pass object to Runnable
		
		t1.start(); //4 invoke Thread's start
		t2.start(); //4 invoke Thread's start
		t3.start(); //4 invoke Thread's start
		
	}
}
/*
 * 1. write a class that extends java.lang.Thread
 * 2. override the public void run()
 * 3. create the object of this class
 * 4. invoke its start() method, which invokes your run() 
 */
class Vehicle
{
	
}
class Car extends JFrame implements Runnable { //1
	JTextField t = new JTextField();
	
	Car(String title, int x, int y, int c1,int c2) {
		setTitle(title);
		setLocation(x,y);
		setSize(c1,c2);
		add(t);
		setVisible(true);
	}
	public void run() { //2
		for(int i=1;i<=1200000;i++ ) {
			t.setText("Car is running...."+i);
		}
	}
}
/*
class Bike extends Vehicle implements Runnable  {
	public void run() {
		for(int i=1;i<=120;i++ ) {
			System.out.println("\t\tBike is running...."+i);
		}
	}
}
class Train extends Vehicle  implements Runnable {
	public void run() {
		for(int i=1;i<=120;i++ ) {
			System.out.println("Train is running...."+i);
		}
	}
}
*/
