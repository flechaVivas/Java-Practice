package entities;

public class Cochera extends Propiedad {

	private int capacidadVehiculos;
	private double cargoExtraPorVehiculo;
	
	
	public int getCapacidadVehiculos() {
		return capacidadVehiculos;
	}
	public void setCapacidadVehiculos(int capacidadVehiculos) {
		this.capacidadVehiculos = capacidadVehiculos;
	}
	public double getCargoExtraPorVehiculo() {
		return cargoExtraPorVehiculo;
	}
	public void setCargoExtraPorVehiculo(double cargoExtraPorVehiculo) {
		this.cargoExtraPorVehiculo = cargoExtraPorVehiculo;
	}
	
	public double getAdicional() {
		
		double adicional=0;
		for (int i = 0; i < this.getCapacidadVehiculos(); i++) {
			adicional += this.getCargoExtraPorVehiculo();
		}
		
		return adicional;
	}

	@Override
	public double getAlquilerMensual() {
		return this.getImporteBase() + this.getAdicional();
	}

}
