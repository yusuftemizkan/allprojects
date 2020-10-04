package com.sprintqa.java.class3;

import java.util.Scanner;

public class Ladderifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("it is Monday");}
			else if(num==2) {
				System.out.println("it is Tuesday");
			}
			else if(num==3) {
				System.out.println("it is Wednasday");
		}
			else if(num==4) {
				System.out.println("it is Thursday");
		}
			else if(num==5) {
				System.out.println("it is Friday");
	}
			else if(num==6) {
				System.out.println("it is Saturday");}
			else if(num==7) {
				System.out.println("it is Sunday");}
			else {
				System.out.println("please try again and enter a number between 1 and 7");
				
			}
	}}
			
		


