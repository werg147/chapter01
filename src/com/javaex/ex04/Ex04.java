package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int c;
		int sum = 0;
		
		for(c=1; c<=10; c++) {
			sum = sum+c;
		}
		
		System.out.println("1부터 10까지의 정수의 합은 " + sum + " 입니다.");	
		//반복문 밖에 프린트해서 과정이 출력되지는 않음
		
		sc.close();

	}

}
