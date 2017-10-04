import java.util.Scanner;
public  class GlyphosateParent  {
Scanner input= new Scanner(System.in);
GlyphosateParent newName = new GlyphosateParent(); 

//lbs per month

double dairy=(600.5 / 12.0);
double poultry=(73.6 / 12.0);
double wheat=(326.3 / 12.0);
double fruit=(273.2 / 12.0);
double veggies=(415.4 / 12.0);
double MonthValue= (dairy + poultry + wheat + fruit + veggies);


//Variables for conversion


//Make Default Constructor
GlyphosateParent() {
	
          }

//method 
public double Convert() {
	double pounds=2.2;
	double mg=1.0;
	double kg=1000000.00;
	double ppm=(mg / kg);
	double total=ppm;
	return total;
         }
 

}