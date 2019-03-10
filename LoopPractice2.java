public class LoopPractice2 {
  public static void main(String[] args) {

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
}
