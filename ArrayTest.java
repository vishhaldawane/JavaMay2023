import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayTest {
	public static void main(String[] args) {
//		Book book1 = new Book(101,"Java 11","James Gosling",1200);
//		Book book2 = new Book(102,"Oracle 21","Scott M",1100);
//		Book book3 = new Book(103,"Linux","Richard Stallman",1500);

		//ArrayList has no-fixed width
		//ArrayList can grow or shrinks
		//ArrayList can have variable types
		
		//CONTAINER
		ArrayList<PhoneLog> logList = new ArrayList<PhoneLog>(); //10 20 40 80 160
		System.out.println("Container created....");

		PhoneLog log1 = new PhoneLog("9820443464", "dialied", "12-May-2023 12:30");
		PhoneLog log2 = new PhoneLog("8820443474", "missed", "14-May-2023 13:30");
		PhoneLog log3 = new PhoneLog("9820443444", "dialed", "15-May-2023 15:30");
		
		logList.add(log1);//CONTENT is ADDED to the CONTAINER
		System.out.println("Added the 1st log");
		logList.add(log2);
		System.out.println("Added the 2nd log");
		logList.add(log3);
		System.out.println("Added the 3rd log");
		
		Iterator<PhoneLog> iterator = logList.iterator(); //STRAW
		System.out.println("Got the Iterator.....");
		
		while(iterator.hasNext()) { //lower and upper bound
			PhoneLog log = iterator.next();
			System.out.println("Log is : "+log);
		}
		

	}
}

class Book
{
	int bookId;
	String bookName;
	String authorName;
	float bookCost;
	public Book(int bookId, String bookName, String authorName, float bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookCost="
				+ bookCost + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public float getBookCost() {
		return bookCost;
	}
	public void setBookCost(float bookCost) {
		this.bookCost = bookCost;
	}
	
	
}

class PhoneLog
{
	String logNumber; //
	String logType; //missed,recieved,dialled
	String dateAndTime;
	public PhoneLog(String logNumber, String logType, String dateAndTime) {
		super();
		this.logNumber = logNumber;
		this.logType = logType;
		this.dateAndTime = dateAndTime;
	}
	@Override
	public String toString() {
		return "PhoneLog [logNumber=" + logNumber + ", logType=" + logType + ", dateAndTime=" + dateAndTime + "]";
	}
	
	
}


/*


/*	
System.out.println("book1 "+book1);
System.out.println("book2 "+book2);
System.out.println("book3 "+book3);
*/

//array has fixed width
//array neither grows nor shrinks
//array has fixed type

/*Book bookArray[] = new Book[5]; //bookArray[0] to bookArray[49]

bookArray[0] = new Book(101,"Java 11","James Gosling",1200);
bookArray[1] = new Book(102,"Oracle 21","Scott M",1100);
bookArray[2] = new Book(103,"Linux","Richard Stallman",1500);

for (int i = 0; i < bookArray.length; i++) {
	System.out.println("book : "+bookArray[i]);
}
*/