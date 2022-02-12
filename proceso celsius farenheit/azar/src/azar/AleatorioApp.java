import java.aleatorio app;

class NumeroAleatorio{
    public static void main(String[] args) {
        //Creamos objeto de la clase Random
        Random aleatorio = new Random();        
        int numero = aleatorio.nextInt(10)+1;
        System.out.println(numero);
    }
}