package com.sprintqa.java.class11;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
boolean flag=true;
if(num1==0||num1==1) {System.out.println("it is not a prime number");}
else {
	for(int i=2;i<num1;i++) {
		if(num1%i==0) {
			System.out.println("it is not a prime number");
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("it is a prime number");
	}
}
System.out.println("end of the program and chose a new number");
}
	}


