package com.sprintqa.java.class12;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// write a program number of digit of a given number
		Scanner sc= new Scanner(System.in);
		System.out.println("write a number");
		int num1=sc.nextInt();
		int count=0;
		
	while(num1>0) { 
		num1=num1/10;
		
		count++;
	}
	System.out.println("number of digits = "+count);
	}

}
