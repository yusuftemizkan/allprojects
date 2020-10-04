package com.sprintqa.java.class3;

import java.util.Scanner;


public class Ladderifelse2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=10,num2=20;
		System.out.println("Please enter operation to perform ");
		System.out.println("1 for add");
		System.out.println("2 for subt");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		int choice=sc.nextInt();
		
		if(choice==1){ 
		System.out.println(num1+num2);}
		else if(choice==2) {
		System.out.println(num1-num2);}
		else if(choice==3) {
		System.out.println(num1*num2);}
		else if(choice==4) {
		System.out.println(num1/num2);}
		
		
	}

}
