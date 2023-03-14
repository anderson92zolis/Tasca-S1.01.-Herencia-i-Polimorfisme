package n1exercici1;

public abstract class InstrumentosMusicales {
	private String nom;
	private int preu;
	
	public InstrumentosMusicales(String nom, int preu) {
		this.nom=nom;
		this.preu=preu;
		}
	
	// getter
	
	public String getNom() {
		return nom;
		}
	
	public int getPreu() {
		return preu;
		}
	
	// setter
	
	public void setNom(String nom) {
		this.nom=nom;
		}
	
	public void setPreu(int preu) {
		this.preu=preu;
		}
	
	//Methods
	
	public abstract void tocar();

	
	@Override
	public String toString() {
		return "InstrumentosMusicales [nom=" + nom + ", preu=" + preu + "]";
	} 
	
	

}
	