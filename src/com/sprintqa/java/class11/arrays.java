package com.sprintqa.java.class11;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int studentMarks[];//Declaration of array
int choice;

studentMarks=new int[10]; //initianlization of array
Scanner sc =new Scanner(System.in);

for(int i=0;i<10;i++) {
	
System.out.println("Enter a number at position "+i+":");
studentMarks[i]=sc.nextInt();
}
do {
	System.out.println("Enter roll number ;");
	int rollNumber= sc.nextInt();
	System.out.println(studentMarks[rollNumber-1]);
	
System.out.println("do you want to continue ");
choice= sc.nextInt();}
while(choice==1);
}
	}


