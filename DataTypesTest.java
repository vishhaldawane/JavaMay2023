package com.sbi;

public class DataTypesTest {
	public static void main(String[] args) {
		
		//-128....0....127
		byte  nurseryRollNumber=120;
		short collegeRollNumber=30000;
		int   universityRollNumber=2147483647;
		long  internationalUniversityNumber=9223372036854775807L;
		
		float simpleInterest = 3.55f;
		double compoundInterest = 56.23;
		
		System.out.println("Byte          : "+nurseryRollNumber);
		System.out.println("Size of byte  : "+Byte.SIZE);
		System.out.println("---------------");
		System.out.println("Short         : "+collegeRollNumber);
		System.out.println("Size of short : "+Short.SIZE);
		System.out.println("---------------");
		System.out.println("Int           : "+universityRollNumber);
		System.out.println("Size of int   : "+Integer.SIZE);
		System.out.println("---------------");
		System.out.println("Long          : "+internationalUniversityNumber);
		System.out.println("Size of long  : "+Long.SIZE);
		System.out.println("---------------");
		System.out.println("Float         : "+simpleInterest);
		System.out.println("Size of Float : "+Float.SIZE);
		System.out.println("---------------");
		System.out.println("Double        : "+internationalUniversityNumber);
		System.out.println("Size of Double: "+Double.SIZE);
		System.out.println("---------------");
		
		String city="Belapur";
		String bankName="State Bank Of India";
		
		System.out.println("City     : "+city);
		System.out.println("BankName : "+bankName);
		String address = bankName +" is at "+city;
		System.out.println("address  : "+address);
		
		boolean isMarried=true; //1 or 0
		
		if(isMarried)
			System.out.println("Yes im married");
		else
			System.out.println("No, im NOT married");
		
		char alpha='Y'; //single letter in single quotes
			//ASCII = 8 bits but UNICODE is 16 bits 
		
		System.out.println("alphabet is  : "+alpha);
		System.out.println("Size of char : "+Character.SIZE);
		
		
	}
}
