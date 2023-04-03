import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {	
		
		//declarations
		Scanner keyboard = new Scanner(System.in);
		Movie film = new Movie();
		String response;
		int marker=0;
		//loop (Task 2)
		do
		{
			System.out.println("Enter the name of a movie");
			film.setTitle(keyboard.nextLine());
			System.out.println("Enter the age rating of " + film.getTitle());
			film.setRating(keyboard.nextLine());
			System.out.println("Enter the number of tickets sold for this movie");
			film.setSoldTickets(keyboard.nextInt());
			System.out.println(film.toString());
			System.out.println("Do you want to enter another? (y or n)");
			keyboard.nextLine();
			response = keyboard.nextLine();
			if (!response.equals("y"))
				 marker++;
		} while (marker==0);
		
		//end
		System.out.println("Goodbye");
		
		
		/* Task 1
		System.out.println("Enter the name of a movie");
		film.setTitle(keyboard.nextLine());
		System.out.println("Enter the age rating of " + (film.getTitle()));
		film.setRating(keyboard.nextLine());
		System.out.println("Enter the number of tickets sold for this movie");
		film.setSoldTickets(keyboard.nextInt());
		System.out.println(film.toString());
		System.out.println("Goodbye");
	*/
		
	}

}