package n1exercici1;

public class InstrumentDeCorda extends InstrumentosMusicales {
	
	public static String nomStatic= "guitarra";
	
	public InstrumentDeCorda(String nom, int preu) {
		super(nom, preu);
		}
	
	// methods
	public void tocar() {
		System.out.println(" Està sonant un instrument de corda ");
		}
	
	@Override
	public String toString() {
		return "InstrumentDeCorda [toString()= " + super.toString() + " nomStatic: "+nomStatic + " ]";
	}
}