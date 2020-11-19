package com.javaex.ex04;

public class Ex13 {

	public static void main(String[] args) {
		
		int i;
		
		for(i=1; i<21; i++) {
			if(i%2==0 || i%3==0) {
			continue;
			}
			System.out.println(i);
		}
		
		/* 다른표현
		for(i=1; i<21; i++) {
			if(i%2==0 || i%3==0) {
			//어색함
			} else {
			System.out.println(i);
			}	
		} 
		 */
		
		/* 다른표현
		for(i=1; i<21; i++) {
			if(!(i%2==0 || i%3==0)) {
			System.out.println(i);	
			}
		}
		*/	
	}

}
