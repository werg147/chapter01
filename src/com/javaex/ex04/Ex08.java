package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int s = 6;
		int x;
		int y;

		for(y=0; y<6; y++) {
			for(x=1; x<=s; x++) {
				System.out.print("*");	
			}
			System.out.println("");
		}

	
		sc.close();

	}

}
