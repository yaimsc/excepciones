import static org.junit.Assert.*;

import java.util.InputMismatchException;

public class Test {
	
	
	
	

	@org.junit.Test
	public void test() {
		
		try{
		
			Tabla tabla = new Tabla(); 
			//tabla.tablaMultiplicar(5);
			tabla.imprimir(7);
			
			
			fail("Se esperaba excepcion InputMismatchExcepction"); 
		}catch(InputMismatchException e){
			System.err.println("No coincide con el formato que se est� pidiendo");
			
		}
	}
		
	@org.junit.Test
	public void test2() {
		
		try{
			
			
			Tabla tabla = new Tabla(); 
			//tabla.tablaMultiplicar(5);
			tabla.imprimir(5);
			
			fail("Se esperaba NumberFormatException"); 
		}catch(NumberFormatException e){
			System.err.println("Tiene que ser un  numero entero"); 
			
		}
		
	}
	
}


