package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{

	
	public Smartphone(String marca, String model) {
		super(marca, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alarma() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant l’alarma");
	}

	@Override
	public void fotografiar() {
		System.out.println("S’està fent una foto");
		// TODO Auto-generated method stub
		
	
	}
	
	
	
	
	

}
