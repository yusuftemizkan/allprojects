package com.sprintqa.java.class12;

public class SumOfArrayElementByUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary[]= {2000,5000,4000,1000,500,400,640,1000,3000};//salaries
		int sum=0;
		for(int empSalary:salary) {
			sum=sum+empSalary;
		}
		System.out.println("sum of salary of employees = "+sum);
	}

}
