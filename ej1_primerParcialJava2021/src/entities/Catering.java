package entities;

import java.util.LinkedList;

public class Catering extends Event {

	private double fixedCost;
	private LinkedList<Menu> menues;

	public double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}
	
	public double getOveralCost() {
		double menuOveralCost = 0;
		
		for (Menu menu : menues) {
			menuOveralCost += menu.getUnitCost()*menu.getQuantity();
		}
		
		return getBasicCost() + this.fixedCost + menuOveralCost;
	}
	
}
