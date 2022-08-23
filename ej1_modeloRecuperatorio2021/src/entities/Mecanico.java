package entities;

import java.util.LinkedList;

public class Mecanico extends Empleado {

	private double valorKm;
	private LinkedList<Vehiculo> vehiculos;

	public double getValorKm() {
		return valorKm;
	}

	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}

	public LinkedList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Mecanico() {}
	
	
	public double getSueldo() {
		
		double adicional = 0;
		for (Vehiculo vehiculo : vehiculos) {
			for (Viaje viaje : vehiculo.getViajes()) {
				adicional += viaje.getKms() * this.getValorKm();
			}
		}
		
		return this.getSueldoBase() + adicional;
		
	}
	
	
	
}
