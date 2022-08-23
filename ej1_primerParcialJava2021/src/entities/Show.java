package entities;

public class Show extends Event {

	private String type;
	private String name;
	private double durationHs;
	private Equipement equipement;
	private Artist artist;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDurationHs() {
		return durationHs;
	}
	public void setDurationHs(double durationHs) {
		this.durationHs = durationHs;
	}
	public Equipement getEquipement() {
		return equipement;
	}
	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public double getOveralCost() {
		return getBasicCost() + (artist.getHourlyCost() * this.durationHs) + equipement.getCost();
	}
	
	
	
	
	
	
	
}
