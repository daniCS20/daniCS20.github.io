//Daniela Murcia 
//11.15 Test Program for Area

import java.util.ArrayList;
import java.util.Scanner;

public class TestAreaOfConvexPolygon {
	
	

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of the points: ");
			int numOfPoints = input.nextInt();
			System.out.print("Enter the coordinates of the points: ");
			ArrayList<AreaOfConvexPolygon> points = new ArrayList<>();
			for (int i = 0; i < numOfPoints; i++) {
				points.add(new AreaOfConvexPolygon(input.nextDouble(), input.nextDouble()));
				}
			System.out.println("The total area is " + getConvexPolygonArea(points));
			}
		
		public static double getConvexPolygonArea(ArrayList<AreaOfConvexPolygon> points) {
			double sum1 = 0;
	        double sum2 = 0;
	        for (int i = 0; i < points.size(); i++) {
	        	int limitIndex = (i + 1) % points.size();
	        	AreaOfConvexPolygon p1 = points.get(i);
	        	AreaOfConvexPolygon p2 = points.get(limitIndex);
	            sum1 += (p1.x * p2.y);
	            sum2 += (p1.y * p2.x);
	            }
	        double area = 0.5 * (sum1 - sum2);
	        return (area > 0) ? area : -area;
	        }
}