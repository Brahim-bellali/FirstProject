
public class Etudiant {

	int id;
	String nom,prenom;
	String genre;
	public Etudiant() {		
	}
	public Etudiant(int id, String nom, String prenom, String genre) {		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
