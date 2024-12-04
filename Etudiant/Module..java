
public class Module {

	int id;
	String intitule;
	double coiff;
	
	public Module() {
		super();
		
	}
	public Module(int id, String intitule, double coiff) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.coiff = coiff;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public double getCoiff() {
		return coiff;
	}
	public void setCoiff(double coiff) {
		this.coiff = coiff;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", intitule=" + intitule + ", coiff=" + coiff + "]";
	}
	
	
}
