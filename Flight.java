
public class Flight {
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	
	public Flight(int flightNumber, String flightName, String flightSource, String flightDestination) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
	}

	public Flight(int flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}

	public Flight(String flightSource, String flightDestination) {
		super();
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
	}
	
	public void fly() {
		System.out.println("Flying ..... ");
	}
	public void land() {
		System.out.println("Landing ..... ");
	}
}
