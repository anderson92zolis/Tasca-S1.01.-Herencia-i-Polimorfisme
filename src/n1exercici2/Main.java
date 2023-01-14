package n1exercici2;

public class Main{

public static void main(String[] args) {
	
  Cotxe cotxe1= new Cotxe("Nissan 370Z", 500);
 
  cotxe1.accelerar(); 	// Se accede desde el objeto creado
  //cotxe1.frenar(); 		// msm de error de que debería   que se debería acceder de forma estática
  Cotxe.frenar(); //  	Attributes and methods belongs to the class, rather than an object. se pueden acceder directamente desde la clase

  }
}