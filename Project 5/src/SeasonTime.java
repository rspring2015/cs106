
public class SeasonTime {
	String event;
	double time;
	
	public SeasonTime (String event, double time){
		this.event= event;
		this.time= time;
		

	}
	
	public String toString() {
		return this.event + "\t" + this.time;
	}
}
