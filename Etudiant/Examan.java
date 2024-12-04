import java.time.LocalDate;

public class Examan {

	int id;
	LocalDate date;
	double note;
	
	int ide;
	int idm;
	public Examan() {
		
	}
	public Examan(int id, LocalDate date, double note, int ide, int idm) {
		super();
		this.id = id;
		this.date = date;
		this.note = note;
		this.ide = ide;
		this.idm = idm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public int getIdm() {
		return idm;
	}
	public void setIdm(int idm) {
		this.idm = idm;
	}
	
}
