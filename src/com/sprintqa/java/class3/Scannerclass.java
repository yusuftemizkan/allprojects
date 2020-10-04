package com.sprintqa.java.class3;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		System.out.print("user has entered "+num);
	}

}
