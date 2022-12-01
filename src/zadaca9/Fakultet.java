package zadaca9;

public class Fakultet {

	private String ime;
	private int smerovi;
	private int studenti;
	
	public Fakultet(String ime, int smerovi, int studenti) {
		this.ime = ime;
		this.smerovi = smerovi;
		this.studenti = studenti;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getSmerovi() {
		return smerovi;
	}

	public void setSmerovi(int smerovi) {
		this.smerovi = smerovi;
	}

	public int getStudenti() {
		return studenti;
	}

	public void setStudenti(int studenti) {
		this.studenti = studenti;
	}
	
}
