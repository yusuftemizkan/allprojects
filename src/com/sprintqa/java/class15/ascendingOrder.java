package com.sprintqa.java.class15;

public class ascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to sort numbers in ascending order
		int numbers[]= {3,2,5,65,34,23,90};
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<numbers[0]) {
				min=numbers[i];
			}
			
		}
		System.out.println(min);
		
	}

}
