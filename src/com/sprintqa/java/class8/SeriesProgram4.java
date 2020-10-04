package com.sprintqa.java.class8;

public class SeriesProgram4 {

	public static void main(String[] args) {
		double sum=0;
		double result=1;
		//1/2+2/3+/3/4+.....+10/11
		for(double i=1;i<=10;i++) {
				
			result=i/(i+1);
			sum=result+i/(i+1);
			System.out.println("iteration="+i+" value of sum="+result+" value of I="+i);
	}
		System.out.println(sum);
	}}
