/**Este programa calcula la suma y el producto de los 10 primeros numeros.
*AmandaNR*/

public class Ejercicio3 {

	public static void main (String [] args) {
	
		int suma = 0;
		int multi = 1;
	
		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			multi = multi * i;
		}
		
		System.out.println("La suma es: "+ suma);
		System.out.println("La multiplicacion es: "+ multi);
		
	}
}
