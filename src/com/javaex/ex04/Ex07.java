package com.javaex.ex04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int num;
		int mul;
		
		for(dan=2; dan<=9; dan++) {
			for(num=1; num<=9; num++) {
				mul = dan*num;
				System.out.println(dan + " * " + num + " = " + mul);
				//System.out.println(dan + " * " + num + " = " + dan*num);
			}
		}
		
		sc.close();
	}
}