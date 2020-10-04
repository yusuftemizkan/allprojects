package com.sprintqa.java.class7;

import java.util.Scanner;

public class ForLoopExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int i=1,k=10;
		
	//for( i<=10;k>=1;i++;k--) {System.out.println(i,k);
		
	//
		System.out.println("how many extra sales you have this week?");
	int totalweekly;
		Scanner sc=new Scanner(System.in);
	int extrasale=sc.nextInt();
	totalweekly=800+extrasale*200;
	if(extrasale>10) {System.out.println("total weekly="+totalweekly);
	}else
	System.out.println("total weekly=800");
		}}
		

