import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to open the file....");
			FileInputStream fin = new FileInputStream("D:\\JavaMay2023\\Day1.txt");
			System.out.println("File is open...");
			
			byte b = (byte) fin.read(); //Hello - read 1st letter, ie A
			
			System.out.println("[");
			while(b!=-1) { // -1 means EOF
				System.out.print((char)b); //print the letter
				b = (byte) fin.read(); // read successive letters from pos 2
				Thread.sleep(1); //pause 100 ms
			}
			System.out.println("]");

			System.out.println("Trying to close the file....");
			fin.close();
			System.out.println("File is closed....");
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem1 : "+e);
		} catch (IOException e) {
			System.out.println("Problem2 : "+e);
		} catch (InterruptedException e) {
			System.out.println("Problem3 : "+e);
		}
		
	
	}
}