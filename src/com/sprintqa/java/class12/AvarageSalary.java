package com.sprintqa.java.class12;

public class AvarageSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary[]= {2000,5000,4000,1000,500,400,640,1000,3000};//salaries
		int sum=0, avarage=0;
		for(int i=0;i<salary.length;i++) {
		sum=sum+salary[i];
		System.out.println( salary[i]);

		}
		avarage=sum/salary.length;
		System.out.println("avarage salary= "+avarage );} //avarage salary	}

}
