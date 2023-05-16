
public class FlightTest {
	public static void main(String[] args) {
		Flight flight = new Flight(101, "Air India", "Mumbai", "Delhi", "public", "domestic");
		System.out.println("flight : "+flight);// it invokes the toString() internally 
		
		String str = flight.toString();
		System.out.println("str : "+str);
		
	}
}
class Flight
{
	private int flightNumber;
	private String careerName;
	private String source;
	private String destination;
	private String type;
	private String airportType;
	
	public Flight(int flightNumber, String careerName, String source, String destination, String type,
			String airportType) {
		super();
		this.flightNumber = flightNumber;
		this.careerName = careerName;
		this.source = source;
		this.destination = destination;
		this.type = type;
		this.airportType = airportType;
	}
	
	
	public Flight(int flightNumber, String careerName, String source) {
		super();
		this.flightNumber = flightNumber;
		this.careerName = careerName;
		this.source = source;
	}


	public Flight(int flightNumber, String careerName) {
		super();
		this.flightNumber = flightNumber;
		this.careerName = careerName;
	}


	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", careerName=" + careerName + ", source=" + source
				+ ", destination=" + destination + ", type=" + type + ", airportType=" + airportType + "]";
	}

}
