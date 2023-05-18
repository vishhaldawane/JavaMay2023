
public class Test {
	public static void main(String[] args) {
		
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
		if(100>50)
			throw new RuntimeException("Something happened1");
		
		System.out.println("line4");
		System.out.println("line5");
		System.out.println("line6");
		
		if(200>500)
			throw new RuntimeException("Something happened2");
		
		System.out.println("line7");
		System.out.println("line8");
		System.out.println("line9");
		if(10<5)
			throw new RuntimeException("Something happened3");
		
		
		System.out.println("line10");
		
	}
}
