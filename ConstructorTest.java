/*
 * 
 * Constructor
 * 
 * 	- a special function which has same name as of
 * the enclosing class
 * 
 * - does not have return type
 * - well it can take parameters
 * 
 * - it is automatically invoked during 
 *   the object creation process
 * 
 * - to initialize the data of the object
 */
public class ConstructorTest {
	public static void main(String[] args) {
		Point pointObj1 = new Point(10,20);
		Point pointObj2 = new Point(100,200);
		Point pointObj3 = new Point(300,400);
		
		//pointObj1.show();
		System.out.println("pointObj1 : "+pointObj1);
		System.out.println("pointObj2 : "+pointObj2);
		System.out.println("pointObj3 : "+pointObj3);
		
		
	}
}

class Point // extends Object 
{
	private int x;
	private int y;
	
	Point() {
		System.out.println("Point() ctor called...");
		x = 0;
		y = 0;
	}
	Point(int x, int y) {
		System.out.println("Point(int,int) ctor called...");
		this.x = x;
		this.y = y;
	}
	Point(int x) {
		System.out.println("Point(int) ctor called...");
		this.x = x;
		this.y = 0;
	}
	void show() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	public String toString()
	{
		return "[ x :"+x+" and y :"+y+" ]" ;
	}
	
}
