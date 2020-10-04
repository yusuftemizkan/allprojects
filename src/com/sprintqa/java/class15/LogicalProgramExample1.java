package com.sprintqa.java.class15;

public class LogicalProgramExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=17;
boolean flag=true;
for(int i=2;i<num1/2;i++) {
if(num1%i==0) {
		flag=false;
		System.out.println("number is not prime");
		break;
		}
}
if(flag==true) {
	System.out.println("number is prime");
}
	}

}
