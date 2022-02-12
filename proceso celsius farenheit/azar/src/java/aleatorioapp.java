import java.util.Random;

class NumeroAleatorio{
    public static void main(String[] args) {
        //Creamos objeto de la clase Random
        Random aleatorio = new Random();        
        double numDoble =(int) (aleatorio.nextDouble()*10 + 1);
        System.out.println(numDoble);
        float numFlotante =(int) (aleatorio.nextFloat()*10 + 1);
        System.out.println(numFlotante);       
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

/**
 *
 * @author USER
 */
public class aleatorioapp {
    
}
