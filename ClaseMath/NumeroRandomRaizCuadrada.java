package ClaseMath;

import java.util.Scanner;
public class NumeroRandomRaizCuadrada {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero Random Raiz Cuadrada");
        System.out.print("Ingresa un numero entre 1 y 30: ");
        int numeroLimite = entrada.nextInt();

        int numeroAleatorio = (int) Math.floor(Math.random() * (numeroLimite - 1)) + 1;
        System.out.println("El numero aleatorio es: " + numeroAleatorio);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(numeroAleatorio));
    }
}
