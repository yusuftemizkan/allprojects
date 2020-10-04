package com.sprintqa.java.class8;

public class ExeciseForLoop2 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=5;i++) {
		sum=sum+i;
		System.out.println("iteration="+i+" value of sum="+sum+" value of I="+i);
		}
		System.out.print(sum);
	}

}
