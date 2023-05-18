import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {

		//CONTAINER
		LinkedList<PhoneContact> phoneBook = new LinkedList<PhoneContact>(); //10 20 40 80 160
		System.out.println("Container created....");

		
		PhoneContact contact1 = new PhoneContact("Vishhal","9820443464","vishal@gmail.com");
		PhoneContact contact2 = new PhoneContact("Ranu Kumar","7720443464","ranu@gmail.com");
		PhoneContact contact3 = new PhoneContact("Abhilasha","8820443464","abhilasha@gmail.com");
		
		phoneBook.add(contact1);//CONTENT is ADDED to the CONTAINER
		System.out.println("Added the 1st contact");
		phoneBook.add(contact2);
		System.out.println("Added the 2nd contact");
		phoneBook.add(contact3);
		System.out.println("Added the 3rd contact");
		
		Iterator<PhoneContact> iterator = phoneBook.iterator(); //STRAW
		System.out.println("Got the Iterator.....");
		
		while(iterator.hasNext()) { //lower and upper bound
			PhoneContact contact= iterator.next();
			System.out.println("Contact is : "+contact);
		}
		

	}
}

