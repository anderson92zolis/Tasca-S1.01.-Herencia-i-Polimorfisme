package n1exercici2;

public class Cotxe  {// Create a Edificio class
	
	final static String Marca = "default";  //creamos constantes para no creaer espacios de memorias para almacenar
	private static String model; 				//  todos los objetos de la clase que instanciamos tendrán el mismo atributo y si modificamos los objetos tendán el mismo atributo
	private final int potencia; 			// una vez instanciado no se podra modificar el valor del atributo
	
	// Create a class constructor for the Cotxe class
	
	public Cotxe(String model,int potencia) {
		// Set the initial value for the class attribute 
		Cotxe.model=model;
		this.potencia=potencia;
	}
	
	/*public Cotxe(final String marca,int model,int potencia) {
	
	this.marca = marca; // Set the initial value for the class attribute 
	this.model=model;
	this.potencia=potencia;
	}*/
	
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
		Cotxe.model = model; 	// cuando los atributos de clase son estáticos se debe acceder por la clase
	}
		// Methods
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
		}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
		}	
}