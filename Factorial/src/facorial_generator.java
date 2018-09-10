import java.util.Scanner;


public class facorial_generator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        	System.out.println("Enter the number you want the factorial of.  ");
        	System.out.println("The number should be from 1 to 20.  ");
        	
    		int keeper = sc.nextInt();
    	   	long fact = 1;
        	
        	for (int i = 1; i <= keeper; i++ ) 
        	{
        		fact *= i;
        	}
        	System.out.println("The factorial of " + keeper + " is " + fact + ".");
        	
        	System.out.println("Do you want to enter another number?");
            choice = sc.next();
        }
        sc.close();
       
	}

}
