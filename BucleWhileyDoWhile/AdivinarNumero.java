package BucleWhileyDoWhile;

import java.util.Scanner;
public class AdivinarNumero {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Adivina el numero");
        int numAleatorio = (int) Math.floor(Math.random() * (20 - 1)) + 1;
        System.out.println("El numero secreto es: " + numAleatorio);
        int numeroIngresado = 0;
        do {
            System.out.print("Ingresa un numero: ");
            numeroIngresado = entrada.nextInt();
            if(numAleatorio < numeroIngresado) {
                System.out.println("El numero es menor");
            }
            else if(numAleatorio > numeroIngresado) {
                System.out.println("El numero es mayor");
            }
        } while ( numAleatorio != numeroIngresado );
        System.out.println("Ganaste");
    }
}
