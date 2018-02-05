import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 tablaMultiplicar(); 
		
	}
	
	
	public static void tablaMultiplicar (){
		
		try{
			Scanner lector = new Scanner (System.in); 

		System.out.println("Tabla de multiplicar, de que numero?"); 
		
		int numero = lector.nextInt(); 
		
		for(int i = 1; i < 11; i++){
			System.out.println( numero + " x " + i + " : " + numero*i);
				if(i == 0){
					System.out.println("la tabla del 0 no existe");
				}
			}
		
	}catch(NullPointerException e){
		System.err.println("No puede ser de tipo nulo");
	}catch(NumberFormatException e){
		System.err.println("Tiene que ser obligatoriamente un numero");
	}
		
	}
		

}
