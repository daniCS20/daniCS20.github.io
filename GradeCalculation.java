/*
* GradeCalculation.java
* Author: Daniela Murcia
* Submission Date: September 22, 2017 *
* Purpose: The purpose of this program is to calculate your grade 
* based off of a long series of if and else statements. This was a 
* very tedious program to write that required lots of patience and new
* strategy. I utilized System.exit(); after an else to terminate the program. 
* This program also tells the user what score they need in order to reach goal score.
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
public class GradeCalculation {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	//initial variables and cover page
	String answerScoreForExam2;
	String answerForLabAv;
	double averageLabGrade;
	String answerKnowProjAv;
	double  averageProjectGrade;
	String answerQuizAv;
	double averageQuizAv;
	String attendanceAnswer;
	int averageAttendGrade;
	String answerScore;
	double scoreExam2 =0;
	String answerOnFinalExam;
	double currentScore;
	int finalExamScore;
	double scores = 0;
	double totalWeight = 0;
	String letterGrade;
	double finalOverallScore=0;
	double avgToFinalLetterGrade;
	System.out.println("Grading Scale:");
		System.out.println("A" + "\t" + "90 - 100");
		System.out.println("B" + "\t" + "80 - 89");
		System.out.println("C" + "\t" + "70 - 79");
		System.out.println("D" + "\t" + "60 - 69");
		System.out.println("F" + "\t" + "Below 60");
		System.out.print("What letter grade do you want to achieve for the course?");  
   
		String desiredGrade=input.nextLine(); 
		if (desiredGrade.equalsIgnoreCase("A") || desiredGrade.equalsIgnoreCase("B") || desiredGrade.equalsIgnoreCase("C") || desiredGrade.equalsIgnoreCase("D") || desiredGrade.equalsIgnoreCase("F") )
		{
		
		
		if (desiredGrade.equals("A")){
			finalOverallScore=90;
		}
		else if (desiredGrade.equals("B")) {
			finalOverallScore=80;
		}
		else if (desiredGrade.equals("C")) {
			finalOverallScore=70;
		}
		else if (desiredGrade.equals("D")) {
			finalOverallScore=60;
		}
		else {
			finalOverallScore=0;
		}
		}
		else {
			System.out.println("Input Error");
			System.exit(0);
			
		}
		System.out.println("Enter Percentage Weights:");
		System.out.print("Exam 1: " + "\t" );
	
		int exam1=input.nextInt();
		System.out.print("Exam 2: " +  "\t"  );
		int exam2=input.nextInt();
		System.out.print("Final Exam: " + "\t" );
		int finalExam=input.nextInt();
		System.out.print("Labs:    " + "\t" );
		int labs=input.nextInt();
		System.out.print("Projects: " + "\t" );
		int projects=input.nextInt();
		System.out.print("Attendance: " + "\t" );
		int attendance=input.nextInt();
		System.out.print("Quizzes: " + "\t" );
		int quizzes=input.nextInt();
		
				
				System.out.println("Enter your score out of 100: " + "\t" );
		double scoreOutOf100= (exam1 + exam2 + finalExam + labs + projects + attendance + quizzes);
//Do total grades == 100 
			if (scoreOutOf100 != 100) {
				System.out.print("Weights don't add up to 100, program exiting...");
	         }
		
  
				
  //Exam Score 1
				System.out.print("Do you know Exam Score 1?");
				answerScore = input.next();

					if ((answerScore.equalsIgnoreCase("y" ) || (answerScore.equalsIgnoreCase("yes")))) {

						System.out.print("Score received on exam 1: ");
						int scoreForExam1=input.nextInt();
						scores += (scoreForExam1*exam1);
						totalWeight += exam1;
						//ask if they know score 2 
						System.out.print("Do you know score for Exam 2? ");
						answerScoreForExam2=input.next();
						
	 //nested if statement about whether or not score 2 exists 
							if ((answerScoreForExam2.equalsIgnoreCase("yes") || (answerScoreForExam2.equalsIgnoreCase("y")))) {
								System.out.print("Score received on Exam2: ");
								scoreExam2=input.nextInt(); //ask about final exam
								scores += (scoreExam2*exam2);
								totalWeight += exam2;
								System.out.print("Do you know your Final Exam score?");
								answerOnFinalExam=input.next();
							 //nested 
								if (answerOnFinalExam.equalsIgnoreCase("y") || answerOnFinalExam.equalsIgnoreCase("yes")) {
								   System.out.print("Score received on final exam: ");
								   finalExamScore=input.nextInt();
								   scores += (finalExamScore*finalExam);
									totalWeight += finalExam;
								   System.out.print("Do you know your lab average? ");
								}
							}
					}
							
	//nested else for when the user doesn't know score 2
							
								System.out.print("Do you know your lab average? ");
							
							 answerForLabAv=input.next();
							 //if you know your lab average 
							if ((answerForLabAv.equalsIgnoreCase("y")) || (answerForLabAv.equalsIgnoreCase("yes"))){
								//whats the lab grade then?
								System.out.print("Average Lab Grade: " );
								averageLabGrade=input.nextInt();
								scores += (averageLabGrade*labs);
								totalWeight += labs;
				
							}
							
							System.out.print("Do you know your project average?" );
							answerKnowProjAv=input.next();
								
	                                if ((answerKnowProjAv.equalsIgnoreCase("yes") || (answerKnowProjAv.equalsIgnoreCase("y")))){
									 System.out.print("Average Project Grade:"); 
									 averageProjectGrade=input.nextInt();
									 scores += (averageProjectGrade*projects);
										totalWeight += projects;
								}
								//String answerQuizAv;
								//double averageQuizAv;
								System.out.print("Do you know your quiz average?");
								 answerQuizAv=input.next();
								if ((answerQuizAv.equalsIgnoreCase("yes") || ((answerQuizAv.equalsIgnoreCase("y"))))) {
									  System.out.print("Average Quiz Grade: "); 
								         averageQuizAv=input.nextInt();
								         scores += (averageQuizAv *quizzes);
											totalWeight += quizzes;
								}
	    	             
				 
	            
	     System.out.print("Do you know your attendance average?");
							
	      //answer despite if / else 
			attendanceAnswer=input.next();
	   
      if ((attendanceAnswer.equalsIgnoreCase("y")) || (attendanceAnswer.equalsIgnoreCase("yes"))) {
	System.out.print("Average Attendance Grade: ");
	       averageAttendGrade=input.nextInt();
	       scores += (averageAttendGrade*attendance);
			totalWeight += attendance;
      }
      //String answerOnFinalExam;
  
currentScore=( scores/totalWeight);
     System.out.printf("Current Grade is: " +  "%.2f",currentScore );
		System.out.print("\n");
     if (currentScore >=90)	{
    	 letterGrade="A";
     }
     else if(currentScore >= 80){
    	 letterGrade="B";
     }
     else if (currentScore >= 70) {
    	 letterGrade="C";
     }
     else if (currentScore >= 60) {
    	 letterGrade="D";
     }
     else   {
    	 letterGrade="F";
    
     }
     System.out.println("Your current letter grade is: " + letterGrade);
     
     avgToFinalLetterGrade=((100 * finalOverallScore - scores) / (100 - totalWeight));	
	
     if (avgToFinalLetterGrade >=90) {
    	 System.out.println("Congratulations!  You received the A that you wanted!");
     }
     else if  (avgToFinalLetterGrade <= 90){
    	 
     System.out.printf("You have to score an average greater than or equal to " +  "%.2f", avgToFinalLetterGrade);
    	System.out.print(	  " to receive an " +  desiredGrade + " in the course");	
	}
	else{
		System.out.printf("Sorry you cannot receive an " + desiredGrade  + " in the course");
	}
		   
	   
	
	}
}

		 
	 
	
			 
