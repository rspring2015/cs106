import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class Average {
	public void average (HashMap <String,ArrayList<Integer>> results) {
		/*while (int i=0; i < array.length; i++); 
	
		    sum = sum + data[i]; 
		    double average = sum / array.length;; 
	
		    System.out.println("Average time: " " + average + "seconds");
		}*/
		for (Entry<String, ArrayList<Integer>> entry : results.entrySet()) {
			int total = 0;
			for (int time : entry.getValue()) {
				total += time;
			}
			double average= total/entry.getValue().size();
			// calculate average by dividing total by length of entry.getValue()
			System.out.println(entry.getKey() + " :" + average);
		}

		
	}
}
