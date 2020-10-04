package com.sprintqa.java.class11;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to find the reverse of a given number
		int num1=789,sum=0,reversenumber,lastdigit;
		while(num1!=0) {
		lastdigit=num1%10;
		sum=sum*10+lastdigit;
		
		num1=num1/10;
			
		}
		System.out.print(sum);
		}
		
	}


