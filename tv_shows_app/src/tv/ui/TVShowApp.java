package tv.ui;

import java.util.ArrayList;
import java.util.List;

import tv.business.Show;
import tv.business.ShowDB;
import tv.util.Console;

public class TVShowApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the TV Show DB App!");
		ShowDB sdb = new ShowDB();
		String command = "";
		while(!command.equalsIgnoreCase("3")) {
			displayMenu();
			command = Console.getString("Enter command:  ");
			if (command.equals("1")) {
				List<Show> shows = sdb.getAll();
				for (Show s: shows) {
					System.out.println(s.toString());
				}
			}
			else if(command.equals("2")) {
				// search by genre or length
				String criteria = Console.getString("Search by (g)enre or (l)ength", "g","l");
				List<Show> shows = new ArrayList<>();
				if(criteria.equalsIgnoreCase("g")) {
					// search by show genre
					String genre = Console.getString("(What type of genre:"
							+ " Comedy, Sci-fi, Action,Drama?");
					shows = sdb.get(genre);
					
				}
				else if (criteria.equalsIgnoreCase("l")) {
					// search by show length
					int length = Console.getInt("(Enter show length: "
							+ "30,60.90");
					shows = sdb.get(length);
				}
				System.out.println("Result of search: ");
				for(Show s : shows) {
					System.out.println(s);
				}
				
				
			}
			else if (!command.equals("3")) {
				System.out.println("Invalid Command.. Try again.");
			}
		}
		
		
		System.out.println("Bye!");

	}
	private static void displayMenu() {
		StringBuilder sb =new StringBuilder();
		sb.append("COMMAND MENU");
		sb.append("1 -List TV Shows");
		sb.append("2 -List TV Shows by genre or length");
		
		sb.append("3 - ");
	}

}
