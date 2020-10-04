package com.sprintqa.java.class5;

public class LogicalOperatorExample2 {

	public static void main(String[] args) {
		int num1=100,num2=20,num3=30;
		if(num1>num2&&num1>num3) {
			System.out.println(num1+"is the gretest");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println(num2+"is the greatest");}
			else {
				System.out.println(num3+"is the greatest");
			}
		}
	}


