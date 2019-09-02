package cs1302.genlist;


public class Node<T> {
	private T object;
	private Node <T> next;
	
	
	/**
	 * This is the Node constructor that sets my private T object 
	 * to null, and sets my next to null as well.
	 */
	public Node() {
		this.object = null;
		this.next = null;
	}
	
	
	
	/**
	 * This node constructor passes in an object of Type T 
	 * and sets the object to the object and the next to null. 
	 * @param object
	 */
	public Node(T object) {
	this.object = object;
	this.next =null;
	
	}
	
	
	/**
	 * The following method sets the value of next to whatever is passed in. 
	 * @param next
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	/**
	 * The following method gets and then returns an object. 
	 * @return
	 */
	
	public  T getObj() {
		return object;
	}
	
	
	/**
	 * The following method 
	 * @return
	 */
	public  Node<T> getNext() {
		return next;
	}
	
	
	
	
	/**
	 * The following method sets the object to whatever is passed in. 
	 * @param object
	 */
	
	public void setObj(T object) {
		this.object=object;
	}
	
	
	/**
	 * This interface represents a generic order of objects. 
	 * 
	 *
	 * @param <T>
	 */
	
	

}
