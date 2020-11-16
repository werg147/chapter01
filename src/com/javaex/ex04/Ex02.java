package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		
		//단 입력
		int dan = sc.nextInt();
		
		//초기값
		int i = 1;
		
		while(i<10) { //조건식
			System.out.println(dan + " * " + i + " = " + (dan*i));
			i++; //증감식
		}
		
		
		
		sc.close();
		
	}
	
}
