package entities;

import java.util.ArrayList;
import java.util.LinkedList;

public class Vehiculo {

	private String patente;
	private String marca;
	private String modelo;
	private Mecanico mecanico;
	private LinkedList<Viaje>viajes;
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	public LinkedList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(LinkedList<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	
	public ArrayList<Viaje> getViajesDelMes(){
		// metodo ya implementado
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		return viajes;
	}
	
}
