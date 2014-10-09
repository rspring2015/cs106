import java.io.*;
import java.util.*; 

public class Project4ReadFiles {
	public static void main (String[] args) throws FileNotFoundException {
			Scanner fileReader= new Scanner (new File("src/input.txt")); 
			
			double checking = 0;
			double savings = 0;
			double creditCard = 0;
		while (fileReader.hasNextLine()) {
		
		
		//skip date
			fileReader.next();
			
	
		
			String account= fileReader.next();
		//must skip "card" for credit card
			if (account.equals("Credit")) {
				fileReader.next();
			String action = fileReader.next();
				if (action.equals("Opening")) {
					fileReader.next();
					creditCard += fileReader.nextDouble();
				}else if (action.equals("Withdrawal")) {
					creditCard-= fileReader.nextDouble();
				}else if (action.equals("Deposit")){
				creditCard+= fileReader.nextDouble();
				
			//if not credit, then savings or checking
			
			  } else if (account.equals("Checking")){
				if (action.equals("Opening")) {
					fileReader.next();
					checking+= fileReader.nextDouble();
				}else if (action.equals("Withdrawal")) {
					checking-=fileReader.nextDouble();
				} else if (action.equals("Deposit")) 
				checking+= fileReader.nextDouble();
				}else if (account.equals("Savings")){
				
				if (action.equals("Opening")) {
					fileReader.next();
					savings+= fileReader.nextDouble();
				}else if (action.equals("Withdrawal")) {
					savings-= fileReader.nextDouble();
				} else if (action.equals("Deposit"))
				savings+= fileReader.nextDouble();
			}
				

			}
		}
		//print to file
		fileReader.close();
	
	PrintStream output = new PrintStream(new File("output.txt"));
			output.println(checking);
			output.println(creditCard);
			output.println(savings);
			output.close();
	}
	
}
	
