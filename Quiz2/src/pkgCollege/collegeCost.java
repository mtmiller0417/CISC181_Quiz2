//Matthew Miller
package pkgCollege;

import java.util.Scanner;

public class collegeCost {

	public static void main(String[] args) 
	{
		System.out.print("Enter price for 1 year of tuition exluding room and board: ");
		Scanner tuition1 =  new Scanner(System.in);
		double tuition = tuition1.nextDouble();
		double total = 0.0;
		
		System.out.println("Enter the percentage increase in cost each year: ");
		Scanner increase1 = new Scanner(System.in);
		final double INCREASE = increase1.nextDouble();

		
		for(int x = 1; x <= 4; x++)
		{
			total = total + tuition;
			tuition = tuition * (1 + INCREASE);
		}
		
		System.out.println("The total price for 4 years of college with " + (100*INCREASE)+"%" + 
						" increase a year is : " + (double)Math.round(total * 100)/100);
		tuition1.close();
		increase1.close();
	}

}
