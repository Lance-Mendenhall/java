package chocolate;

import java.util.Scanner;

public class ChocolatePackage { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		 
		int smallBars,bigBars,goal = 0;
		
		while(choice.equalsIgnoreCase("y"))
		{
			int bigBarsWanted = 0;
			int smallBarsUsed = 0;
			int bigBarsUsed = 0;
			boolean enoughChocolate = true;
			boolean enoughSmallBars = true;
			
			
			System.out.println("You will enter small bars, big bars, and the goal.");
			System.out.println("How many small bars?  ");
			smallBars = sc.nextInt();
			System.out.println("How many big bars?  ");
			bigBars = sc.nextInt();
			
			System.out.println("What is the goal?  ");
			goal = sc.nextInt();
			
			// do I have enough small bars - possible to have enough chocolate but not enough small bars
			if(smallBars < (goal % 5))
				{
					enoughSmallBars = false;
					enoughChocolate = false;
				}
			
			// first, do I have enough chocolate
			if ((goal <= (5*bigBars) + smallBars) && enoughSmallBars)
			{
				// we can make chocolate
				enoughChocolate = true;
				bigBarsWanted = goal/5;
				
				if(bigBars >= bigBarsWanted)  // if we have enough big bars
				{
					smallBarsUsed = goal - bigBarsWanted * 5;
					bigBarsUsed = bigBarsWanted;
					
				}
				else  // not enough big bars - use all big bars - fill with small bars
				{
					smallBarsUsed = goal - 5 * bigBars;
					bigBarsUsed = bigBars;
					
				}
				
			}
			else
			{
				enoughChocolate = false;
			}
			
			
			// output all chocolate info
			
			if(enoughChocolate)
			{
				System.out.println("We started with " + smallBars + " small chocolate bars.");
				System.out.println("We started with " + bigBars + " big chocolate bars.");
				System.out.println("The goal was " + goal +" kilos of chocolate.");
				System.out.println("We used " + smallBarsUsed + " small bars.");
				System.out.println("We used " + bigBarsUsed + " big bars.\n" );
				
				
			}
			else
			{
				System.out.println("You cannot achieve your chocolate dreams. \n ");
			}
			
			System.out.println("Do you want to try to make more chocolate? ");
			choice = sc.next();
		}
		sc.close();
		
		
	}

}
