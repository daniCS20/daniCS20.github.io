/*
*ParseTheTweet.java
* Author:Daniela Murcia
* Submission Date:September 7, 2017*
* Purpose: The purpose of this program is to practice splitting up tweets into different parts.
* The program below takes in a user inputed tweet, and then identifies the start and finish 
* of each section of tweet based off of a hashtag and a semicolon. That required me to assign 
* characters to a variable, and manipulate it to remove the content of each section throughout 
* the tweet. In addition, I had to utilize an array of string methods, such as .trim()[remove white spaces]
*  , .replace()[replace commas with hyphens] , .toUpperCase()[capitalize all characters in string]
*   , and .substring()["remove"a specific section of a string] in order to extract/modify the individual
*    tweet sections to fit the designated requirements. In order to display everything, I utilized print 
*    statements, and tabing in order to get the job done. 
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia. */





import java.util.Scanner;
public class ParseTheTweet {

public static void main(String[] args) {
Scanner input= new Scanner(System.in);
	String userInput;
	userInput=input.nextLine();
	int start=5;
	int semiColonVar=userInput.indexOf(";");
	int finish=semiColonVar;

//Type
	String Type=userInput.substring(start,finish);
	String trimmedType=Type.trim();
System.out.println("Type:" + "\t"  + "\t" + trimmedType.toUpperCase());

//Detail
	String Detail=userInput.substring(semiColonVar + 1);
	start=5;
	int semiColon2=Detail.indexOf(";");
	finish=semiColon2;
	String DetailPart2=Detail.substring(start, finish);
	String NoCommas=DetailPart2.replace(","  , "-");
	String trimmedDetail=NoCommas.trim();
System.out.println("Detail:"  + "\t"  + "\t"+ trimmedDetail);

//Location
	String Location=Detail.substring(semiColon2 + 1);
	start=5;
	int semiColon3=Location.indexOf(";");
	finish=semiColon3;
	String LocationPart2=Location.substring(start, finish);
	String NoComma=LocationPart2.replace("," ,  "-");
	String trimmedLocation=NoComma.trim();
System.out.println("Location:" + "\t" + trimmedLocation);

//Latitude
	String Latitude=Location.substring(semiColon3 + 1);
	start=5;
	int SemiColon4=Latitude.indexOf(";");
	finish=SemiColon4;
	String LatitudePart2=Latitude.substring(start, finish);
	String trimmedLatitude=LatitudePart2.trim();
System.out.println("Latitude:" + "\t" +trimmedLatitude);	

//Longitude
	String Longitude=Latitude.substring(SemiColon4 + 1);
	start=5;
	int SemiColon5=Longitude.indexOf(";");
	finish=SemiColon5;
	String LongitudePart2=Longitude.substring(start , finish);
	String trimmedLongitude=LongitudePart2.trim();
System.out.println("Longitude:" + "\t"+trimmedLongitude);
}
	
}
