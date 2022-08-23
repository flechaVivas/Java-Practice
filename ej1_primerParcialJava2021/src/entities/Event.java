package entities;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class Event {

	private LocalDateTime eventDate;
	private String location;
	private Client client;
	private LinkedList<Service> services;
	
	public LocalDateTime getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public LinkedList<Service> getServices() {
		return services;
	}
	public void setServices(LinkedList<Service> services) {
		this.services = services;
	}
	
	public Event() {}
	
	public abstract double getOveralCost();
	
	
	public double getBasicCost() {
		
		double basicCost = 0; 
		for (Service service : services) {
			basicCost += service.getCost();
		}
		return basicCost;
	}
	
	
	
	
}
