
public class Average {
	//read input, create array, perform analysis
	SeasonTime [] times;
	
	//load method to determine size of array, numlines function
public void load (String filepath){
	this.times= new SeasonTime[]

}
/**
 * 
 * @param filepath
 * @see https://github.com/kevinfodness/cs106/blob/master/Project4b/src/Project4b.java
 * @return
 */
public int numlines (String filepath){
	int numLines = 0;
	Scanner fileReader = new Scanner(new File(filepath));
	while (fileReader.hasNextLine()) {
	fileReader.nextLine();
	numLines++;
	}
	fileReader.close();
	
}
public double analyze (??){
	//1. get total time for freestyle, then divide by total number of elements in freestyle (12)
	//2. get total time for butterfly, then divide by total number of elements in butterfly (12)
	//3. print out results of average for both to an output file
}
}