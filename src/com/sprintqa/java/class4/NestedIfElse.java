package com.sprintqa.java.class4;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int age,weight;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		
		
		if(age<18) {
			System.out.println("you are not aligible");
		}else {System.out.println("enter your weight");
			weight=sc.nextInt();
		if(age>=18) { if(weight>=50) {
			System.out.println("you are eligible");
		}else {
				System.out.println("you are not eligible");};
		}}
		}}
	
		

	


