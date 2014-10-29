import java.util.*;
import java.io.*;

public class part2 {
		public static void main(String[] args) throws FileNotFoundException {
			
			/*count number of lines in the file. */
			
			int numLines=0;
			Scanner fileReader=new Scanner (new File("../../Downloads/input.txt"));
		
		String[] dates = new String[numLines];
		String[] accounts = new String[numLines];
		String [] transactions = new String [numLines];
		double[] amounts = new double [numLines];
		
		//Populate the arrays from the file
		
		int i = 0;
		fileReader=new Scanner (new File ("../.accounts./Downloads/input.txt"));
		while (fileReader.hasNext()){
			
			//Get the date
			dates[i] = fileReader.next();
			
			//get account type
			accounts[i]=fileReader.next();if (accounts[i].equals(("Credit"){
				accounts [i] = accounts[i] + " " + fileReader.next();
			}
			
			//Get transaction type
			if (transactions [i].equals("Opening")){
				transactions[i]=transactions[i] + " " + fileReader.next();
				
			}
		}
				
			//get amounts
		amounts[i]=fileReader.nextDouble();
		//increment index
		i++;
		}
		
		//calculate totals
		double checking = 0.0;
		double sacings = 0.0;
		double credit = 0.0;
		for (i=0; i<dates.length.i++)
				
			
	

}
