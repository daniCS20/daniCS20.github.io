/*
* lamp.java
* Author: Daniela Murcia
* Submission Date: 11/8/2018
*
* Purpose: The purpose of the lamp class is 
* to light the lmamp so that I can access it 
* in the Adventure class which contains the main method. 
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
CSCI 1301: Project 4 Page 5
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
public class Lamp {
	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	private boolean isLit;

	public void setLit(boolean isLit) {
		this.isLit=isLit;
		
	}
	

	public boolean isLit() { 
		if (isLit==true) {
			return true;
		} 
		else {
			return false;
		}
	}


}
