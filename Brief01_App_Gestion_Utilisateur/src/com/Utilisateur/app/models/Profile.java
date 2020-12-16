package com.Utilisateur.app.models;

public class Profile {
	private int Id;
	private String Code;
	private String Libelle;
	
	
	
	public Profile(int Id,String Code,String Libelle) {
		this.Id=Id;
		this.Code=Code;
		this.Libelle=Libelle;
		
	}
	
	public Profile() {
		
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
			
}
