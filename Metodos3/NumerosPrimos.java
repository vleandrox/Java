package Metodos3;

import java.util.Scanner;

public class NumerosPrimos {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        esPrimo();
        int numero = obtenerNumero();
        if (numero == 0) {
            System.out.println("Programa terminado.");
        } else {
            boolean resultado = esPrimoRecursivo(numero, 2);
            if (resultado) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }
    }

    public static int obtenerNumero() {
        System.out.print("Ingresa un número (0 para terminar): ");
        return entrada.nextInt();
    }

    public static void esPrimo() {
        int numero;
        boolean primo;
        do {
            System.out.print("Ingresa un número (0 para terminar): ");
            numero = entrada.nextInt();

            if (numero == 0) {
                break; // Termina el bucle si el usuario ingresa 0
            }
            if (numero <= 1) {
                primo = false;
            } else {
                primo = true; // Asumimos que es primo hasta probar lo contrario
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        } while (!primo);
    }

    public static boolean esPrimoRecursivo(int numero, int divisor) {
        if (numero <= 1) {
            return false; // 1 y números negativos no son primos
        }
        if (divisor > Math.sqrt(numero)) {
            return true; // Si hemos verificado hasta la raíz cuadrada sin divisores, es primo
        }
        if (numero % divisor == 0) {
            return false; // Si encontramos un divisor, no es primo
        }
        return esPrimoRecursivo(numero, divisor + 1); // Llamada recursiva con el siguiente divisor
    }
}
