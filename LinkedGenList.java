package cs1302.genlist;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
//import java.util.NoSuchElementException;
import cs1302.genlistadt.*;



public class LinkedGenList<T> implements GenList<T> {
	public int count;
	Node<T> head;

	/**
	 * Default constructor
	 */
	public LinkedGenList() {
		head = null;
		count = 0;
	}

	/**
	 * This creates a copy of another StringList
	 * 
	 * @param other This is the StringList from which to copy
	 */
	public LinkedGenList (GenList<T> other) {
		for (int i = 0; i < other.size(); i++) {
			this.add(other.get(i));
		}
		count = other.size();
	}

	/**
	 * {@inheritDoc}
	 * The following method just adds a string to the list at the end of the list.
	 */
	public boolean add(T s) throws NullPointerException {
		if (s == null) {
			throw new NullPointerException("Null value.");
		}

		return add(this.size(), s);
	}

	/**
	 * {@inheritDoc}
	 * The following method accepts an index and a string as parameters and adds
	 * them to the list. It also does error handling on the inside by throwing different 
	 * exceptions. 
	 */
	public boolean add(int index, T s)
			throws NullPointerException, IllegalArgumentException, IndexOutOfBoundsException {

		if (s == null) {
			throw new NullPointerException("String cannot be null");
		}
		if (s.equals("")) {
			throw new IllegalArgumentException("Empty string");
		}
		if (index < 0 && index > size()) {
			throw new IndexOutOfBoundsException("Index must be between 0 and size-1");
		}
		if (head == null) {
			head = new Node<T>(s);
			count = 1;
			return true;
		}

		Node<T> pre = getNode(index - 1);
		Node<T> after = pre.getNext();
		Node<T> Node = new Node<T>(s);
		Node.setNext(after);
		pre.setNext(Node);
		count++;
		return true;
	}

	/**
	 * {@inheritDoc}
	 * This method passes in stringlist and adds it to the end of a list. 
	 * This method also catches an error by throwing an exception.
	 */
	public <U extends T>boolean  add (GenList<U> sl) throws NullPointerException {
		if (sl == null) {
			throw new NullPointerException();
		}
		return add(count, sl);

	}

	/**
	 * {@inheritDoc}
	 * The following method accepts an index and a stringlist as a parameter
	 * and adds it at the specified index. 
	 */
	public <U extends T>boolean add(int index, GenList<U> sl) {
		if (sl.size() == 0) {
			return false;
		}
		if (sl.size()==0) {
			return false;
		}

		if (head == null) {
			head = new Node<T>(sl.get(0));
			Node<T> pointer = head;
			for (int i = 1; i < sl.size(); i++) {
				Node<T> newNode = new Node<T>(sl.get(i));
				pointer.setNext(newNode);
				pointer = newNode;
			}
			return true;
		}


		if (index == 0) {
			Node<T> after = head;
			head = new Node<T>(sl.get(0));
			Node<T> pointer = head;
			for (int i = 1; i < sl.size(); i++) {
				Node<T> newNode = new Node<T>(sl.get(i));
				pointer.setNext(newNode);
				pointer = newNode;
			}
			pointer.setNext(after);
			return true;
		}

		Node<T> pre = getNode(index - 1);
		Node<T> after = pre.getNext();
		for (int i = 0; i < sl.size(); i++) {
			Node<T> stringNode = new Node<T>(sl.get(i)); // gets every string from node
			pre.setNext(stringNode);
			pre = stringNode;
		}
		pre.setNext(after);
		count += sl.size();
		return true;
	}

	/**
	 * {@inheritDoc}
	 * The following method removes the string at the index. I also 
	 * throw an exception for the sake of error handling.
	 */
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index must be between zero and size-1");
		}

		T oldVal = this.getNode(index).getObj();

		if (index == 0) {
			head=head.getNext();

		}

		this.getNode(index).setNext(getNode(index+1));


		count--;
		return oldVal;
	}

	/**
	 * {@inheritDoc}
	 * The following method returns the index of the string inputed,
	 * and if the string does not exist it returns -1.
	 */
	public int indexOf(T obj) throws NullPointerException {
		if (obj == null) {
			throw new NullPointerException();

		}

		for (int i = 0; i < count; i++) {
			if (get(i).equals(obj)) {
				return i;
			}
		}
		return -1;


	}

	/**
	 * {@inheritDoc}
	 * This method clears the list by reseting. 
	 */
	public void clear() {
		head = null;
		count = 0;
	}

	/**
	 * {@inheritDoc}
	 * This method checks if the head is empty. 
	 */
	public boolean isEmpty() {
		// Returns true if this list contains no elements.
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * The following method creates a string that is seperated 
	 * by whatever string is passed in as the parameter. 
	 */
	public String makeString(String sep) {


		String a = "";
		Node<T> x = head;

		for (int i = 0; i < this.size(); i++) {
			a += x.getObj().toString();
			if (i < this.size() - 1) {
				a += sep;
			}
			x = x.getNext();
		}

		return a;
	}

	/**
	 * {@inheritDoc}
	 * The following method returns the size of the list. 
	 */
	public int size() {
		return count;
	}

	/**
	 * {@inheritDoc}
	 * The following creates a new list from the indexes provided 
	 * as parameters. Essentially it creates a type of substring type list 
	 * and returns it. 
	 */
	public GenList<T> splice(int fromIndex, int toIndex) throws IndexOutOfBoundsException {
		if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
			throw new IndexOutOfBoundsException();
		}
		GenList<T> list2 = new LinkedGenList<T>();
		for (int i = fromIndex; i < toIndex; i++) {
			list2.add(this.get(i));
		}
		return list2;
	}

	/**
	 * {@inheritDoc}
	 * @GenList
	 * /**
	 * make a linked list object and then add strings to it. Make a loop 
	 * with condition statements that will check if there are any repeaters. 
	 */

	public GenList<T> distinct() {
		LinkedGenList<T> x = new LinkedGenList<T>();
		for (int i = 0; i < count; i++) {
			if (!(x.contains(this.get(i)))) {
				x.add(this.get(i));
			}

		} // end of outer loop

		return x;
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	private Node<T> getNode(int index) {
		Node<T> p = head;
		for (int i = 0; i < index; i++) {
			p = p.getNext();
		}
		return p;
	}

	/**
	 * {@inheritDoc}
	 * The following method reverses the values in the list and prints them
	 * in the reverse order. 
	 */
	public GenList<T> reverse() {
		GenList<T> rand = new LinkedGenList<T>();
		for (int i = this.size() -1; i >= 0; i--) {
			rand.add(this.get(i));
		}
		return rand;
	}

	/**
	 * The following method checks if list has a specific value.
	 */
	public boolean contains(T o) throws NullPointerException {
		// error handling
		if (o == null) {
			throw new NullPointerException();
		}

		Node<T> a = head;
		for (int i = 0; i < count; i++) {
			if (a.getObj().equals(o)) {
				return true;
			} else {
				a = a.getNext();
			}
		} // end of for
		return false;
	}




	/**
	 * The following method goes through the list and 
	 * only returns true if every element in the list passes 
	 * the test. 
	 */
	@Override
	public boolean allMatch(Predicate<T> p) throws NullPointerException{
		
		if (p==null) {
			throw new NullPointerException();
		}
		// TODO Auto-generated method stub
		boolean a =true;
		for (int i = 0; i < count; i++) 
			if (p.test(this.get(i))) {
				continue;

			}
			else {
				return false;
			}
		return a;
	}

	@Override

	/**
	 * The following method goes through the list 
	 * and if there is at least one test that passes,
	 * it returns true and exits the loop. 
	 */
	public boolean anyMatch(Predicate<T> p) throws NullPointerException {
		
		
		if (p==null) {
			throw new NullPointerException();
		}
	
		// TODO Auto-generated method stub
		boolean a =false;
		for (int i = 0; i < count; i++) 
			if (p.test(this.get(i))) {
				return true;

			}

		return a;
	}




	/**
	 * The following method is going to go through and add
	 * elements from your list to a new list as long as it 
	 * passed the test from the Predicate interface.
	 */
	@Override
	public GenList<T> filter(Predicate<T> p) throws NullPointerException {
		// TODO Auto-generated method stub
		

		if(p==null ) {
			throw new NullPointerException();
		}
		LinkedGenList<T> a = new LinkedGenList<T>();
		for (int i=0; i < this.size(); i++) {
			if (p.test(this.get(i))) {
				a.add(this.get(i));


			}
		}
		return a;
	}

	@Override
	public T get(int index) {
		return getNode(index).getObj();
	}



	@Override
	public <R> GenList<R> map(Function<T, R> f) throws NullPointerException  {

		if(f==null ) {
			throw new NullPointerException();
		}


		// TODO Auto-generated method stub
		LinkedGenList<R> a = new LinkedGenList<R>();
		for (int i = 0; i < this.size(); i++) {
			if (a==null) {
				throw new NullPointerException();
			}
			a.add(f.apply(this.get(i))); 
			

		}
		
		return a;			

	}

	@Override
	/**
	 *  This method returns an element of the list and gives it to the 
	 * Comparator. This method will return the greatest element. 
	 */
	public T max(Comparator<T> c) throws NullPointerException {


		if (c==null) {
			throw new NullPointerException();
		}
		// TODO Auto-generated method stub

		T numTemp=head.getObj();
		for (int i=0; i < this.size(); i++) {

			if (c.compare(numTemp, this.get(i)) <0) {
				numTemp=this.get(i);
			}
			else {
				continue;
			}
		}
		return numTemp;	




	}

	@Override
	/**
	 * This method returns an element of the list and gives it to the 
	 * Comparator. This method will return the minimal element. 
	 */
	public T min(Comparator<T> c)  throws NullPointerException{

		if (c==null) {
			throw new NullPointerException();
		}
		// TODO Auto-generated method stub

		T numTemp=head.getObj();
		for (int i=0; i < this.size(); i++) {

			if (c.compare(numTemp, this.get(i)) >0) {
				numTemp=this.get(i);
			}
			else {
				continue;
			}
		}
		return numTemp;	



	}

	/**
	 * This method goes through every element of the list 
	 * and checks to see if the element passes the apply method.
	 */


	@Override
	public T reduce(T start, BinaryOperator<T> f) {
		// TODO Auto-generated method stub
		T result = start;
		for ( T e : this) {
			result = f.apply(result, e);
		}
		return result;
	}


	@Override
	public T set(int index, T s) {
		T old = getNode(index).getObj();
		getNode(index).setObj(s);
		return old;
	}


	public  Iterator<T> iterator() {
		return  new GenListIterator<T>(head);
	}


	@Override
	public T[] toArray(IntFunction<T[]> gen) {
		// TODO Auto-generated method stub
		T[] a = gen.apply(this.size());
		for (int i = 0; i < this.size(); i++) {
			Node<T> genNode = new Node<T>(this.get(i)); 
			a[i] = genNode.getObj();
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println("Compiled!");

	}
}

