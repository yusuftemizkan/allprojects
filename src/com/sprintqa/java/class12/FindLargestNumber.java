package com.sprintqa.java.class12;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the largest number
		int numbers[]= {10,35,67,89,10,45,111,65,40,8,};
		int max=numbers[0];
		int min=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
			if(numbers[i]<min) {
				min=numbers[i];
			}
		
		
		}
		System.out.println("max number in the array is "+max);
		System.out.println("min number in the array is "+min);
	}
		
}
