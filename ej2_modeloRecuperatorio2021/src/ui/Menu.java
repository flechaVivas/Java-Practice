package ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	
	public void start() {
		
		Scanner s = new Scanner(System.in);
		Boolean otro;
		ArrayList<String>listaNombres = new ArrayList<String>();
		
		do {
			System.out.println("Ingrese un nombre: ");
			listaNombres.add(s.nextLine());
			System.out.println("Otro? s/n: ");
			if (s.nextLine().equalsIgnoreCase("s")) {
				otro = true;
			}
			else {
				otro = false;
			}
		} while (otro);
		
		int nroMin = 0;
		System.out.println("Ingrese el numero minimo de letras: ");
		nroMin = Integer.parseInt(s.nextLine());
		
		System.out.println("La cantidad de nombres son: " + cantLargas(listaNombres,nroMin));
		
		s.close();
	}

	public int cantLargas(ArrayList<String> listaNombres, int nroMin) {
		
		int cont = 0;
		
		for (String nombre : listaNombres) {
			if (nombre.length() > nroMin) {
				cont++;
			}
		}
		
		return cont;
	}
	
}
