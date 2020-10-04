package com.sprintqa.java.class11;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
				
				System.out.println("enter the number =");
				int num1= sc.nextInt();
int sum=0,lastdigit;
//1+2+3=6 write a program calculating sum of the digits of a given number.
	while(num1>0) {
	lastdigit=num1%10;
	sum=sum+lastdigit;
		num1=num1/10;
	}
	System.out.print("sum of the digit of a given number = "+sum);
	}

}
