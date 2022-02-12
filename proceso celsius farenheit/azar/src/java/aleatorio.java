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
}
