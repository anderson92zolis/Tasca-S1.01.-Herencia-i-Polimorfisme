package n1exercici1;

public class InstrumentDePercussio extends InstrumentosMusicales {
	
	private static String nomStatic= "Tubo Sonoro";
	
	public InstrumentDePercussio(String nom, int preu) {
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
		System.out.println(" Està sonant un instrument de percussió ");
		}

	@Override
	public String toString() {
		return "InstrumentDePercussio [toString()= " + super.toString() + " nomStatic: "+nomStatic + " ]";
	}
}
