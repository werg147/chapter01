package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("숫자를 입력하세요.");
		 
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		} else if(num%2==1) {
			System.out.println("홀수입니다.");
		} else if(num==0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		*/
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num>0) { //양수일때
			if(num%2==0) {
				// 짝수일때 코드
				System.out.println("짝수");
			} else {
				// 짝수가 아닌 나머지(홀수일때) 코드
				System.out.println("홀수");
				}
			}
			
			
		else if(num<0) {
			System.out.println("음수");
		} else {
			System.out.println("0");	
		}
		
		
		
		sc.close();
		
	}
	
}
