package com.Utilisateur.app.models;

public class Utilisateur extends Personne{
	private String Profile;
	private String Password;
	private String Service;
	private String login;
	

	public  Utilisateur(String Matricule , String Nom,String Prenom,String Email, int Telephone, double Salaire,String Profile,String Password,String Service, String login) {
		super(Matricule,Nom,Prenom,Email , Telephone ,Salaire );
		this.Profile=Profile;
		this.Password=Password;
		this.Service=Service;	
		this.login=login;
	}
	
	
	public Utilisateur() {
		
	}
	
	
	//.......method get, set profil;

		public String getProfile() {
			return Profile;
		}

		public void setProfile(String Profile) {
			this.Profile=Profile;
		}
		
	//.......method get, set Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password=Password;
	}
	
	//.......method get, set Service;

		public String getService() {
			return Service;
		}

		public void setService(String Service) {
			this.Service=Service;
			
		}
		
	//.......method get, set login;

		public String getlogin() {
			return login;
		}

		public void setlogin(String login) {
			this.login=login;
		}
			
	
		
		public double calculerSalaire() {
		  if(Service== "Manager" ) {
	
			return getSalaire()+ getSalaire()*0.08;
		       
		
		  }
		  else if(Service=="Directeur général (DG)") {
			return getSalaire()+ getSalaire()*0.15;
			
			  
			  }
		  return getSalaire();
		}
		
		public String afficher() {
			return" \n l'utilisateur de profile "+getProfile()+" \n login est : "+getlogin()+"\n de service " +getService() + "\n et de Matricule " +getMatricule()+ " \n de le nom " +getNom()+ "  "+getPrenom()+"\n leur email est :"+getEmail()+ "\n de telephone "+getTelephone()+ " \n de salaire " +getSalaire()+ " \n leur Mot de passe est " +getPassword()+ " \n "+ calculerSalaire();
			 	
		}
		
		
		// public static void main(String[] args) {
			 
			 
			 
			 
		    	//Utilisateur[] personnes = new Utilisateur[1];
				
		    //	Utilisateur[] Utilisateur = new Utilisateur[5];
				
				
		    	//Utilisateur[0] = new Utilisateur(123,"saloua","elabyad"," sal@gmil.com ",0000,3000,"aze","Manager");
		    	//Utilisateur[1] = new Utilisateur(124,"ikram","elabyad"," sal@gmil.com ",0200,4000,"aze","Chef de projet (CP)");
				//Utilisateur[2] = new Utilisateur(125,"hicham","elabyad"," sal@gmil.com ",0300,5000,"aze","Directeur de projet (DP");
				//Utilisateur[3] = new Utilisateur(126,"wissal","elabyad"," sal@gmil.com ",0500,6000,"aze","Directeur des ressources humaines (DRH)");
				//Utilisateur[4] = new Utilisateur(127,"ayoub","elabyad"," sal@gmil.com ",0600,7000,"aze","Directeur général (DG)");
			
				
				//for(int i = 0; i < Utilisateur.length; i++) {
				//	Utilisateur[i].afficher();
				//}
			
	}


