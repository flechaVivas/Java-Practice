package entities;

import java.time.LocalDate;

public class Expenditure {

	private boolean reimbursable;
	private double amount;
	private LocalDate date;
	
	public boolean isReimbursable() {
		return reimbursable;
	}
	public void setReimbursable(boolean reimbursable) {
		this.reimbursable = reimbursable;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Expenditure() {}
	
	
}
