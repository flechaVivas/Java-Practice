package entities;

public class DomicilioParticular extends Propiedad {

	private Boolean usoComercialPermitido;
	private int habitaciones;
	
	public Boolean getUsoComercialPermitido() {
		return usoComercialPermitido;
	}
	public void setUsoComercialPermitido(Boolean usoComercialPermitido) {
		this.usoComercialPermitido = usoComercialPermitido;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}


	@Override
	public double getAlquilerMensual() {
		
		double total = this.getImporteBase();
		for (int i = 0; i < this.getHabitaciones(); i++) {
			total += this.getImporteBase() * 0.05;
		}
		
		return total;
	}

}
