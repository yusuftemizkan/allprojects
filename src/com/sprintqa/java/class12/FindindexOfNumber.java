package com.sprintqa.java.class12;

public class FindindexOfNumber {
//write a program to position a given number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]= {10,35,67,89,10,45,65,40,10,};
int targetNumber=10;

for(int i=0;i<numbers.length;i++) {
	if(targetNumber==numbers[i]) {
		System.out.println("index number = "+i);

	}
}
	}

}
