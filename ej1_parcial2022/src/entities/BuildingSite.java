package entities;

import java.util.LinkedList;

public class BuildingSite {

	private int id;
	private String address;
	private LinkedList<Job> jobs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LinkedList<Job> getJobs() {
		return jobs;
	}
	public void setJobs(LinkedList<Job> jobs) {
		this.jobs = jobs;
	}
	
	public BuildingSite() {}
	
	public double getOveralBudget() {
		
		double total = 0;
		for (Job job : jobs) {
			total += job.getInsuranceCost() + job.getTotalCost();
		}
		
		return total;
	}
	
	
	
}
