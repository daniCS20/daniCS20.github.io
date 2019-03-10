/*
* Chest.java
* Author: Daniela Murcia
* Submission Date: 11/8/2018
*
* Purpose: The purpose of the chest class is 
* to check if the chest is locked, reveal the contents, and to lock if needed.
* This class exists to interact with the ASdventure class
* in order to play the game. 
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
public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */
	private boolean isLocked;
	private String contents;
	private Key key;
	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key theKey) {
		if (isLocked==false) {
			isLocked=true;
			key= theKey;
			//here the key is locked 
		}
		else {
			System.out.println("The chest is already unlocked");
		}
	}
	
	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) {
		if (isLocked==true && key==theKey) {
			
			isLocked=false;
		}
		else {
			System.out.println("Cannot open chest");
		}
	}
	
	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() {
		if (isLocked==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() {
		return contents;
	}
	
	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) {
		this.contents=contents;
	}
	
	
	
}
