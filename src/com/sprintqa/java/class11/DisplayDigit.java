package com.sprintqa.java.class11;

import java.util.Scanner;

public class DisplayDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		while(num1!=0) {
			System.out.println((num1%10));
			num1=num1/10;
	}

}}
