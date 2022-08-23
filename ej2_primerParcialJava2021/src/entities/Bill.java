package entities;

import java.util.LinkedList;

public class Bill {

	private LinkedList<BillItem> items;

	public LinkedList<BillItem> getItems() {
		return items;
	}

	public void setItems(LinkedList<BillItem> items) {
		this.items = items;
	}
	
	public Bill() {}
	
	
	public double getTotal(LinkedList<BillItem> items, boolean includeTax) {
		
		double total = 0;
		
		for (BillItem billItem : items) {
			
			if (includeTax) {
				total += ( billItem.getUnitPrice() * billItem.getQuantity() ) * 1.21;
			}
			if (!includeTax) {
				total += billItem.getUnitPrice() * billItem.getQuantity();
			}
		}
		return total;
		
	}
	
}
