import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
	
		TreeSet primes = new TreeSet();
		
		
		primes.add(11);
		primes.add(3); //Integer
		primes.add(7);
		primes.add(2);
		primes.add(5);
		
		for (Iterator iterator = primes.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.println("value : "+value);
			
		}		
	}
}
