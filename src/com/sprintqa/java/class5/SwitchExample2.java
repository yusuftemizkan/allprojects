package com.sprintqa.java.class5;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		int num1=10,num2=20,choice;
		
			
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
		
	}

}
