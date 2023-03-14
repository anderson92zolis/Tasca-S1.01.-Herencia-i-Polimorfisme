package n1exercici1;

public class InstrumentDeVent extends InstrumentosMusicales {
	
	private static String nomStatic= "Tromba";
	
	//static {System.out.println("CodeStatic-> static {}"); }; 
	
	// {System.out.println("CodeStatic-> {}");}
	
	

	

	public InstrumentDeVent(String nom, int preu) {
		super(nom, preu);
	}
	
	//getter static way
	
	/**
	 * @return the nomStatic
	 */
	
	public static String getNomStatic() {
		return nomStatic;
	}
		
	// methods
	public void tocar() {
		System.out.println(" Està sonant un instrument de vent");
	}

	@Override
	public String toString() {
		return "InstrumentDeVent [toString()= " + super.toString() + " nomStatic: "+nomStatic + " ]";
	}
	
	
}