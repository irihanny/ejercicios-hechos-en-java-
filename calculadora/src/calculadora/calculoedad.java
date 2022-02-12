import java.io.*;

public class calculoedad {

    public static void main (String [] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Ingrese el dia actual [1-31] y presione Entrar");
        String dia_actualcad = entrada.readLine();
        
        System.out.println ("Ingrese el mes actual [1-12] y presione Entrar");
        String mes_actualcad = entrada.readLine();
        
        System.out.println ("Ingrese el anio anio y presione Entrar");
        String anio_actualcad = entrada.readLine();
        
        
        
        System.out.println ("Ingrese el dia en que nacio la persona [1-31] y presione Entrar");
        String diacad = entrada.readLine();
        
        System.out.println ("Ingrese el mes en que nacio la persona [1-12] y presione Entrar");
        String mescad = entrada.readLine();
        
        System.out.println ("Ingrese el anio en que nacio la persona [1-12] y presione Entrar");
        String aniocad = entrada.readLine();
        
        int anio_actual = Integer.parseInt(anio_actualcad);
        int anio = Integer.parseInt(aniocad);
        
        int edad_base = anio_actual - anio;
        
        int mes_actual = Integer.parseInt(mes_actualcad);
        int mes = Integer.parseInt(mescad);
        
        if (mes_actual < mes) edad_base--;
        else if (mes_actual == mes) {
            
            int dia_actual = Integer.parseInt(dia_actualcad);
            int dia = Integer.parseInt(diacad);
            
             if (dia_actual < dia) edad_base--;        
            
        }
        
        int edad = edad_base;
        
        System.out.println ("La edad actual de la persona es de: "+edad_base+" anios");
        System.out.println ("Para salir presione entrar");
        
        
    }
}