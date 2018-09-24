import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ETAEstimateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		 
		while(choice.equalsIgnoreCase("y"))
		{
			LocalDateTime departure;
			LocalDateTime arrival;
			String departDate = "";
			String departTime = "";
			int miles = 0;
			int mph = 0;
			int hours = 0;
			int minutes = 0;
			
			// get departure date
			System.out.println("When do you expect to depart? YYYY-MM-DD ");
			departDate = sc.next();
			
			// get departure time
			System.out.println("What time will you leave? 24 hour clock - HH:MM ");
			departTime = sc.next();
			
			departure = LocalDateTime.parse(departDate + "T" + departTime);
			
			// get distance in miles
			System.out.println("How many miles will you travel? ");		
			miles = sc.nextInt();
			
			// get mph
			System.out.println("How fast do you expect to travel? ");
			mph = sc.nextInt();
			
			// m / mph = hours
			hours = miles/mph;
			minutes = (int)(((double)miles / (double)mph - (double)hours) * 60);
			
			arrival = departure.plus(hours,ChronoUnit.HOURS);
			arrival = arrival.plus(minutes,ChronoUnit.MINUTES);
			
			System.out.println("\nEstimated Travel Time");			
			// give output as MEDIUM
			
			// hours
			System.out.println("Hours = " + hours);
			
			// minutes
			System.out.println("Minutes = " + minutes);
			
			// date of arrival
			System.out.println(arrival.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			
			// time of arrival
			System.out.println(arrival.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
			
			System.out.println("Do you want to travel somewhere else? ");
			choice = sc.next();
		}
		sc.close();

	}

}
