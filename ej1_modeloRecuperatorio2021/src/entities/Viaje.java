package entities;

import java.time.LocalDate;

public class Viaje {

	private int id;
	private LocalDate fecha;
	private double duracionHs;
	private double kms;
	private int capacidad;
	private Guia guia;
	private Chofer chofer;
	private Vehiculo vehiculo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getDuracionHs() {
		return duracionHs;
	}
	public void setDuracionHs(double duracion) {
		this.duracionHs = duracion;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Guia getGuia() {
		return guia;
	}
	public void setGuia(Guia guia) {
		this.guia = guia;
	}
	public Chofer getChofer() {
		return chofer;
	}
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public Viaje(int id, LocalDate fecha, double duracionHs, double kms, int capacidad, Guia guia, Chofer chofer,
			Vehiculo vehiculo) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.duracionHs = duracionHs;
		this.kms = kms;
		this.capacidad = capacidad;
		this.guia = guia;
		this.chofer = chofer;
		this.vehiculo = vehiculo;
	}
	
	public Viaje() {}
	
	
	
	
	
}
