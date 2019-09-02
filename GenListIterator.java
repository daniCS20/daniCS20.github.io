package cs1302.genlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import cs1302.genlistadt.GenList;



public class GenListIterator<T> implements Iterator<T> {

	//make a contructor of genlist 
	//make a node and a list  
	
	public Node<T> now;
	
	public GenListIterator( Node<T> b) {
	

	this.now=b;
	
	}
	//int start=0;
	
	
	
	/**
	 * This method returns true if next returns an element that is not null. 
	 */
	public boolean hasNext() {
	
		if ((now!=null)) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	/**
	 * The following method checks if the mode is null,
	 * and if it is it throws an exception. If it is not null,
	 * then it gets the next object, sets it to the node and returns it. 
	 */
	public T next() throws NoSuchElementException {
		
		if(now==null) {
			throw new NoSuchElementException();
		}
		
	    
	    T a =now.getNext().getObj();
	    now=now.getNext();
	    return a;
	}

	
}
