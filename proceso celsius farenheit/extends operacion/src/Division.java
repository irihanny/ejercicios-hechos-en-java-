/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class Operacion {
    public class Suma extends Operacion{
    
    double suma;
       
    public Suma(double n1, double n2) {
             
        super(n1, n2, '+');
        this.suma = n1 + n2;
        this.setRes(this.suma);
    }

        private void setRes(double suma) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
public class Resta extends Operacion{
    
    double resta;
       
    public Resta(double n1, double n2) {
             
        super(n1, n2, '-');
        this.resta = n1 - n2;
        this.setRes(this.resta);
    }

        private void setRes(double resta) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
public class Multiplicacion extends Operacion{
    
    double multi;
       
    public Multiplicacion(double n1, double n2) {
             
        super(n1, n2, '*');
        this.multi = n1 * n2;
        this.setRes(this.multi);
    }

        private void setRes(double multi) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
public class Division extends Operacion{
    
    double div = 0;
       
    public Division(double n1, double n2) {
             
        super(n1, n2, '/');
        if(n2==0) System.out.println("No se puede dividir entre cero");
        else this.div = n1 / n2;
        this.setRes(this.div);
    }    
}
double n1 = 10;
double n2 = 5;
        
//suma
Suma sum = new Suma(n1,n2);
sum.mostrarResultado();
        
//resta
Resta res = new Resta(n1,n2);
res.mostrarResultado();
        
//multiplicacion
Multiplicacion mul = new Multiplicacion(n1,n2);
mul.mostrarResultado();
        
//division
Division div = new Division(n1,n2);
div.mostrarResultado();
}

}
