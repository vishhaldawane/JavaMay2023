package com.sbi;

public class FunctionTest {
	public static void main(String[] args) {	
		MyFunctions myFun = new MyFunctions();
		myFun.clearScreen();
		myFun.gotoLocation(20.5f, 30.7f);
		float avg = myFun.findAverage(10, 20,30);
		System.out.println("Average is : "+avg);
		double distance = myFun.findTheDistanceBetweenSunAndEarth();
		System.out.println("Distance between The Earth and The Sun is "+distance);
	}
}
class MyFunctions {
	void clearScreen() { //1st
		System.out.println("Clearning screen...");
	}
	void gotoLocation(float longitude, float lattitude) {//2nd
		System.out.println("Going to a location of longitude : "+longitude+" and lattitude : "+lattitude);
	}
	float findAverage(int x, int y, int z) {//3rd
		return (x+y+z)/3.0f; 
	}
	double findTheDistanceBetweenSunAndEarth() {	//4th
		return 186000.519 * 480 ;
	}
}