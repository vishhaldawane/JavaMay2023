public class PhoneTest {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.dial();
		byte b =123;
		myPhone.dial(b);
		myPhone.dial("Jane");
		byte countryCode=91;
		myPhone.dial(countryCode, 9820443464L);
		myPhone.dial(9920333484L,countryCode);
	}
}
class Phone
{
	void dial() { //techneck
		System.out.println("dial() nowhere ...");
	}
	void dial(byte intercom) { //techneck
		System.out.println("dial(byte) where ..."+intercom);
	}
	void dial(String name) { //techneck
		System.out.println("dial(String) where ..."+name);
	}
	void dial(byte code, long number) { //techneck
		System.out.println("dial(byte,long) where ...+"+code+number);
	}
	void dial(long number,byte code) { //techneck
		System.out.println("dial(long,byte) where ...+"+code+number);
	}
}
