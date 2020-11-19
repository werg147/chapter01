package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while(true) {
			if(num%6==0 && num%14==0) {
				System.out.println(num);
				break;
			}
			num++;	
		}

		sc.close();
		
		
		
	}

}
