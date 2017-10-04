   import java.util.Scanner;
   public class RockPaperScissors {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //System.out.print("Rock Paper Scissors");
      //establishing the input for player
      int game = input.nextInt();
      //establishing computer player
      int opponent = (int)(Math.random() * 3);
 
      switch (game){
      //what equals rock
      case 0: System.out.println("rock");
      if (game ==0 &&  opponent==0)
          System.out.println("draw");
        //telling the usser what is happening next
      else if (game==0 && opponent==1) 
        System.out.println("paper beats rock - opponent wins");
       else 
         System.out.println("rock beats scissors - you win!");
      
      
      break;
      case 1: System.out.println("paper"); 
      if(game==1 && opponent==1)
        System.out.println("draw");
      else if (game==1 && opponent==0)
        System.out.println("paper beats rock-you win!");
      else if (game==1 && opponent==2)
        System.out.println("scissors beats paper-opponent wins");
      
      
      
      break; 
      case 2: System.out.println("scissors");    
      if (game==2 && opponent==2)
        System.out.println("draw");
      else if (game==2 && opponent==0)
        System.out.println("rock beats scissors-opponent wins");
      else if (game==2 && opponent==1)
        System.out.println("scissors beats paper-you win!");
      }
   }}
   
   

                            
      
        
          
          
 