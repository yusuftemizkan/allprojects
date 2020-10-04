package com.sprintqa.java.class11;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//15=1+3+5
		int num1=28,sum=0;	
		for(int i=1;i<num1;i++)
	
			{if(num1%i==0) {
				sum=sum+i;
				
				
			}
			}
if(num1==sum) {System.out.print("it is a perfect number");}
else {System.out.print("it is not a perfect number");}

	}}
