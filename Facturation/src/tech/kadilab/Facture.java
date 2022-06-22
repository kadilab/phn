package tech.kadilab;

import java.util.List;

public class Facture extends BonDeCommande{

	public Facture(List<Ligne> ligne, long numero, Client client, Detail detail) {
		super(ligne, numero, client, detail);
		
	}
	@Override
	public String toString() {
		
		return "Facture Numero=" + getNumero() + ", Client =" + getClient().getNom() 
				+ ", Total =" + getTotal() ;
	}

}
