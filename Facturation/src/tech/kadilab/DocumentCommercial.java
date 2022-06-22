package tech.kadilab;

import java.util.List;

public abstract class DocumentCommercial {
	
	private long numero;
	private Client client;
	private Detail detail;
	
	public DocumentCommercial(List<Ligne> ligne, long numero, Client client, Detail detail) {
		this.numero = numero;
		this.client = client;
		this.detail = detail;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	
	public double getTotal() {
		double total = 0;
		
		for (Ligne L : detail.getLigne()) {
		     total += L.getPrixTotal();
		}
		
		total = total + getTVA(total);
		
		return total;
	}
	
	public double getTVA(double total) 
	{
		return total * 16/100;
	}
   
}
