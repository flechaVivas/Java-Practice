package entities;

public class FixedPriceJob extends Job {

	private double agreedBudget;

	public double getAgreedBudget() {
		return agreedBudget;
	}

	public void setAgreedBudget(double agreedBudget) {
		this.agreedBudget = agreedBudget;
	}

	public FixedPriceJob() {}
	
	@Override
	public double getTotalCost() {
		
		return this.getAgreedBudget();
		
	}
	
	
}
