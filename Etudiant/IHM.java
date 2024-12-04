import java.util.Scanner;

public class IHM {

	Scanner sc=new Scanner(System.in);
	int choix;
	Manager manger=new Manager();
	public void menu()
	{		
		System.out.println("Ajouter Module .....1");
		System.out.println("Ajouter Etudiant ....2");
		System.out.println("Ajouter Examen ......3");
		System.out.println("liste Module ........4");
		System.out.println("liste Etudiants .....5");
		System.out.println("chercher Etudiant .....6");
		System.out.println("les exame Etudiant.....7");
		System.out.println("Quiter ................0");	
		System.out.println("Merci de choisir une operation");
		choix=sc.nextInt();
	}
	public Module saisirmodule()
	{
		System.out.println("entrer le id du module");
		int id=sc.nextInt();
		System.out.println("entrer l'intitule du module");
		String intitule=sc.next();
		System.out.println("entrer le coiff du module");
		double coiff=sc.nextDouble();
		Module m=new Module(id, intitule, coiff);
		return m;
	}

	public void Interagir()
	{
		while(choix!=0) {
		switch (choix) {
		case 1: {			
			Module m=saisirmodule();
			manger.addModule(m);
			break;			
		}
		case 4: {				
			manger.affichermodules();
			break;
		}		
		}
		System.out.println("Merci de choisir une operation");
		choix=sc.nextInt();
		}
	}
}
