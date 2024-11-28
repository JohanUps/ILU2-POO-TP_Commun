package model;

public class CalendrierAnnuel {
	private Mois[] mois;
	
	public CalendrierAnnuel() {
		mois = new Mois[12];
		mois[0] = new Mois("Janvier", 31);
		mois[1] = new Mois("Février", 28);
		mois[2] = new Mois("Mars", 31);
		mois[3] = new Mois("Avril", 30);
		mois[4] = new Mois("Mai", 31);
		mois[5] = new Mois("Juin", 30);
		mois[6] = new Mois("Juillet", 31);
		mois[7] = new Mois("Aout", 31);
		mois[8] = new Mois("Septembre", 30);
		mois[9] = new Mois("Octobre", 31);
		mois[10] = new Mois("Novembre", 30);
		mois[11] = new Mois("Décembre", 31);
	}
	
	public boolean estLibre(int jour, int mois) {
		return this.mois[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		boolean libre = false;
		if(estLibre(jour, mois)) {
			libre
		}
	}
	
	
	
	
	
/*Classe interne mois */
	public class Mois{
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom, int nbJours ) {
			this.nom = nom;
			for(int i = 0; i<nbJours; i++) {
				jours[i]= true;
			}
		}
		
		public boolean estLibre(int jour) {
			return jours[jour-1];
		}
		
		public void reserver(int jour) throws IllegalStateException{
			if(jours[jour-1]) {
				throw new IllegalStateException("Méthode réserver appellé sur un jour non libre");
			}
			jours[jour-1] = true;
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
