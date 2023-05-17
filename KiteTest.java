
public class KiteTest {
	public static void main(String[] args) {
		Kite.showKiteCount();
		
		Kite kite1  = new Kite("Jack","Red",50);
		Kite kite2  = new Kite("Jane","Green",60);
		Kite kite3  = new Kite("Robert","Blue",70);
		
		Kite.showKiteCount();
		
		Kite kite4  = new Kite("Julie","Magenta",70);
		Kite kite5  = new Kite("Julia","Yellow",80);
		
		Kite.showKiteCount();

		kite2.kiteFight(kite1); //invoker is kite1, passed is kite2
		
		Kite.showKiteCount();
	}
}

class Kite
{
	String owner; //global
	String color;
	int length;
	
	private static int kiteCount; // a single variable is loaded

	public static void showKiteCount() {
		System.out.println("Kite count : "+kiteCount);
	}

	public Kite(String owner, String color, int length) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		++kiteCount;
	}

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}
	
	void kiteFight(Kite x) {
		for(int i=1;i<=20;i++) {
			System.out.println(this.owner+" initiated the kite fight with "+x.owner);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //delay 1 second
			double val = Math.random()%10;
			if(val>0.98) {
				--kiteCount;
				break;
			}
			else if(val<0.010) {
				--kiteCount;
				--kiteCount;
				break;
			}
		}
		
	}
}
