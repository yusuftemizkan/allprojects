package com.sprintqa.java.class12;

public class SumOfEachRow {

	public static void main(String[] args) {
		
		int numbers[][]={{10,20,30,35},{40,50,60,65},{70,80,90,95}};
		int sum=0;
for(int i=0;i<numbers.length;i++)
{
	for(int j=0;j<numbers[i].length;j++) {
		sum=sum+numbers[i][j];
		
	}
	System.out.print("sum of the numbers of row "+(i+1)+" = "+sum);
	sum=0;
	System.out.println();
		}
	}

}
