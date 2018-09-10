import java.util.Scanner;

public class testString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word.");
		
		String myString = sc.next();
		
		System.out.println("The first character is " + myString.charAt(0));
		
	
		
		sc.close();

	}

}
