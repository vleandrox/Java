package Metodos3;

import java.util.Scanner;

public class FibonacciMejorada {

    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int numero = ingresarNumero();        
        fibonacci(numero); 
        fibonacciRecursivo(numero, 0);
    }

    public static int ingresarNumero(){
        System.out.println("Fibonacci");
        System.out.print("Ingresa un numero: ");
        return entrada.nextInt();
    }

    public static void fibonacci(int numero){
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < numero; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" "+n3); 
            n1 = n2;
            n2 = n3;
        }
    }
    public static void fibonacciRecursivo(int numero, int i) {
        if (i < numero) {
            System.out.print(fibonacciRecursivoIndividual(i) + " ");
            fibonacciRecursivo(numero, i + 1);  // Llamada recursiva al siguiente número
        }
    }

    // Método auxiliar para calcular el número de Fibonacci de forma recursiva
    public static int fibonacciRecursivoIndividual(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacciRecursivoIndividual(numero - 1) + fibonacciRecursivoIndividual(numero - 2);
        }
    }
}


