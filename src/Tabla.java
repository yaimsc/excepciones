import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Tabla {
	
	public ArrayList tablaMultiplicar(int numero) throws InputMismatchException, NumberFormatException {
		

//		Scanner lector = new Scanner (System.in); 
//
//		System.out.println("Tabla de multiplicar, de que numero?"); 
//		
//		int numero = lector.nextInt(); 
		
		ArrayList<Integer> tabla = new ArrayList<Integer>();
		
		
		if(numero == 0){
					System.out.println("la tabla del 0 no existe");
		}
	
			for(int j = 1; j <= 10; j++){
		
			tabla.add(numero*j); 
			
		//	(numero + " x " + (j + 1) + " : " + (numero*j));
				
			}
		
		return tabla;
		
		/**
		 * no es necesario utilizar los try y catch aqui, se utilizaran en el test de jUNit
		 * , aqui pasaremos al metodo un throws de las exception que puede usar en el test
		 */
		
	}
	
	public void imprimir(int numero){
		ArrayList<Integer> tabla = tablaMultiplicar(numero);
		Iterator<Integer> i = tabla.iterator(); 
		
		for(int j = 0; j < tabla.size(); j++){
			
			System.out.println(numero + " x " + (j + 1) + " : " + (tabla.get(j)));
		}
		
	}
		
	}
		
