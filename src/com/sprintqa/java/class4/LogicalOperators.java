package com.sprintqa.java.class4;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		int age,weight;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		System.out.println("enter your weight");
		weight=sc.nextInt();
		if(age<50 && weight<50) {
			
			
			System.out.println("you are fit");}
			else {
				System.out.println("you need to exercise daily");
			}
		
		}
	}


