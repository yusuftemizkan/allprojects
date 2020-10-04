package com.sprintqa.java.class11;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1234321,sum=0,reversenumber,lastdigit,backupnum1=num1;
		while(num1!=0) {
		lastdigit=num1%10;
		sum=sum*10+lastdigit;
		
		num1=num1/10;
			
		}
		if(sum==backupnum1) {
			System.out.print("it is a Palindrome Number");}
			else {
				System.out.print("it is not a Palindrome Number");
			}
		}
			
		
	}


