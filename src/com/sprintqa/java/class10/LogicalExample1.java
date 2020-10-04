package com.sprintqa.java.class10;

public class LogicalExample1 {
	// program to check given number is prime or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 11;
		boolean flag = true;

		if (k == 0 || k == 1) {
			System.out.print("it is not prime");
		} else {
			for (int i = 2; i <= k/2; i++) {
				if (k % i == 0) {
					System.out.print("it is not prime");
					flag = false;
					break;
				}

			}

			if (flag == true) {
				System.out.print("it is prime");
			}
		}

	}
}
