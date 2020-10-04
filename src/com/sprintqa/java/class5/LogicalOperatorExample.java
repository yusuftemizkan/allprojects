package com.sprintqa.java.class5;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		char input;
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine().charAt(0);
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u') {
			System.out.println("wovel");
		}
	}

}
