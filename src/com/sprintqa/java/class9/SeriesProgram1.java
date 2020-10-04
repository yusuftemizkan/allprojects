package com.sprintqa.java9;

public class SeriesProgram1 {
	public static void main(String[] args) {
		int sum=0,sum1=0,sum2=0;
		for(int i=1;i<=10;i++) {
			sum1=sum1+i;
			sum2=sum2+(11-i);
			sum=sum1+sum2;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
