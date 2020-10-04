package com.sprintqa.java.class12;

import java.util.Scanner;

public class SumOfPositiveAndNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]=new int[10];
Scanner sc=new Scanner(System.in);
int positivesum=0,negativesum=0;
for(int i=0;i<10;i++) {
	numbers[i]=sc.nextInt();}
for(int i=0;i<numbers.length;i++) {
if(numbers[i]>0) {
	positivesum=positivesum+numbers[i];
}else {
	negativesum=negativesum+numbers[i];
}
	}
System.out.println("Negativesum= "+ negativesum);
System.out.println("Positivesum= "+ positivesum);
	}}


