package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Chofer extends Empleado {

	private String carnet;
	private LocalDate proximoVencimiento;
	private double cantViajesPremio;
	private double premio;
	private LinkedList<Viaje> viajes;
	
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public LocalDate getProximoVencimiento() {
		return proximoVencimiento;
	}
	public void setProximoVencimiento(LocalDate proximoVencimiento) {
		this.proximoVencimiento = proximoVencimiento;
	}
	public double getCantViajesPremio() {
		return cantViajesPremio;
	}
	public void setCantViajesPremio(double cantViajesPremio) {
		this.cantViajesPremio = cantViajesPremio;
	}
	public double getPremio() {
		return premio;
	}
	public void setPremio(double premio) {
		this.premio = premio;
	}
	public LinkedList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(LinkedList<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	public Chofer(String carnet, LocalDate proximoVencimiento, double cantViajesPremio, double premio) {
		super();
		this.carnet = carnet;
		this.proximoVencimiento = proximoVencimiento;
		this.cantViajesPremio = cantViajesPremio;
		this.premio = premio;
	}
	
	public Chofer() {}
	
	public ArrayList<Viaje> getViajesDelMes(){
		// metodo ya implementado
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		return viajes;
	}
	
	
	public double getSueldo() {
		
		double adicional = 0;
		
		if (this.getViajesDelMes().size() > this.getCantViajesPremio()) {
			adicional += this.getPremio();
		}
		
		return this.getSueldoBase() + adicional;
		
	}
	
	
	
	
	
	
}
