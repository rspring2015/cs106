import java.util.*;
import java.io.*;

public class Average {
	//read input, create array, perform analysis
	double butterfly= 0.0;
	double freestyle= 0.0;
	SeasonTime [] times;
	
	//load method to determine size of array, numlines function
public void load (String filepath) throws FileNotFoundException{
	this.times= new SeasonTime[this.numlines(filepath)];
	Scanner fileReader = new Scanner(new File(filepath));
	int i = 0;
	

	
 while (fileReader.hasNext()){
		/* Get the event */
		String event = fileReader.next();
		/* Get the time. */
		double time = fileReader.nextDouble();
	
 	
 
	
	
	


	/* Add a an object to the array with the values for event and time. */
	times[i] = new SeasonTime(event,time);
	i++;
 }
	fileReader.close();
	
	

}
/**
 * 
 * @param filepath
 * @see https://github.com/kevinfodness/cs106/blob/master/Project4b/src/Project4b.java
 * @return
 * @throws FileNotFoundException 
 */
public int numlines (String filepath) throws FileNotFoundException{
	int numLines = 0;
	Scanner fileReader = new Scanner(new File(filepath));
	while (fileReader.hasNextLine()) {
	fileReader.nextLine();
	numLines++;
	}
	fileReader.close();
	return numLines;
}

	public void analyze (){
		
		// declare variables to count the number of freestyle vs. butterfly entries
		// start at 0
		// increment in if statement
		for (SeasonTime t : this.times){
	
			if (t.event.equals("freestyle")){
				freestyle += t.time;
				
			} else{
				butterfly += t.time;
			}			
		}
	
		double avfreestyle= (freestyle/12);
		double avbutterfly= (butterfly/12);
		
		System.out.println("Average Freestyle Time "+ avfreestyle+ " seconds");
		System.out.println("Average Butterfly Time "+ avbutterfly+ " seconds");
		
	}
}