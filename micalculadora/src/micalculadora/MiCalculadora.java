import java.util.Scanner;

public class MiCalculadora.java
{
public static void main(String args[])
{
int a;
int b;
int opcion;
int res = 0;
char operacion = '.';

Scanner sc = new Scanner(System.in);

System.out.println("Bienvenido a Mi Calculadora");


System.out.println("Ingrese su Primer valor ");

a = sc.nextInt();


System.out.println("Que operacion quieres hacer? ");
System.out.println("Elija el numero de la opcion a realizar: ");

System.out.println("1. Sumar ");
System.out.println("2. Restar ");
System.out.println("3. Multiplicar ");
System.out.println("4. Dividir ");

opcion = sc.nextInt();

    switch (opcion) {
        case 1 -> System.out.println("Usted ha elegido la operacion SUMA");
        case 2 -> System.out.println("Usted ha elegido la operacion RESTA");
        case 3 -> System.out.println("Usted ha elegido la operacion MULTIPLICACION");
        case 4 -> System.out.println("Usted ha elegido la operacion DIVISION");
        default -> {
        }
    }


System.out.println("Ingrese su Segundo valor ");
b = sc.nextInt();



switch(opcion)
{
case 1:
res = a + b;
operacion = '+';
break;

case 2:
res = a - b;
operacion = '-';
break;

case 3:
res = a * b;
operacion = '*';
break;

case 4:
res = a / b;
operacion = '/';
break;

}

System.out.println("El resultado a la siguiente operación " + a + " "+ operacion+ " " + b + " es igual a " + res);
}
}
