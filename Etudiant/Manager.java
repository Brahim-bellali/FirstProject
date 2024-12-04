import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {

	List<Etudiant> ets=new ArrayList<>();
	List<Module> mds=new ArrayList<>();
	
	List<Examan> exams=new ArrayList<>();
	
	public void addEtudiant(Etudiant e)
	{
		ets.add(e);
	}
	
	public void addEtudiant(int id, String nom, String prenom, String genre)
	{
		Etudiant e=new Etudiant(id, nom, prenom, genre);
		ets.add(e);
	}
	
	public void addModule(Module m)
	{
		mds.add(m);
	}
	
	public void addModule(int id, String intitule, double coiff)
	{
		Module m=new Module(id, intitule, coiff);
		mds.add(m);
	}
	
	public Module findModue(int idm)
	{
		for (Module m : mds) {
			if(m.getId()==idm)
				return m;
		}
		return null;
		
	}
	
	public void affichermodules()
	{
		for(int i=0;i<mds.size();i++)
		{
			String s = mds.get(i).toString();
			System.out.println(s);
		}
	}
	
	public void afficheretudiants()
	{
		for(int i=0;i<ets.size();i++)
		{
			Etudiant e=ets.get(i);
			System.out.println("id:"+e.getId()+" nom: "+e.getNom());
		}
	}
	
	public void addExamen(Examan ex)
	{
		exams.add(ex);
	}
	public void addExamen(int id, LocalDate date, double note, int ide, int idm)
	{
		Examan ex=new Examan(id, date, note, ide, idm);
		exams.add(ex);
	}
	
	public void allExam()
	{
		for (Examan e : exams) {
			System.out.println("etudiant :"+e.getIde()+"  date :"+e.getDate()+" note: "+e.getNote()+" module: "+e.getIdm());
		}
	}
	public void allExam(int ide)
	{
		for (Examan e : exams) {
			if(e.getIde()==ide)
			System.out.println("etudiant :"+e.getIde()+"  date :"+e.getDate()+" note: "+e.getNote()+" module: "+e.getIdm());
		}
	}
	public void allExam(int ide, int idm)
	{
		
	}
	
	public double calcumeMoy(int ide)
	{
		int cpt=0;
		double moy=0;
		double notes=0;
		Module m;
		for (Examan e : exams) {
			if(e.getIde()==ide)
			{
				m=findModue(e.getIdm());
				cpt+=m.getCoiff();
				
				notes += e.getNote()*m.getCoiff();
			}
		}
		moy=notes/cpt;
		return moy;
		
	}

}
