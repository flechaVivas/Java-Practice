package entities;

import java.util.LinkedList;

public class Employee {

	public double getReimbursement(LinkedList<Expenditure> expenditures,double reimbursementPorcentage) {
		
		double reimbursement = 0;
		for (Expenditure ex : expenditures) {
			if (ex.isReimbursable()) {
				reimbursement += ex.getAmount();
			}
		}
		
		return reimbursement + reimbursement * (reimbursementPorcentage/100);
		
	}
	
}
