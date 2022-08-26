package entities;

public class HourlyRatedJob extends Job {

	private Contratist contratist;

	public Contratist getContratist() {
		return contratist;
	}

	public void setContratist(Contratist contratist) {
		this.contratist = contratist;
	}

	public HourlyRatedJob() {}

	@Override
	public double getTotalCost() {
		
		return this.getEstimatedHours() * (this.getContratist().getHourlyRate());
	}
	
	
	
	
	
	
	
}
