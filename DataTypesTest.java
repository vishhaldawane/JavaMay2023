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
		
		
		
	}
}
