package n2exercici1;

public class Telefon {
	private String marca;
	private String model;
	
	 // Create a class constructor for the Telefon class
	
	public Telefon(String marca,String model) {
	this.marca=marca;
	this.model=model;
	}
		
	// methods
	
	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public void metodoTrucar(String numeroTelefono) {
		System.out.println("Número de telèfon "+ numeroTelefono);
		}
	
	
}