package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	// create a objects of a subclasses
		
	InstrumentosMusicales instrumentDeVent = new InstrumentDeVent("Fagot1",1800);
	InstrumentosMusicales instrumentDePercussio = new InstrumentDePercussio("Tubo Sonoro1",1500);
	InstrumentosMusicales instrumentDeCorda= new InstrumentDeCorda("Guitarra1",1000);
	
	System.out.println(instrumentDeVent.toString());
	
	// call the methods of the subclass
	
	instrumentDeVent.tocar();
	instrumentDePercussio.tocar();
	instrumentDeCorda.tocar();
	
	//  getNom() methods from a InstrumentosMusicales to know the name of a object
	
	System.out.println(instrumentDeVent.getNom());
	System.out.println(instrumentDePercussio.getNom());
	System.out.println(instrumentDeCorda.getNom());
	
	// call the static attributes of the subclass(to access at "private static String nomStatic" we must use a get(static way because is private) or make the class static)
	
	System.out.println(InstrumentDeVent.getNomStatic()); // This is because the static attribute are Private and we need use getter to access
	System.out.println(InstrumentDeCorda.getNomStatic());
	System.out.println(InstrumentDePercussio.getNomStatic());
	
	}
}