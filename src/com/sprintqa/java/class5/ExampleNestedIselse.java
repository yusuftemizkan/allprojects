package com.sprintqa.java.class5;

public class ExampleNestedIselse {

	public static void main(String[] args) {
		int dbusername=100;
		int dbpassword=340;
		int username=100;
		int password=340;
		if(dbusername==username) {if (dbpassword==password) {
			System.out.println("login is succesfull");}
			else { 
				System.out.println(" password is incorrect");
			}} else { System.out.println("username is incorrect");
		}
			
		}
	}


