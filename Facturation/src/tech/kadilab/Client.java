package tech.kadilab;

public class Client extends Personne {
	
	private String numero;

	public Client(String nom, String prenom, Adresse monAdresse, String numero) {
		super(nom, prenom, monAdresse);
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
