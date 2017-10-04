
/*
* ClassifyMessage.java
* Author: Daniela Murcia 
* Submission Date: September 15 , 2017
* Purpose:The program evaluates a user-inputed string and splits it up and assigns it 
* to the designated variable. Also, this allowed for us to explore enum declaration and 
* variable ussage. I had never used enum before so I thought that was interesting.
* IN addition, this program required us to practice creating simple and complex conditional 
* statements. And finally, I practiced creating boolean variables.  
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
public class ClassifyMessage {

	//constants

	enum MessageCategory { NEED, OFFER , ALERT , INFO , UNKNOWN }
	public static final double south=39.882343;
	public static final double north=40.231315;
	public static final double west=-105.743511;
	public static final double east=-104.907864;
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
	
		
		
	String payload;
	double latitude;
	double longitude;
	boolean isInRange;
	MessageCategory category;
	System.out.println("Please enter a formatted message: " );	
	String catString=input.next();
	latitude=input.nextDouble();
	longitude=input.nextDouble();
	payload=input.nextLine();
	catString=catString.trim();
	payload=payload.trim();
	
	if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) { 
		category=MessageCategory.ALERT;
	} 
	else if (catString.equalsIgnoreCase("need")) {
		category=MessageCategory.NEED;
	}
	else if (catString.equalsIgnoreCase("offer")) {
		category=MessageCategory.OFFER;
	}
	else if  (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
		category=MessageCategory.INFO;
		
	}
	else {
		category=MessageCategory.UNKNOWN;
	}
	
	if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) {
		isInRange=true;
	}
	else { isInRange=false;
	}
	System.out.println("Category:" + "\t" + category);	
	System.out.println("Raw Cat: " + "\t" + catString);
	System.out.println("Message: " + "\t" + payload);
	System.out.println("Latitude: " + "\t" + latitude);
	System.out.println("Longitude: " + "\t" + longitude);
	System.out.println("In Range: " + "\t" + isInRange);
	}
	}
