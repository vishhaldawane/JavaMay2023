public class InstrumentTest {
	public static void main(String[] args) {
		Guitar guitar= new Guitar();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		System.out.println("-----");
		Cello cello = new Cello();
		cello.tuneStrings();
		cello.play();
		cello.bowing();
		cello.bigBowing();
	}
}
abstract class MusicalInstrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument {

	@Override
	void tuneStrings() { //4. implemented
		System.out.println("Tuning the strings of Guitar....");
	}

	@Override
	void play() { //4. implemented
		System.out.println("Playing the Guitar....");
	}
	void pluck() { //1. exclusive
		System.out.println("Plucking the Guitar....");
	}
}
class Violin extends StringBasedMusicalInstrument {

	@Override
	void tuneStrings() { //4. implemented
		System.out.println("Tuning the strings of Violin ....");
	}

	@Override
	void play() { //4. implemented
		System.out.println("Playing the Violin ....");
	}
	void bowing() { //1. exclusive
		System.out.println("Bowing the Violin ....");
	}
}

class Cello extends Violin  {

	@Override
	void tuneStrings() { //4. implemented
		System.out.println("Tuning the strings of Cello....");
	}

	@Override
	void play() { //4. implemented
		System.out.println("Playing the Cello....");
	}
	void bigBowing() { //1. exclusive
		System.out.println("Bowing the Cello ....");
	}
}

/*
  visualize a MusicalInstrument
  visualize a StringBasedMusicalInstrument
  visualize a Guitar
  visualize a ElectronicGuitar
*/



/*
abstract class A {
	abstract void fun();
}

abstract class B extends A {
	
}
class C extends B {
	
}*/






