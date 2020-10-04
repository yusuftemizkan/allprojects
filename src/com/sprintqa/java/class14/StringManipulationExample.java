package com.sprintqa.java.class14;

public class StringManipulationExample {

	public static void main(String[] args) {
String str="1234";
System.out.println(str.isEmpty());// it will return true if string is empty

String str1="     Welcome to our world      ";
String expectedTitle="Welcome to our world";

System.out.println(str1);


System.out.println("-------trim------");

System.out.println(str1.trim());//trim removes the blank space before and after the string
	
System.out.println(str1.trim().equals(expectedTitle));


System.out.println("-------replace------");

String str2="i am an automation enginner";
String str3= str2.replace("automation enginner", "programmer");
System.out.println(str2);

System.out.println("-------indexOf------");

System.out.println(str3);
String str4="welcome to the new world. This is my world";
System.out.println(str4.indexOf("world"));
System.out.println(str4.lastIndexOf("world"));

String str5="welcome to the new world. this is your world. This is my world";
System.out.println(str5.indexOf("world", str5.indexOf("world")+1));

System.out.println("-------SubString------");
String str6="welcoem to SpringQA";
System.out.println(str6.substring(11));
System.out.println(str6.substring(str6.indexOf("S")));

String str7="welcome to the new world. this is TURKEY. This is my world";
System.out.println(str7.substring(str7.indexOf("T"), str7.indexOf("Y")+1));

System.out.println("-------format------");
String companyName="Ebay!";
String studentname="yusuf";
String title="Welcome To %s This is %s from %s, learning automation in %s";
System.out.println(String.format(title, companyName,studentname,companyName,companyName));
	

System.out.println("-----compareto-----");
	String str8="SprintQA";
	String str9="Amazon";
	System.out.println(str9.compareTo(str8));
	System.out.println(str8.compareTo(str9));
	System.out.println(str9.compareTo(str9));
	
	System.out.println("-----split-----");
	String str11="Welcome-to-sprintQA";
	String[]words=str11.split("-");
	System.out.println(words[0]);
	System.out.println(words[1]);
	System.out.println(words[2]);
	
	String str12="Welcome To %s This is %s from %s learning automation in %s";
	String[]word=str12.split(" ");
	int sum=0;
	int numberOfWords=0;
	for(int i=0;i<word.length;i++) {
		System.out.println(word[i]);
		numberOfWords=i;
		
	}
	System.out.println("Number of words in the sentence= "+(numberOfWords+1));
	System.out.println(word.length);

	}

}
