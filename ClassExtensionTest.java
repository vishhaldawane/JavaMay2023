class Hospital
{
	//polymorphic function
	void heartOperationTheatre(Doctor d) {
		if(d instanceof HeartSurgeon) {
			HeartSurgeon x = (HeartSurgeon) d;
			x.diagnose();
			x.doSurgery();
			x.doHeartSurgery();
		}
	}
}

public class ClassExtensionTest {
	public static void main(String[] args) {
		//HeartSurgeon x = new HeartSurgeon();
		//Surgeon x = new Surgeon();
		//Doctor x = new Doctor();
		Doctor x = new HeartSurgeon();
		
		Hospital hospital = new Hospital();
		hospital.heartOperationTheatre((HeartSurgeon)x);
		
		
		 
	/*	x.diagnose();
		x.doSurgery(); //not possible , because it is exclusive function of the child
		x.doHeartSurgery();
		*/
		
		
		if(x instanceof Doctor) {
			System.out.println("Yes, x is a Doctor as well");
		}
		else {
			System.out.println("No, x is not a Doctor");
		}
		
		System.out.println("-------------");
		
		if(x instanceof Surgeon) {
			System.out.println("Yes, x is a Surgeon as well");
		}
		else {
			System.out.println("No, x is not a Surgeon");
		}
		
		System.out.println("-------------");
		
		if(x instanceof HeartSurgeon) {
			System.out.println("Yes, x is a HeartSurgeon ");
		}
		else {
			System.out.println("No, x is not a HeartSurgeon");
		}
		
	}
}

class Doctor
{
	void diagnose() {
		System.out.println("Doctor:diagnose()...ENT checkup BP checking....");
	}
}

class Surgeon extends Doctor
{
	void diagnose() { //redefining - overriding
		System.out.println("Surgeon:diagnose()...X..ray...CT scan...");
	}
	void doSurgery() {
		System.out.println("Surgeon:doSurgery().....");
	}
}

class HeartSurgeon extends Surgeon
{
	void diagnose() { //redefining - overriding
		System.out.println("HeartSurgeon:diagnose()...ECG....");
	}	
	void doHeartSurgery() {
		System.out.println("HeartSurgeon:doHeartSurgery().....");
	}
}
