import java.util.Scanner;

public class table_powers {

	public static void main(String[] args) {
		
		System.out.println("All hope abandon, ye who enter here...");
		Scanner sc = new Scanner(System.in);
		
		// get input
		
		// System.out.println("Enter a number:  ");
		
		int x= 0;
		// x = sc.nextInt();
		
		String choice = "y";
		int square = 1;
		int cube = 1;
		
		
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.println("Enter an integer:  ");
			x = sc.nextInt();
			
			System.out.println("number	square	cube  ");
			System.out.println("----------------------");
			System.out.println();
			
			for (int i = 1; i<=x; i++)
			{
				square = i * i;
				cube = square * i;
				
				System.out.println(i + "       " + square + "        " + cube);
			}
			System.out.println("Do you want to try again?");
			choice = sc.next();
			
		}
		
		
		
		
		
		System.out.println();
		sc.close();
		System.out.println("Until next time...");
		

	}

}
