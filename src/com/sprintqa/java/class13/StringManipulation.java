package com.sprintqa.java.class13;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="hello";
String str2="hello";
String str3=new String("hello");
String actualwebTitle="stock exchange site";
String expectedTitle="This is a stock exchange site";
String strWithUpperCase="WELCOME TO EBAY";
String strWithLowerCase="Welcome to ebay";


//System.out.println(str1==str2);
//System.out.println(str2==str3);
//System.out.println(str2.equals(str3));
//System.out.println(actualwebTitle.length());
//System.out.println(actualwebTitle.contains(expectedTitle));
//System.out.println(expectedTitle.contains(actualwebTitle));
//System.out.println(strWithUpperCase.equalsIgnoreCase(strWithLowerCase));
//System.out.println(actualwebTitle.toUpperCase());
//System.out.println(actualwebTitle.toLowerCase());
//System.out.println(strWithUpperCase.toLowerCase().contains(strWithLowerCase.toLowerCase()));
//	
//	System.out.println(actualwebTitle.charAt(7));
//	
	String original="Merhaba herkese";
	String rev="";
	for(int i=original.length()-1;i>=0; i--)
		{
		rev=rev+original.charAt(i);
		
	}
	System.out.print(rev);

	}

}
