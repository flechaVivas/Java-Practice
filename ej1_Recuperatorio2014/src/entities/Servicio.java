package entities;

public class Servicio {

	private String descripcion;
	private double costoMensual;
	private Oficina oficina;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCostoMensual() {
		return costoMensual;
	}
	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}
	public Oficina getOficina() {
		return oficina;
	}
	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	
	
	
}
