
public class PhoneContact {

	String contactName;
	String contactNumber;
	String contactEmail;
	public PhoneContact(String contactName, String contactNumber, String contactEmail) {
		super();
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
	}
	
	
	
	
	@Override
	public String toString() {
		return "PhoneContact [contactName=" + contactName + ", contactNumber=" + contactNumber + ", contactEmail="
				+ contactEmail + "]";
	}
	
	

}
