import static org.junit.Assert.*;

import java.util.InputMismatchException;

public class Test {

	@org.junit.Test
	public void test() {
		
		try{
		
			Tabla tabla = new Tabla(); 
			tabla.tablaMultiplicar();
			
			
			fail("Se esperaba excepcion InputMismatchExcepction"); 
		}catch(InputMismatchException e){
			System.err.println("No coincide con el formato que se está pidiendo");
			
		}
	}
		
	public void test2() {
		
		try{
			
			
			Tabla tabla = new Tabla(); 
			tabla.tablaMultiplicar();
			
			fail("Se esperaba NumberFormatException"); 
		}catch(NumberFormatException e){
			System.err.println("Tiene que ser un  numero entero"); 
			
		}
		
	}
	
}


