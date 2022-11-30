/**Este programa muestra el valor de A elevado a B.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un numero y el exponente seguidos de un espacio: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int total = 1;
	
		for (int i = 1; i <= b; i++) {
			total = total * a;
		}
		
		System.out.println(total);
	
	}
}
