package console;

import java.util.LinkedList;
import java.util.Scanner;

import entities.Bill;
import entities.BillItem;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Carga de items
		
		Bill bill = new Bill();
		LinkedList<BillItem> items = new LinkedList<BillItem>();
		boolean otro = true;
		
		do {
			
			BillItem item = new BillItem();
			
			System.out.println("---- Nuevo Item ----");
			System.out.print("Ingrese precio por unidad: ");
			item.setUnitPrice(Double.parseDouble(s.nextLine()));
			System.out.print("Ingrese cantidad: ");
			item.setQuantity(Integer.parseInt(s.nextLine()));
			
			items.add(item);
			
			System.out.print("Desea cargar otro? [s/n]: ");
			if (s.nextLine().equalsIgnoreCase("n")) {
				otro = false;
			}
			
		} while (otro);
		
		bill.setItems(items);
		
		boolean includeTax;
		
		System.out.print("El cliente está excento? ");
		if (s.nextLine().equalsIgnoreCase("s")) {
			includeTax = false;
		}
		else {
			includeTax = true;
		}
		
		System.out.println("El total de la factura es: " + bill.getTotal(items, includeTax));
		System.out.println("El total con IVA sería: " + bill.getTotal(items, true));
		
	}

}
