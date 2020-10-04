package com.sprintqa.java9;

import java.util.Scanner;

public class NestedForLoop2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numberofrows=sc.nextInt();
		int numberofcolumns=sc.nextInt();
		for(int i=1;i<=numberofrows;i++) {
			for(int j=1;j<=numberofcolumns;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
