package com.sprintqa.java.class7;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=20,choice, UserChoice;
		
		do {
		System.out.println("Please enter operation to perform ");
		System.out.println("1 for add");
		System.out.println("2 for subt");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
		System.out.println(num1+num2);break;
		case 2:
			System.out.println(num1-num2);break;
		case 3:
			System.out.println(num1*num2);break;
		case 4:
			System.out.println(num2/num1);break;
			default:
				System.out.println("Please enter the number between 1 to 4");	
		}
		System.out.println("do you want to try one more time(1 for yes/2 for no");
		UserChoice=sc.nextInt();
		}
		while(UserChoice==1);
		System.out.println("thank you for trying");
}}
