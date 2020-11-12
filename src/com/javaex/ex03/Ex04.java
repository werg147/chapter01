package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pay; //급여
		int time; //근무시간
		int unit = 10000; //시급
		
		System.out.print("근무시간: ");
		time = sc.nextInt();
		
		
		if(time>8) {
			//pay = 8*10000 + (time-8)*12000;  //{}괄호 밖으로 나오면 유효하지 않으므로 밖에서도 선언해줘야함	
			pay = 8*unit + (time-8)*((int)(unit*1.5));
		} else {
			pay = time*unit;
		}
		
		
		System.out.println("임금은 " + pay + "원 입니다.");
		
		sc.close();
	}

}
