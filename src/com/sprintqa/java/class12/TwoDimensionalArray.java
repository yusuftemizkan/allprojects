package com.sprintqa.java.class12;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int numbers[]={10,20,30} declaring one dimensional array
		int numbers[][]={{10,20,30,10},{40,50,60,40},{70,80,90,70}};//declaration of two dimensional array
	//numbers.length is the number of rows
		//System.out.print(numbers[1].length); number of columns
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
