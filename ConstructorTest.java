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
		
		
		//pointObj1.show();
		System.out.println("pointObj1 : "+pointObj1);
		
		System.out.println("-----------------");
	
		Point3D p3d = new Point3D(50, 60, 70);
		System.out.println("p3d : "+p3d);
		
		System.out.println("-----------------");

		ColouredPoint3D cp3d = new ColouredPoint3D(500, 600, 700, "Magenta");
		System.out.println("cp3d : "+cp3d);
		
		
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

class Point3D extends Point 
{
	//private int x; x is already inherited from Point
	//private int y; y is already inherited from Point
	private int z; //extra
							//extra
	public Point3D(int x, int y, int z) {
		super(x,y); //reuse the ctor of the super class
		System.out.println("Point3D(int,int,int)");
		this.z = z;//extra 
	}
	@Override
	public String toString() {
		return "Point3D [toString()=" + super.toString() + ", z=" + z + "]";
	}	
}

class ColouredPoint3D extends Point3D
{
	String color;
							//extra
	public ColouredPoint3D (int x, int y, int z,String color) {
		super(x,y,z); //reuse the ctor of the super class
		System.out.println("ColouredPoint3D(int,int,int,String)");
		this.color=color; 
	}
	@Override
	public String toString() {
		return "ColouredPoint3D [toString()=" + super.toString() + ", color=" + color + "]";
	}	
}

class Person
{
	void eating() {
		
	}
}
class Photographer extends Person
{
	void click() {
		
	}
}
class Cinematographer extends Photographer
{
	void shooting() {
		
	}
}



