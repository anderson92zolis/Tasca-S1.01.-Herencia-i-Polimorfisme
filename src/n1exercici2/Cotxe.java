package n1exercici2;

public class Cotxe  {// Create a Cotxe class
	
	public final static String Marca = "default";  
	private static String model; 			
	private final int potencia; 			
	
	// Create the constructor for the Cotxe class
	
	public Cotxe(String model,int potencia) { 
		Cotxe.model=model;
		this.potencia=potencia;
	}
	
	// setter& getters
	
	public static String getMarca() {
		return Marca;
	}
	
	public static String getModel() {
		return model;
	}

	public int getPotencia() {
		return potencia;
	}
	
	public static void setModel(String model) {
		Cotxe.model = model; 	
	}
		// Methods
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
		}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
		}	
}