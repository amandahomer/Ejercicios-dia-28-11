/**Este programa suma los numeros pares e impares de los numeros entre 100 y 200.
*AmandaNR*/

public class Ejercicio4 {

	public static void main (String [] args) {
		
		int sumapar = 0;
		int sumaimpar = 0;
	
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				sumapar = i + sumapar;
			} else {
				sumaimpar = i + sumaimpar;
			}
		}
		
		System.out.println(sumapar);
		System.out.println(sumaimpar);
		
	}
}
