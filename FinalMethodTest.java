
public class FinalMethodTest {
	public static void main(String[] args) {
		GraphicalChess chess = new GraphicalChess();
		Game.upload(chess);
		
	}
}
class Game
{
	static void upload(Chess x) {
		//System.out.println("Uploading the chess...");
		//x.moveKnight();
		if(x instanceof GraphicalChess) {
			Class c= x.getClass();
			if(c.isInstance(x)) {
				GraphicalChess gc  = (GraphicalChess) x;
				gc.moveMyKnight();		
			}
			
		}
	}
}
 class Chess // designed by Nitin
{
	//overridden
	final void moveKnight() { // moves L shape 2.5 steps
		System.out.println("Knight is moving in L shape...L calcs are done...");
	}
}

class GraphicalChess extends Chess //Niraj
{
	//overriding
	void moveMyKnight() { // moves L shape 2.5 steps
		System.out.println("Knight is moving in L shape + Diagonal shape...L + D calcs are done...");
	}
}
/*
class Account
{
	
}
class SavingsAccount extends Account
{
	
}
class FixedDepositAccount extends SavingsAccount
{
	
}
 class FlexiFixedDepositAccount extends FixedDepositAccount
{
	
}*/

