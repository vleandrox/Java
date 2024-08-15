package Metodos3;

import java.util.Scanner;

public class FactorialRecursividad {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = obtenerNumero();
        calculoFactorial(numero);
        System.out.println("El factorial Recursivo es: " + factorialRecursividad(numero));
    }

    public static int obtenerNumero() {
        System.out.println("Calcular Factorial");
        System.out.print("Ingresa un numero: ");
        return entrada.nextInt();
    }

    public static void calculoFactorial(int numero) {
        int factorial=1;
        do {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
                System.out.print("["+ i +"]");
                System.out.print(" ");
            }
            System.out.println("El factorial es: " + factorial);
            
        } while (numero == 0);
    }

    public static int factorialRecursividad(int numero){      
        if (numero == 0) {
            return 1; 
        } else {
            return numero * factorialRecursividad(numero - 1); // Llamada recursiva
        }
    }
}
