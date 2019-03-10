
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
				int i, j, x;
				j = 1;
				x = 0;
				
				for(i = 0; i < 3; i++)
				{
					for(j = 0; j < 4; j += 1)
					{
						if(i == j)
						{
							x += i * j;	
						}
						else
						{
							x += 1;
						}
						j++;
					}
				}

				System.out.println(i);			//1._______________________
				System.out.println(x);			//2._______________________
				System.out.println(i);			//3._______________________
				System.out.println(j);			//4._______________________	
			  }  
		


	//String a = "hello";
	//System.out.println(a.indexOf('z'));
	//int array[5][4];
	
	//how to properly define a new arrat
	//int array[]	= { 2,3,4,5};
		//Example of nullPointerException
		//System.out.println("What is a null point exception error?");
		//String nullPointException = "when you try to perform an action with a null value";
	//	System.out.println(nullPointException);
   // Example of a null point exception error
		//WHy does it happen in this example? 
		// The array has not filled in Here are are telling 
		//java to go through each spot in an EMPTY array 
		//and do something with that value 
	//Integer [] someInts = new Integer[100];
	//int sum= 0;
	//for(Integer i : someInts) {
	//	sum+= i;
	}
	//System.out.println(sum / someInts.length);	
		
		
		
		
		
//example of  switch case that won't compile		
	/*	int i= 1;
     switch(i) {
     case 0: 
    	 int j =0;
    	 System.out.print( j );
     case 1:
     int j = 1;
     System.out.print( j );
     case 2:
     int j = 2;
     System.out.print( j );
     default:
     int j = -1;
     System.out.print( j )
     }
	}
	*/
