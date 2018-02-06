import static org.junit.Assert.*;

import java.util.InputMismatchException;

public class Test {

	@org.junit.Test
	public void test() {
		
		try{
		
			Tabla tabla = new Tabla(); 
			tabla.tablaMultiplicar();
			
		}catch(InputMismatchException e){
			System.err.println("No coincide con el formato que se est� pidiendo");
		}catch(NumberFormatException e){
			System.err.println("Tiene que ser un  numero entero"); 
		}
		
	}

}
