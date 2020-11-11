package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi = 3.14;
		//일반적인경우
		
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값을 변경하는 경우
		//pi= 3.141519; 위 상수가 되어 오류발생
		double result02 = pi*5*5;
		System.out.println(result02);
		
		System.out.println(pi);
		
		
		//상수정의
		final double PI = 3.14; //상수의 경우 구분해주기 위해 변수이름을 대문자로 적는 편이다
		
		double result03 = PI*5*5;
		System.out.println(result03);

	}

}
