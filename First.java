class Dancer {
	void dance() {
		System.out.println("Dancer is dancing..");
	}
	void jump() {
		System.out.println("Dancer is jumping..");
	}
	
	void rotateLeft() {
		System.out.println("Dancer is rotating to the left..");
	}

	void turnAround() {
		System.out.println("Dancer is turning around..");
	}
}
class Account {
	void deposit() {
		System.out.println("Account is depositing some cash");
	}
	void withdraw() {
		System.out.println("Account is withdrawing some cash..");
	}
	
}
class Magician {
	void doTrick() {
		System.out.println("Magician doing some trick...");
	}
	void performMagic() {
		System.out.println("Magician doing some magic....");
	}
	
}
class First
{
	public static void main(String args[]) {
		System.out.println("Hello First");

		Dancer dancerObj1 = new Dancer(); //to create an object from this class

		dancerObj1.jump();
		dancerObj1.dance();
		dancerObj1.rotateLeft();
		dancerObj1.turnAround();
		dancerObj1.turnAround();
		dancerObj1.turnAround();
		dancerObj1.rotateLeft();
		dancerObj1.turnAround();
		dancerObj1.dance();
		dancerObj1.jump();

		Dancer dancerObj2 = new Dancer(); //to create an object from this class

		dancerObj2.jump();
		dancerObj2.jump();

		Magician magicianObj = new Magician();

		magicianObj.doTrick();
		magicianObj.performMagic();

		Account accObj = new Account();
		accObj.withdraw();
		accObj.deposit();



	}
}

