import java.util.*;

/**
 * @imported scanner
 */

/**
 * @author rspring
 * 
 */
public class Project2Quiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Add scanner, define variables, set variables to initial value of 0 */
		Scanner console = new Scanner(System.in);
		System.out.println("Where Should You Study Abroad?");
		int adventure = 0;
		int food = 0;
		int fashion = 0;
		int nature = 0;
		
		 //Ask questions using scanner for input. Each question adds a point to the corresponding variable.
		 
		 //Question 1
		 
		System.out
				.println("Question 1: Do you prefer to be outdoors or indoors?");
		String answer1 = console.nextLine();
		if (answer1.equals("outdoors")) {
			adventure++;
			nature++;
		} else if (answer1.equals("indoors")) {
			food++;
			fashion++;
		}
		 //Question 2
		
		System.out.println("Question 2: What would you like to learn?:");
		System.out.println("A. How to surf");
		System.out.println("B. How to cook");
		System.out.println("C. Fashion design");
		System.out.println("D. zoology");
		String answer2 = console.nextLine();
		if (answer2.equals("A")) {
			adventure++;
		} else if (answer2.equals("B")) {
			food++;
		} else if (answer2.equals("C")) {
			fashion++;
		} else if (answer2.equals("D")) {
			nature++;
			 //Question 3
			
		}
		System.out.println("Question 3: What sounds like a great Saturday afternoon?:");
		System.out.println("A. Bungee Jumpin");
		System.out.println("B. Wine Tasting");
		System.out.println("C. Shopping");
		System.out.println("D. Going on a hike");
		String answer3 = console.nextLine();
		if (answer3.equals("A")) {
			adventure++;
		} else if (answer3.equals("B")) {
			food++;
		} else if (answer3.equals("C")) {
			fashion++;
		} else if (answer3.equals("D")) {
			nature++;
			
			 //Question 4
			 
		}
		System.out.println("Question 4: Choose a fun activity:");
		System.out.println("A. scuba diving");
		System.out.println("B. eating a 5 course meal");
		System.out.println("C. watching a fashion show");
		System.out.println("D. Going on a safari");
		String answer4 = console.nextLine();
		if (answer4.equals("A")) {
			adventure++;
		} else if (answer4.equals("B")) {
			food++;
		} else if (answer4.equals("C")) {
			fashion++;
		} else if (answer4.equals("D")) {
			nature++;
		}
		
		System.out.println("You should study abroad in:");
		//calling getResults method to the main method
		 

		getResults(adventure, food, fashion, nature);
		
		console.close();

	}

	/**
	 * new method for comparing values of variables
	 * 
	 * @param adventure
	 * @param food
	 * @param fashion
	 * @param nature
	 */
	public static void getResults(int adventure, int food, int fashion,
			int nature) {
		if (adventure > food && adventure > fashion && adventure > nature) {
			System.out
					.println("New Zealand! You love adventure and New Zealand has lots of adventurous activities for you.");
		} else if (food > adventure && food > fashion && food > nature) {
			System.out
					.println("Italy! You love food and Italy will give you the best culinary experiences.");
		} else if (fashion > adventure && fashion > food && fashion > nature) {
			System.out
					.println("France! You love fashion and shopping, and Paris is the fashion capital of the world.");
		} else if (nature > adventure && nature > food && nature > fashion) {
			System.out
					.println("South Africa! You love nature, and South Africa has some of the best wildlife in the world.");
		} else {
			System.out.println("Your results are inconclusive.");

		}
	}

}
