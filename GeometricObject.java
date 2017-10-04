
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**Construct a default geometric object*/
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/** Construct a geometric object with the specified color 
	 * and filled with value */
	public GeometricObject(String color , boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** Return color */
	public String getColor() {
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** Return filled. since filled is boolean , its getter method is name isFilled */
	public boolean isFIlled() {
		return filled;
	}
	/** set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	/** return a string representation of this object */
	public String toString() {
		return "created on" + dateCreated + "\ncolor:  " + color + " and filled :  " + filled;
	}


//Abstract method getArea
public abstract double getArea();

//abstract method
public abstract double getPerimeter();
}