package myexceptions;

public class DogAgeNegativeException  extends RuntimeException {
	public DogAgeNegativeException (String msg) {
		super(msg);
	}
}

