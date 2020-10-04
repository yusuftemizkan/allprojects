package com.sprintqa.java.class5;

import java.util.Scanner;

public class ExampleTriangle1 {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int num1, num2,num3,result;
		
		System.out.println("enter side 1");
		num1=sc.nextInt();
		System.out.println("enter side 2");
		num2=sc.nextInt();
		System.out.println("enter side 3");
		num3=sc.nextInt();
	
		result=num1+num2+num3;
		System.out.println("perimeter of triangle= "+result);*/

		speak("yusuf");
		int n= sum(3,5);
		System.out.println("sonuc:"+n);
}
public static void speak(String name)	{
System.out.println("my name is "+name);
	
}

public static int sum(int n1,int n2)	{
int result=n1+n2;
return result;
	
}




}
