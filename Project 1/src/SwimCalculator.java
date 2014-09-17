/*Import java.util.* to gget access to scanner */
import java.util.*;


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
		Scanner console = new Scanner(System.in);
		System.out.println("Swim Split Calculator");
		System.out.println();
		System.out.println("Distance (yards):");
		double distance = console.nextDouble();
		System.out.println();
		System.out.println("Goal Time (seconds):");
		double goaltime = console.nextDouble();
		
		System.out.println();
		System.out.println("Split Time:" + swimCalc(distance, goaltime) + " seconds per length");
		
	}
	public static double swimCalc(double distance, double goaltime){	
		//calculate lengthsplit
		return goaltime / (distance/25);
		
	}
}
		
	
			
			
					
  
					
			
	


