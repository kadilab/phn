package tech.kadilab;

import java.util.*;

public class Produit <T> {
   
	private String code, designation;
	private double prix;
	private T uniteMesure;
	private Date dateExpirationl;
	private Categorie categorie;
	public Produit(String code, String designation, double prix, T uniteMesure, Date dateExpirationl,Categorie ct) {
		this.code = code;
		this.designation = designation;
		this.prix = prix;
		this.uniteMesure = uniteMesure;
		this.dateExpirationl = dateExpirationl;
		this.categorie = ct;
	}
	public String getCode() {
		return code;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public T getUniteMesure() {
		return uniteMesure;
	}
	public void setUniteMesure(T uniteMesure) {
		this.uniteMesure = uniteMesure;
	}
	public Date getDateExpirationl() {
		return dateExpirationl;
	}
	public void setDateExpirationl(Date dateExpirationl) {
		this.dateExpirationl = dateExpirationl;
	}
	
}
