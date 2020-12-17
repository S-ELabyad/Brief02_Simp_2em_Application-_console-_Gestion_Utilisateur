package com.Utilisateur.app.models;

import java.util.ArrayList;

public class Profile {
	private int Id;
	private int count ;
	private String Code;
	private String Libelle;
	
	
	
	public Profile(String Code,String Libelle) {
		this.Id=count++;
		this.Code=Code;
		this.Libelle=Libelle;
		


	
		
	}
	
	public Profile() {
		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//.......method get, set Id;

		public int getId() {
			return Id;
		}

		public void setId(int Id) {
			this.Id=Id;
		}
		
		//.......method get, set Code;

		public String getCode() {
			return Code;
		}

		public void setCode(String Code) {
			this.Code=Code;
		}

		//.......method get, setLibelle;

		public String getLibelle() { 
			return Libelle;
		}

		public void setLibelle(String Libelle) {
			this.Libelle=Libelle;
		}	
		
		
		//creation des profile si deja existe o nn
		public static void AjouterProfile(Profile profile,ArrayList<Profile> profil1,String Code) {
			int cnt = 0;
			for (int j = 0; j < profil1.size(); j++) {
				if (Code == profil1.get(j).getCode()) {
					cnt++;
				}
			}
			if(cnt ==0) {
				//ajouter le profile
				profil1.add(profile);
				System.out.println("\n ajoute profil avec succes");
			}else {
				System.out.println("\n profil deja exist");
			}
		}
			
}
