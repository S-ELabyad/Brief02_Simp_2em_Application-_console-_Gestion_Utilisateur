package com.Utilisateur.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.Utilisateur.app.models.Profile;
import com.Utilisateur.app.models.Utilisateur;


public class Main {

	public static void main(String[] args) {

		int Scan;
		boolean Quit = false;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Utilisateur> Utilisateur = new ArrayList<Utilisateur>();
		ArrayList<Utilisateur> Manager = new ArrayList<Utilisateur>();
		ArrayList<Profile> ListProfile = new ArrayList<Profile>();
		
		//Profile profile = new Profile();

		while(Quit != true) {
			System.out.println("1- Utilisateur");
			System.out.println("2- Manager");
			//anul
			//System.out.println("3- Profile");
			System.out.println("4- Quit");
			Scan = scanner.nextInt();

			switch(Scan) {
				case 1:
					System.out.println("1- ajouter une utilisateur");
					System.out.println("2- affichier tous les utilisateurs");
					System.out.println("3- annuler");
					int	SelectedUser = scanner.nextInt();
					
					int id = 1;

					switch(SelectedUser) {
						case 1:
							Utilisateur utilisateur = new Utilisateur();
							Profile Profile = new Profile();

							int SelectedProfile;
							

							
							
							//Profile.setId(id);
							
							System.out.println("entrer votre login");
							String login = scanner.next();
							//utilisateur.setlogin(login);
							

							//System.out.println("entrer votre service");
							//String service = scanner.next();
							//utilisateur.setService(service);
							
							System.out.println("entrer votre matrucile");
							String Matricule = scanner.next();
							//utilisateur.setMatricule(Matricule);
							
							System.out.println("entrer votre nom");
							String nom = scanner.next();
							//utilisateur.setNom(nom);
							
							System.out.println("entrer votre prenom");
							String prenom = scanner.next();
							//utilisateur.setPrenom(prenom);
							
							System.out.println("entrer votre email");
							String email = scanner.next();
							//utilisateur.setEmail(email);
							
							System.out.println("entrer votre numero de telephone");
							int telephone = scanner.nextInt();
							//utilisateur.setTelephone(telephone);
							
							System.out.println("entrer votre salaire");
							double salaire = scanner.nextDouble();
							//utilisateur.setSalaire(salaire);
							
							System.out.println("entrer votre mot De Passe");
							String Password = scanner.next();
							//utilisateur.setPassword(Password);
							
							//Profile.setCode(Password);

							//if(utilisateur.getProfile().contains("MN")) {
								//Manager.add(utilisateur);
							//}
							
							System.out.println("entrer votre service : \n "
									+ "\t --> Chef de projet                    : 1 \n "
									+ "\t --> Manager                           : 2 \n "
									+ "\t --> Directeur de projet               : 3 \n "
									+ "\t --> Directeur des ressources humaines : 4 \n "
									+ "\t --> Directeur général                 : 5");
							
							
							
							SelectedProfile = scanner.nextInt();
							String  code1 = "";
							String Libelle = "";
							switch(SelectedProfile) {
								case 1:
									//utilisateur.setProfile("CP");
									//Profile.setLibelle("CP");
									code1 = "CP";
									Libelle = "Chef de projet";
								break;
								
								case 2:
									//utilisateur.setProfile("MN");
									//Profile.setLibelle("MN");
									code1 = "MN";
									Libelle = "Manager";
									salaire = salaire+(salaire*0.08);
								break;
								
								case 3:
									//utilisateur.setProfile("DP");
									//Profile.setLibelle("DP");
									code1 = "DP";
									Libelle = "Directeur de projet";
								break;
								
								case 4:
									//utilisateur.setProfile("DHR");
									//Profile.setLibelle("DHR");
									code1 = "DHR";
									Libelle = "Directeur des ressources humaines";
								break;
								
								case 5:
									//utilisateur.setProfile("DG");
									//Profile.setLibelle("DG");
									code1 = "DG";
									Libelle = "Directeur général";
									salaire = salaire+(salaire*0.15);
								break;
							}
							
							
							try {
								Profile = new Profile(code1,Libelle);
								ListProfile.add(Profile);
								utilisateur = new Utilisateur(Matricule,nom,prenom,email,telephone,salaire,Libelle,Password,code1,login);
								Utilisateur.add(utilisateur);
							}catch (Exception e) {
								System.out.println(e);
							}
							//Manager.add(utilisateur);
							
							
							//id++;
						break;
						
						case 2:
							for(Utilisateur object:Utilisateur) {
								System.out.println(object.afficher());
							}
						break;
						
						case 3:
						
						break;
					}

				break;
				
				case 2:
					for(Utilisateur object:Manager) {
						System.out.println(object.afficher());
					}
				break;
				
				case 3:
					
				break;

				case 4:
					System.out.println("thanks for using Employee application");
					Quit = true;
				break;
			}
		}
	}
		

	    
}