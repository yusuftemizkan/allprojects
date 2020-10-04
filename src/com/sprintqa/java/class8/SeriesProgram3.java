package com.sprintqa.java.class8;

public class SeriesProgram3 {

	public static void main(String[] args) {
		//addition of even numbers from 1 to 10

		int evensum=0;
		for(int i=1;i<=10;i++) {
		if(i%2==0) {evensum=evensum+i;
		}
		}
		System.out.println(evensum);
	}
	
}

