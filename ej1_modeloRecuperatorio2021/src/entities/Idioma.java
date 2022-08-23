package entities;

import java.util.LinkedList;

public class Idioma {

	private int id;
	private String descripcion;
	private LinkedList<Guia>guias;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LinkedList<Guia> getGuias() {
		return guias;
	}
	public void setGuias(LinkedList<Guia> guias) {
		this.guias = guias;
	}
	public double getAdicionalActual() {
		// ya implementado
		return 2000;
	}
	
}
