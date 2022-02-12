
package pm;
import java.util.Scanner;
public class celsiusfarenheit {
	
	public static void main(String[] args) {
		
 
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println ("Introduzca el tipo de temperatura a convertir: C o F");
			String s = sc.next().trim();
			if ("c".equalsIgnoreCase(s)) {
				 // Convertir de Celsius a Huashe
				 System.out.println ("Introduzca la temperatura a convertir a Celsius: ..");
				double db = sc.nextDouble();
				double db2 = (db * 9 / 5) + 32;
				 System.out.println ("Temperatura correspondiente en Fahrenheit:" + db2 + "F");
			} else if ("f".equalsIgnoreCase(s)) {
				 // Convertir Huashe a Celsius
				 System.out.println ("Introduzca la temperatura que se convertirá a Fahrenheit: ..");
				double db = sc.nextDouble();
				double db2 = (db - 32) * 5 / 9;
				 System.out.println ("Temperatura Celsius correspondiente:" + Math.round (db2) + "C");
			}else if("exit".equalsIgnoreCase(s)){
				break;
			}
		}
	}
 
}
 
