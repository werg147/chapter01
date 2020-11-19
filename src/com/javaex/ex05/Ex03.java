package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		
		//로또번호 자동생성기
		
		int[] lottoNums = new int[8];
		
		System.out.println(lottoNums.length);
		
		/*
		lottoNums[0] = (int)(Math.random()*45)+1;
		lottoNums[1] = (int)(Math.random()*45)+1;
		lottoNums[2] = (int)(Math.random()*45)+1;
		lottoNums[3] = (int)(Math.random()*45)+1;
		lottoNums[4] = (int)(Math.random()*45)+1;
		lottoNums[5] = (int)(Math.random()*45)+1;
		*/
		
		for(int i=0; i<8; i++) {
			lottoNums[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]);
		}
		
		
	}

}
