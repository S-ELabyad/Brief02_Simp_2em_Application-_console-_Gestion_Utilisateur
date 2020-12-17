package com.Utilisateur.app.models;

public class Personne {
	
	
	private String Matricule  ;   
	private  String Nom ;
	private String Prenom;
	private String Email;
	private int Telephone;
	private double Salaire;

	
	

	public  Personne(String Matricule , String Nom,String Prenom,String Email, int Telephone, double Salaire) {
		this.Matricule=Matricule;
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Telephone=Telephone;
		this.Salaire=Salaire;
		this.Email=Email;
		
		
	}

public Personne() {
	
}
//.......method get, set Matricule;

public String getMatricule() {
	return Matricule;
}

public void setMatricule(String Matricule) {
	this.Matricule=Matricule;
}

//.......method get, set Nom;

public String getNom() {
	return Nom;
}

public void setNom(String Nom) {
	this.Nom=Nom;
}

//.......method get, set Prenom;
public String getPrenom() {
	return Prenom;
}

public void setPrenom(String Prenom) {
	this.Prenom=Prenom;
}

//.......method get, set Email;
public String getEmail() {
	return Email;
}

public void setEmail(String Email) {
	this.Email=Email;
}

//.......method get, set Telephone;
public int getTelephone() {
	return Telephone;
}

public void setTelephone(int Telephone) {
	this.Telephone=Telephone;
}

//.......method get, set Salaire;
public double getSalaire() {
	return Salaire;
}

public void setSalaire(double Salaire) {
	this.Salaire=Salaire;
}




}
