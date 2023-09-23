
import java.util.Scanner;
//imports scanner

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		
		String title;
		String rating;
		int soldTickets=0;
		String reply;
		//initializes variables
		
		Scanner keyboard = new Scanner(System.in);
		// creates scanner keyboard object
		Movie movie = new Movie();
		
		System.out.println("Enter the name of a movie");
		title = keyboard.nextLine();
		movie.setTitle(title);
		//Prints out prompt to name a movie, reads input using scanner, and sets input as movie
		
		System.out.println("Enter the rating of a movie");
		rating = keyboard.nextLine();
		movie.setRating(rating);
		//Prints out prompt to give movie a rating, reads input using scanner, and sets input as rating
		
		System.out.println("Enter the number of tickets sold");
		soldTickets = keyboard.nextInt();
		movie.setSoldTickets(soldTickets);
		/*Prints out prompt to enter number of tickets sold, reads input using scanner, 
		 * and sets input as soldTickets
		 */
		

		System.out.println(movie.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		reply = keyboard.next();
		
		while (reply.equals("y")) {
			keyboard.nextLine();
			System.out.println("Enter the name of a movie");
			title = keyboard.nextLine();
			movie.setTitle(title);
			
			System.out.println("Enter the rating of a movie");
			rating = keyboard.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold");
			soldTickets = keyboard.nextInt();
			movie.setSoldTickets(soldTickets);

			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			reply = keyboard.next();
		}
		
		System.out.println("Goodbye");
	keyboard.close();
	}
	}


