import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		Book book1 = new Book(101,"Java 11","James Gosling",1200);
		Book book2 = new Book(102,"Oracle 21","Scott M",1100);
		Book book3 = new Book(103,"Linux","Richard Stallman",1500);

		//ArrayList has no-fixed width
		//ArrayList can grow or shrinks
		//ArrayList can have variable types
		
		//CONTAINER
		ArrayList<Book> bookList = new ArrayList<Book>(); //10 20 40 80 160
		System.out.println("Container created....");
		
		bookList.add(book1);//CONTENT is ADDED to the CONTAINER
		System.out.println("Added the 1stbook");
		bookList.add(book2);
		System.out.println("Added the 2nd book");
		bookList.add(book3);
		System.out.println("Added the 3rd book");
		
		Iterator<Book> iterator = bookList.iterator(); //STRAW
		System.out.println("Got the Iterator.....");
		
		while(iterator.hasNext()) {
			Book b = iterator.next();
			System.out.println("Book is : "+b);
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