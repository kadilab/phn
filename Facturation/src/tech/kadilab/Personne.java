package tech.kadilab;

public abstract class Personne {
	
	private String nom, prenom;
	private Adresse monAdresse;
	
	public Personne(String nom, String prenom, Adresse monAdresse) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.monAdresse = monAdresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getMonAdresse() {
		return monAdresse;
	}

	public void setMonAdresse(Adresse monAdresse) {
		this.monAdresse = monAdresse;
	}

}
