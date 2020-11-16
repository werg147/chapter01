package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j;
		int s = 6;
		
		for(i=1; i<=s; i++) {
			for(j=1; j<i; j++) {
				System.out.print("*");
				}
			System.out.println("*");
			}

		
		
		
		
		sc.close();

	}

}
