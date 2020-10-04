package com.sprintqa.java.class5;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int choice;
		System.out.println("enter number...");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Monday");break;
		case 2:
			System.out.println("Tuesday");break;
		case 3:
			System.out.println("Wednesday");break;
		case 4:
			System.out.println("tue");break;
		case 5:
			System.out.println("fri");break;
		case 6:
			System.out.println("sat");break;
				
		case 7:
			System.out.println("sun");break;
			default:
				System.out.println("Please enter the number between 1 to 7");	
		}
	}

}
