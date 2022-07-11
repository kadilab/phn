package tech.kadilab;

import java.util.*;

public class Main {
	
//	MUKOMA WA KABUYA GLOIRE
//	KADIATA YAV JONATHAN
//	MUTUMBO KYASO ARSENE
//	ILUNGA KISHIYE CHRISTEL
//	KABASELE LWENDU NAOMI
//	BUTANDA SHUPA LAETITIA
//	NGALULA MUKENGE JUDITH
//	NAWEJ MBAZ TISHIQUE
//	NGOIE LUBABA AMELIA
//      PAMBA KAHETE JEREMIE	
	public static void main(String[] args) {
		Date dm = new Date();			
		Adresse ad1 = new Adresse("des princes", "25", "cellule B", "kalubwe", "lubumbashi", "lubumbashi", "RDC");
	    
		Client client1 = new Client("KADIATA", "JONATHAN", ad1, "0972688605");
		Categorie ct1 = new Categorie("food", "de la nouriture");
	    Produit<String> p1 = new Produit<String>("001", "bonbon", 100.0, "CM", dm,ct1);
	    Produit<String> p2 = new Produit<String>("002", "christel", 1000.0, "CM", dm,ct1);
	    Produit<String> p3 = new Produit<String>("003", "leatitia", 500.0, "CM", dm,ct1);  
	   
	    Ligne ligne1 = new Ligne(1, 4, p1);
	    Ligne ligne2 = new Ligne(2, 5, p2);
	    Ligne ligne3 = new Ligne(3, 2, p3);
	    
	    List<Ligne> ligne = new ArrayList<>();
	    
	    ligne.add(ligne1);
	    ligne.add(ligne2);
	    ligne.add(ligne3);
	   
	    Detail detail = new Detail(ligne);
        Facture maFacture = new Facture(ligne, 1, client1, detail);
      
       System.out.println(maFacture.toString());
	   
	}

}
