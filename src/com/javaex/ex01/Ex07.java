package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		double d01 = 5/4; //1 --> 1.0
		//double d01 =  (double)(5/4);
		System.out.println(d01);
		
		double d02 = (double)5/4; // 5.0/4 --> 1.25
		System.out.println(d02);
		
		double d03 = 5/(double)4; // 5/4.0 -->1.25
		System.out.println(d03);
		
		double d04 = (double)5/(double)4; // 5.0/4.0 --> 1.25
		System.out.println(d04);
		
		int d05 = (int)1.3 + (int)1.8; // 1 + 1 --> 2
		System.out.println(d05);
		
		int d06 = (int)(1.3+1.8); // 1.3+1.8 = 3.1 --> 3
		System.out.println(d06);
		
		
	}

}
