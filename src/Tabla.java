import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla {
	
	public void tablaMultiplicar() throws InputMismatchException, NumberFormatException {
		
//		try{
			Scanner lector = new Scanner (System.in); 

		System.out.println("Tabla de multiplicar, de que numero?"); 
		
		int numero = lector.nextInt(); 
		
		for(int i = 1; i < 11; i++){
			System.out.println( numero + " x " + i + " : " + numero*i);
				if(i == 0){
					System.out.println("la tabla del 0 no existe");
				}
			}
		
		/**
		 * no es necesario utilizar los try y catch aqui, se utilizaran en el test de jUNit
		 * , aqui pasaremos al metodo un throws de las exception que puede usar en el test
		 */
		
//	}catch(NullPointerException e){
//		System.err.println("No puede ser de tipo nulo");
//	}catch(NumberFormatException e){
//		System.err.println("Tiene que ser obligatoriamente un numero");
//	}catch(InputMismatchException e){
//		System.err.println("No coincide con lo que se está pidiendo");
	}
		
	}
		

//}
