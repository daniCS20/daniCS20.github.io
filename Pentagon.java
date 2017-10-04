//Daniela Murcia
//4.2 Goemetry Chap 4 
//Sep 29 2016


import java.util.Scanner;
public class Pentagon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //propmt user to enter length from center of pentagon to a vertex
    //in order to compute area
    
    //prompt user to enter r  value 
    System.out.println("Please enter a value for the radius: ");
    double r=input.nextDouble();
    
    //Variable for formula to solve for side 
    double side=(2 * r) * Math.asin(Math.PI / 5);
    System.out.println("side= " + side);
  //Compute side length from center to vortex
    System.out.println(side);
    //Compute area using side value
    //Make variable for area formula 
      //Compute Area
    double area=(5 * (side * side)) / (4 * Math.atan( Math.PI / 5));
    System.out.println("area=" + area);
 
    
    //4.3 Geography 
    //GPS 
    //Assign coordinates for each city 
    //Figure found on page 112
    //prompt usser to enter ATL coordinates 
    
    
     double atlx=Math.toRadians(33.7489954);
double atly=Math.toRadians(-84.3879824);
// System.out.print("atl=(atlx , atly)");
 //GPS coordinates for Orlando
 //   System.out.print("GPS coordinates, x and y, for Orlando are:");
        double orlx=Math.toRadians(28.5383355);   
      double orly=Math.toRadians(-81.3792365);                 
 //GPS coordinates for Savannah
                    //   System.out.print("GPS coordinates, x and y, for Savannah are:");
                       double savx=Math.toRadians(32.0835407);
                     double  savy=Math.toRadians( -81.09983342);
                       //GPS coordinates for Charlotte
                  //    System.out.print("GPS coordinates, x and y, for Charlotte");
                     double charx=Math.toRadians(35.2270869);
                      double chary=Math.toRadians( -80.8431267);
                      //Make radius a varibale 
                
                      double radiuscity=6371.01;
                      
                      
                      //Distance formula from 4.2: ATL-ORL
                
                      double datlorl=radiuscity * Math.acos(Math.sin(atlx) * Math.sin(orlx) + Math.cos(atlx) * Math.cos(orlx) * Math.cos(atly - orly));
                      System.out.println("datlorl=" + datlorl);
                      
                      //Distance formula from 4.2 ORL-SAV
                      double dorlsav=radiuscity * Math.acos(Math.sin(orlx) * Math.sin(savx) + Math.cos(orlx) * Math.cos(savx) * Math.cos(orly - savy));
                    //  System.out.println("dorlsav=" + dorlsav);
    
                      //Distance formula from 4.2 SAV-CHAR
                      double savchar=radiuscity * Math.acos(Math.sin(savx) * Math.sin(charx) + Math.cos(savx) * Math.cos(charx) * Math.cos(savy - chary));
                     // System.out.println("savchar=" + savchar);
                      
                      //Distance formula from 4.2 CHAR-ATL
                     double charatl=radiuscity * Math.acos(Math.sin(charx) * Math.sin(atlx) + Math.cos(charx) * Math.cos(atlx) * Math.cos(chary - atly));
System.out.println("charatl=" + charatl);
                      //Distance formula from ORL-CHAR
double orChar = radiuscity * Math.acos(Math.sin(orlx) * Math.sin(charx) + Math.cos(orlx) * Math.cos(charx) * Math.cos(orly - chary));
System.out.println("orChar" + orChar); 


//Heron's theorem is used here:
//First: Find "S"
double s=(dorlsav + savchar + orChar ) / 2 ;
//Prompt usser to solve for area s
double heron=Math.sqrt(s * (s - dorlsav) * (s - savchar) * (s - orChar));
  System.out.println("heron triangle 1" + heron);

double s2= (charatl + datlorl + orChar) / 2;
    double heron2= Math.sqrt(s2 * (s2 - charatl ) * (s2 - datlorl) * (s2 - orChar));
    double answer= heron + heron2;
    System.out.println("heron2 triangle 2" + heron2);
System.out.println("answer" + answer);












//Chapter 4 4.5
  //Calculating the area of a regular polygon
  // n= number of sides
  //s= length of sides 
  //Prompt usser to enter the number of sides 
  System.out.println("Please enter number of sides");
  double sides =5; 
 
 
  System.out.println("Please enter the length of sides");
  double sidelength= 6.5;
  double pie= Math.PI/sides;
  
  double areaa= (sides * (sidelength * sidelength)) / (4 * Math.tan(pie));
  System.out.println("Areaa is" + areaa);
  
  //4.7 
  //Prompt usser to enter radius 
  //calculate 5 points
  //Formula for x= r * cos(2pi) y= r * sin(2pi)
  
  double radi=input.nextDouble();
  double p2x= radi * Math.cos( Math.PI / 2);
   double p2y= radi * Math.sin(Math.PI / 2);
  double p1x= radi * Math.cos(Math.PI/ 2 - (2 * Math.PI) / 5); 
  double p1y= radi * Math.sin(Math.PI / 2 - (2 * Math.PI) / 5);
  double p5x = radi * Math.cos(Math.PI/ 2 - (2 * Math.PI) / 5 - 2 * Math.PI/5);
  double p5y = radi * Math.sin((Math.PI / 2) - ((2 * Math.PI) / 5) - (2 * Math.PI) / 5);
  double p3x=  radi * Math.cos( Math.PI / 2 + (2 * Math.PI) / 5);
  double p3y = radi * Math.sin(Math.PI / 2 +(2 * Math.PI) / 5);
  double p4x= radi * Math.cos((Math.PI / 2 + (2 * Math.PI) / 5)  + (2 * Math.PI) / 5);
  double p4y= radi * Math.sin((Math.PI / 2 + ((2 * Math.PI) / 5) + (2 * Math.PI) / 5));
 System.out.println("P1 coordinates:");
 System.out.printf("(%.2f, %.2f)\n",p1x,p1y);
  
 System.out.println("P2 coordinates:"); 
            System.out.printf("(%.2f,%.2f)\n",p2x,p2y);
    
    System.out.println("P3 Cooridnates");
System.out.printf("(%.2f, %.2f)\n",p3x,p3y);
    
    System.out.println("P4 Coordinates:");
    System.out.printf("(%.2f, %.2f)\n",p4x,p4y);
    
 System.out.println("P5 Coordinates:");
System.out.printf("(%.2f, %.2f)\n",p5x,p5y);
    
  
  
 }
}

 