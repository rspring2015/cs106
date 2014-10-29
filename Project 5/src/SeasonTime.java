
public class SeasonTime {
	String event;
	double time;
	
	public SeasonTime (String event, double time){
		this.event= event;
		this.time= time;
		
		/* Get the event */
		String event = fileReader.next();
		/* Get the time. */
		double time = fileReader.nextDouble()

		/* Add a an object to the array with the values for event and time. */
		Seasontime[i] = new Seasontime(event,time);
		
		fileReader.close();
	}
}
