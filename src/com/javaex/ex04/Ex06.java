package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int num;
		int mul;
		
		for(num=1; num<=9; num++) {
			dan = 2;
			mul = dan*num;
			System.out.println(dan + " * " + num + " = " + mul);
		}
		
		System.out.println();
		
		for(num=1; num<=9; num++) {
			dan = 3;
			mul = dan*num;
			System.out.println(dan + " * " + num + " = " + mul);
		}
		
		System.out.println();
		
		for(num=1; num<=9; num++) {
			dan = 4;
			mul = dan*num;
			System.out.println(dan + " * " + num + " = " + mul);
		}
		
		System.out.println();
		System.out.println(".... 중간생략");
		
		for(num=1; num<=9; num++) {
			dan = 9;
			mul = dan*num;
			System.out.println(dan + " * " + num + " = " + mul);
		}
		
		
		
		
		sc.close();

	}

}
