/**
 * 
 */

/**
 * @author rspring
 *
 */
public class SwimCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Swim Split Calculator");
		System.out.println();
		swimSplit1650();
		swimSplit1000();
		swimSplit500();
		swimSplit200();
	}
		
	public static void swimSplit1650 () {
			
		//compute length split for 1650 yards
		double distance = 1650;
		double goaltime = 1080;
		double lengthsplit = goaltime /  (distance/25);
		//1 length is 25 yards
			
		//print length split for 1650 yards
		System.out.println("Distance:" + distance + " yards");
		System.out.println ("Goal time:" +  goaltime + " seconds");
		System.out.println ("Length Split:" + lengthsplit + " seconds");
		System.out.println();}
		
	public static void swimSplit1000 () {
			
		//compute length split for 1000 yards
		double distance = 1000;
		double goaltime = 660;
		double lengthsplit = goaltime /  (distance/25);
		
			
		//print length split for 1000 yards
		System.out.println("Distance:" + distance + " yards");
		System.out.println ("Goal time:" +  goaltime + " seconds");
		System.out.println ("Length Split:" + lengthsplit + " seconds");
		System.out.println();}
		
	public static void swimSplit500 () {
			
		//compute length split for 500 yards
		double distance = 500;
		double goaltime = 325;
		double lengthsplit = goaltime /  (distance/25);
			
			
		//print length split for 500 yards
		System.out.println("Distance:" + distance + " yards");
		System.out.println ("Goal time:" +  goaltime + " seconds");
		System.out.println ("Length Split:" + lengthsplit + " seconds");
		System.out.println();}
		
	public static void swimSplit200 () {
			
		//compute length split for 200 yards
		double distance = 200;
		double goaltime = 120;
		double lengthsplit = goaltime /  (distance/25);
		//1 length is 25 yards
			
		//print length split for 200 yards
		System.out.println("Distance:" + distance + " yards");
		System.out.println ("Goal time:" +  goaltime + " seconds");
		System.out.println ("Length Split:" + lengthsplit + " seconds");
		System.out.println();}
			
	
			
			
					
  
					
			
	}


