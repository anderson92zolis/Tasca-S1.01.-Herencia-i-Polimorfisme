package n1exercici1;

public class InstrumentDeVent extends InstrumentosMusicales {
	
	public static String nomStatic= "Tromba";
	
	//static {System.out.println("PrintpartCodeStatic {}"); }; // las llaves ya significan estatic por ende se ejecutara el codigo
	
	//{System.out.println("PrintpartCodeStatic sin palabra static");}
	
	public InstrumentDeVent(String nom, int preu) {
		super(nom, preu);
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
