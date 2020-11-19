package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				continue;
				//break;
				//System.out.println("출력안됨 break");
			}
			System.out.println(i);
		}

	}

}
