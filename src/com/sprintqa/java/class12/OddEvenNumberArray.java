package com.sprintqa.java.class12;

public class OddEvenNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//finding total number of odd numbers and even numbers
		int numbers[]= {12,65,78,1,6,45,71,65,34,89},evencount=0,oddcount=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				evencount++;
			}else {oddcount++;}
		}
		System.out.println("numberof even numbers = "+ evencount);
		System.out.println("numberof odd  numbers = "+ oddcount);
	}

}
