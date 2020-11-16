package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//초기값, 조건식, 증감식
		
		int i = 0;
		
		while(i<5) {
			System.out.println("I like you");
			i ++; //증감문
		}
		
		// i=0 0<5  -->  t 출력  0 --> 1
		//     1<5 --> t  출력  1 --> 2
		//     2<5 --> t  출력  2 --> 3
		//     2<5 --> t  출력  3 --> 4
		//     2<5 --> t  출력  5 --> 6
		//     5.5 --> t
		
		
		
		sc.close();
	}

}
