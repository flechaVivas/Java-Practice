package entities;

import java.util.LinkedList;

public class Guia extends Empleado {

	private String disponibilidad;
	private double valorHora;
	private LinkedList<Idioma> idiomas;
	private LinkedList<Viaje> viajes;
	
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public LinkedList<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(LinkedList<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	public LinkedList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(LinkedList<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	public Guia(String disponibilidad, double valorHora) {
		super();
		this.disponibilidad = disponibilidad;
		this.valorHora = valorHora;
	}
	
	public Guia() {}
	
	public double getSueldo(){
		
		double hsTotalesViaje = 0;
		for (Viaje viaje : viajes) {
			hsTotalesViaje += viaje.getDuracionHs();
		}
		
		double adicionalesXidioma = 0;
		for (Idioma idioma : idiomas) {
			adicionalesXidioma += idioma.getAdicionalActual();
		}
		
		return this.getSueldoBase() + (hsTotalesViaje * this.getValorHora() + adicionalesXidioma);
		
	}
	
	
	
	
	
	
}
