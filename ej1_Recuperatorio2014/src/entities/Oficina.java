package entities;

import java.util.ArrayList;

public class Oficina extends Propiedad {

	private Boolean pisoTecnico;
	private ArrayList<Servicio> servicios;
	
	public Boolean getPisoTecnico() {
		return pisoTecnico;
	}
	public void setPisoTecnico(Boolean pisoTecnico) {
		this.pisoTecnico = pisoTecnico;
	}
	public ArrayList<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	
	@Override
	public double getAlquilerMensual() {
		
		double total = this.getImporteBase();
		for (Servicio servicio : servicios) {
			total += servicio.getCostoMensual();
		}
		
		return total;
	}

}
