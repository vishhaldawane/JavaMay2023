class Company
{
	void meeting(Employee x)
	{
		if(x instanceof Director) {
			Director d = (Director) x;
			d.work();
			d.execute();
			d.manage();
			d.direct();
		}
		else {
			System.out.println("Not a director");
		}
		
		if(x instanceof Manager) {
			Manager d = (Manager) x;
			d.work();
			d.execute();
			d.manage();
		}
		else {
			System.out.println("Not a manager");
		}
		//x.work();
		//x.execute();
		//x.manage();
		//x.direct();
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		//Director director = new Director();
		//Director x= new Director();
		
		Employee x  = new Manager();
		
		/*
		x.work();
		x.execute();
		x.manage();
		x.direct();
		*/
		company.meeting(x); // type checking - reflection 
	}
}

class Employee
{
	void work() {
		System.out.println("Employee working....");
	}
}
class Executive extends Employee
{
	void execute() {
		System.out.println("Executive executing....");
	}
}
class Manager extends Executive
{
	void manage() {
		System.out.println("Manager managing....");
	}
}
class Director extends Manager
{
	void direct() {
		System.out.println("Director directing.......");
	}
}
/*
 * 
 * 	 int i=10;
 *   int j=3;
 * 
 * 		float x = (float) i/j;
 * 
 * 
 * */
