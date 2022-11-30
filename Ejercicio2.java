/**Este programa muestra los numeros naturales hasta un valor 
*introducido por teclado.
*AmandaNR*/

public class Ejercicio2 {

	public static void main (String [] args) {
	
		System.out.print("Introduce un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}
		
	}
}
