package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int c;
		int sum = 0;
		
		for(c=1; c<=10; c++) {
			sum = sum+c;
			System.out.println(c + " 까지의 합은 " + sum);
		}
		//반복문 안에 프린트해서 F가 나올때까지 결과가 출력됨
		
		sc.close();

	}

}
