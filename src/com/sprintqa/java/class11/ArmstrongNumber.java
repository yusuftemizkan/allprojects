package com.sprintqa.java.class11;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//num1=173
//1^3+7^3+3^3=173
//173 is a armstrong number
		
		int num1=173,lastdigit,sum=0,backupnum1=num1;
		while(num1!=0) {
			
			lastdigit=num1%10;
			num1=num1/10;
			
			sum=sum+lastdigit*lastdigit*lastdigit;
	}
System.out.println(sum);
System.out.println(backupnum1);
if(sum==backupnum1) {System.out.println("number is amstrong");}
else {System.out.println("number is not amstrong");}
}}
