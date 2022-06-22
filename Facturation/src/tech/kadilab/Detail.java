package tech.kadilab;

import java.util.List;

public class Detail {
	
	private List<Ligne> ligne;
	
		public Detail() {
				
				
			}


	public Detail(List<Ligne> ligne) {
		
		this.ligne = ligne;
	}

	public List<Ligne> getLigne() {
		return ligne;
	}

	public void setLigne(List<Ligne> ligne) {
		this.ligne = ligne;
	}
	
}
