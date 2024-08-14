package Metodos2;

public class GenerarNumeroRandom {
    
    public static void main(String[] args) {
        numeroAleatorio();
    }
    public static int numeroAleatorio() {
        int numRandom = (int) Math.floor(Math.random() * (355 - 1)) + 1;
        System.out.println("El numero aleatorio es: " + numRandom); 
        return numRandom;
    }

}
