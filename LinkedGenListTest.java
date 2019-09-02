package cs1302.genlist;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.lang.Math;

import cs1302.genlistadt.GenList;





public class LinkedGenListTest {


	
	
	
	/**
	 * The main method is used to call the 5 methods which are supposed 
	 * to further test the methods created in LinkedGenList.java.
	 * @param args
	 */
	public static void main(String[] args) {

		demoMap();

		demoReduce();
		demoFilter();
		demoMin();
		demoAllMatch();

	}
	
	/**
	 * The following is a static method that tests the map method. 
	 */
	public static  <T, R> void demoMap() {


		GenList<Integer> intTest = new LinkedGenList<Integer>();
		intTest.add(1);
		intTest.add(2);
		intTest.add(3);
		intTest.add(4);
		intTest.add(5);
		intTest.add(6);
		GenList<Byte> dubTest = new LinkedGenList<Byte>();

		/**
		 * Takes in one type and returns another
		 */
		Function<Byte,Integer> a=(Byte b)-> b+1 ;
		/* Transform an element's value and change its type. */
		dubTest.map(a);
		System.out.println(intTest.makeString("[" , "," , "]"));
	}

	
	/**
	 * The following method uses the Binary Operator to test different 
	 * mathematics equations.  
	 */
	
	public static <T> void demoReduce() {	




		//T start, BinaryOperator<T> p
		GenList<Integer> intTest2 = new LinkedGenList<Integer>();
		intTest2.add(6);
		intTest2.add(7);
		intTest2.add(8);
		intTest2.add(9);
		intTest2.add(10);
		BinaryOperator<Integer> b = (Integer a,Integer c) ->  a+c ;
		BinaryOperator<Integer> e = (Integer f,Integer g) ->  f*g ;
		intTest2.reduce(0, b);
		intTest2.reduce(1, e);
		System.out.println(intTest2.makeString("[",", ","]"));
	}



/**
 * The following method is used to test the filter by
 *  performing some of the same functions it can. 
 */
	public static <T> void demoFilter() {
		GenList<Integer> intTest3 = new LinkedGenList<Integer>();
		intTest3.add(11);
		intTest3.add(12);
		intTest3.add(13);
		intTest3.add(14);
		intTest3.add(15);

		Predicate<Integer> p= (Integer a)-> a > 5;
		Predicate<Integer> i= (Integer a)-> a  % 10==0;
		Predicate<Integer> mp= (Integer a)-> a < 5;

		
		
	
		
		System.out.println("This checks if it is greater than 5. " + p);
		System.out.println(" This checks if is modulo 10 " + i);
		System.out.println("This checks if it is less than 5." + mp);

	}


	
	/**
	 * The following method checks the min function and ensures that it works
	 * using lambda expression. 
	 */
	public static <T> void demoMin() {


		//Comparator<T> c

		Comparator<Byte> min = (Byte a , Byte b) -> b.intValue() - a.intValue();
		Comparator<Double> sum = (Double a , Double b) -> b.intValue() + a.intValue();

		System.out.println("The minimum is " + min);
		System.out.println("The sum is " + sum);
	}



	/**
	 * The following method checks whether the value is even,
	 *  greater than 10, and greater than 2. 
	 * @return boolean
	 */
	public static <T>  boolean demoAllMatch() {


		GenList<Number> abc = new LinkedGenList<Number>();

		//checks even , if greater than 2, and less than 10.

		Predicate<Number> a= (Number idk) -> idk.intValue() % 2 ==0;
		Predicate<Number> b = (Number idkStill) -> idkStill.intValue() > 2;
		Predicate<Number> c = (Number idkHelp) -> idkHelp.intValue() < 10;


		if (abc.allMatch(c)) {
			System.out.println("The value is less than 10.");
			return true;
		}

		if (abc.allMatch(b)) {
			System.out.println("The value is greater than 2. ");
			return true;
		}
		if ( abc.allMatch(a)) {
			System.out.println("The value modulo 2 equals 0.");
			return true;
		}

		else {
			return false;
		}


	}



}