
public class FinalTest {
	public static void main(String[] args) {
		/*final double PI=3.14; //local variable
		System.out.println("PI "+PI);
		//PI=3.18;
		System.out.println("PI "+PI);*/
		Circle circle1 = new Circle(23);
		Circle circle2 = new Circle(43);
		Circle circle3 = new Circle(53);

		circle1.show();
		circle2.show();
		circle3.show();
		
		
	}
}

class Car
{
	final String numberPlate;
	
	Car(String np) {
		numberPlate=np;
	}
	void changeNumberPlate(String np) {
		//numberPlate=np;
	}
	
}

class Circle
{
	final static double PI=3.14; //SHARABLE CONSTANT FIELD
	int radius;
	
	Circle(int r) {
		radius = r;
	}
	void show() {
		double area = PI * radius * radius;
		System.out.println("Area of the circle of radius : "+radius+" is : "+area);
	}
}


