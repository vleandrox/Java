package Metodos2;

import java.util.Scanner;

public class AdivinarNumero {

    public static Scanner entrada = new Scanner(System.in); 
    public static void main(String[] args) {
        int numRandom =numeroAleatorio(); 
        buscarNumero(numRandom);
    }
    public static int numeroAleatorio() {
        int numRandom = (int) Math.floor(Math.random() * (20 - 1)) + 1;
        System.out.println("El numero aleatorio es: " + numRandom); 
        return numRandom;
    }
    public static int pedirNumero() {
        System.out.print("Ingresa un numero: ");
        int num = entrada.nextInt();
        return num;
    }
    public static void buscarNumero( int numRandom) {        
        int num;
        System.out.println("Adivina el numero"); 
        do {
            num = pedirNumero();
            if ( num > numRandom ) {
                System.out.println("El numero es menor");                
            }
            else if ( num < numRandom ) {
                System.out.println("El numero es mayor");
            }
        } while ( num != numRandom );

        System.out.println("¡Felicidades! Has adivinado el número: " + numRandom);
    }
}
