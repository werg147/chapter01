package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("월을 입력하세요");
		int mon = sc.nextInt();
		
		switch(mon) {
		 case 1:
			 System.out.println("1월이면 \"31일\"");
			 break;
		 case 2:
			 System.out.println("2월이면 \"28일\"");
			 break;
		 case 3:
			 System.out.println("3월이면 \"31일\"");
			 break;
		 case 4:
			 System.out.println("4월이면 \"30일\"");
			 break;
		 case 5:
			 System.out.println("5월이면 \"31일\"");
			 break;
		 case 6:
			 System.out.println("6월이면 \"30일\"");
			 break;
		 case 7:
			 System.out.println("7월이면 \"31일\"");
			 break;
		 case 8:
			 System.out.println("8월이면 \"31일\"");
			 break;
		 case 9:
			 System.out.println("9월이면 \"30일\"");
			 break;
		 case 10:
			 System.out.println("10월이면 \"31일\"");
			 break;
		 case 11:
			 System.out.println("11월이면 \"30일\"");
			 break;
		 case 12:
			 System.out.println("12월이면 \"31일\"");
			 break;
		
		}
		sc.close();

	}

}
