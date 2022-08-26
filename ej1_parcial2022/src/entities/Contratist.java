package entities;

import java.util.LinkedList;

public class Contratist {

	private int ssn;
	private String firstName;
	private String lastName;
	private double hourlyRate;
	private LinkedList<HourlyRatedJob> hourlyRatedJobs;
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public LinkedList<HourlyRatedJob> getHourlyRatedJobs() {
		return hourlyRatedJobs;
	}
	public void setHourlyRatedJobs(LinkedList<HourlyRatedJob> hourlyRatedJobs) {
		this.hourlyRatedJobs = hourlyRatedJobs;
	}
	
	public Contratist() {}
	
	
	
	
	
	
}
