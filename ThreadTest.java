
public class ThreadTest {
	public static void main(String[] args) {
		Car car = new Car();
		Train train = new Train();
		Bike bike = new Bike();
		
		train.start();
		car.start();
		bike.start();
		
	}
}
class Car extends Thread {
	public void run() {
		for(int i=1;i<=120;i++ ) {
			System.out.println("\tCar is running...."+i);
		}
	}
}
class Bike extends Thread {
	public void run() {
		for(int i=1;i<=120;i++ ) {
			System.out.println("\t\tBike is running...."+i);
		}
	}
}
class Train extends Thread {
	public void run() {
		for(int i=1;i<=120;i++ ) {
			System.out.println("Train is running...."+i);
		}
	}
}
