import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class BattingAverageCalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        	
        	BattingAvgCalculator myBACalc = new BattingAvgCalculator();
        	System.out.println("Enter number of times at bat:  ");
        	
        	
        	
        	boolean validEntry = false;
        	int atBats = 0;
        	
        	while (!validEntry)
        	{
        		System.out.println("The number should be from 1 to 30.  ");
        		atBats = sc.nextInt();
        		if (atBats >= 1 && atBats <=30 )
        		{
        			validEntry = true;
        		}

        	}
 
        	myBACalc.setAtBats(atBats);
        	System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run ");

        	
        	for(int i = 0; i < atBats;i++)
        	{
        		System.out.println("Result for at-bat : " + (i + 1));
        		int result = sc.nextInt();
        		validEntry = false;
        		while (!validEntry)
            	{
            		if (result >= 0 && result <= 4 )
            		{
            			validEntry = true;
            		}	
            	}
        		
        		myBACalc.addToStats(result);
        	}
        	
        	double battingAverage = myBACalc.getBattingAverage();
        	double sluggingPercentage = myBACalc.getSluggingPercentage();
                	
        	System.out.println("\nThe batting average is " + (double)Math.round(battingAverage * 1000d) / 1000d);
        	System.out.println("The slugging percentage is " + (double)Math.round(sluggingPercentage * 1000d) / 1000d);
        	
            	
        	System.out.println("\nDo you want to enter another player's stats?");
            choice = sc.next();
        } // end while loop
        sc.close();
       
	}

}
