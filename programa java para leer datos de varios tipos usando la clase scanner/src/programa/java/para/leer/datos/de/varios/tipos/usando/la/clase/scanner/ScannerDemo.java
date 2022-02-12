// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

public class ScannerDemo
{

    private static String mail;
    public static void main(String[] args)
    {
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido

        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        String name = sc.nextLine();

        // entrada de un carácter
        char gender = sc.next().charAt(0);

        // Entrada de datos numéricos
        // byte, short y float
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+name);
        System.out.println("Género: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Teléfono: "+mobileNo);
        System.out.println("Correo: "+mail);
    }

    public class Operacion {
    
    double n1;
    double n2;
    double res;
    char operacion;

    
    public Operacion(double n1, double n2, char operacion) {
        
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }
    
        
    public void mostrarResultado(){
        
        /*System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);*/
        
        /*  }*/

