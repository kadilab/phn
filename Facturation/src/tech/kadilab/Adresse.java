package tech.kadilab;

public class Adresse {

	private String avenue, numero, cellule ,quartier,commune,ville,pays;

	public Adresse(String avenue, String numero, String cellule, String quartier, String commune, String ville,
			String pays) {
		this.avenue = avenue;
		this.numero = numero;
		this.cellule = cellule;
		this.quartier = quartier;
		this.commune = commune;
		this.ville = ville;
		this.pays = pays;
	}

	public String getAvenue() {
		return avenue;
	}

	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCellule() {
		return cellule;
	}

	public void setCellule(String cellule) {
		this.cellule = cellule;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	

}
