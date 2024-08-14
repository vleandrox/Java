package Metodos2;

import java.util.Scanner;

public class Calculadora {

    public static Scanner entrada = new Scanner(System.in);
    public static double num1 = 0;
    public static double num2 = 0;
    public static int opcion = 0;

    public static void main(String[] args) {
        pedirNumeros();
        int opcion = menu();
        operaciones(num1, num2, opcion);
    }

    public static void pedirNumeros() {
        System.out.println("CALCULADORA");
        System.out.print("Ingresa el primer valor: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        num2 = entrada.nextInt();
        return;
    }

    public static int menu() {
        do {
            try {
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir ");
                System.out.print("Ingresa una opcion: ");
                opcion = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No ingresó un número, intente nuevamente:");
                entrada.nextLine();
            }
        } while (opcion < 1 || opcion > 5);
        return opcion;
    }

    public static void operaciones(double num1, double num2, int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("El resultado es: " + (num1 / num2));
                break;
            case 5:
                System.out.println("SALIENDO DEL PROGRAMA");
                break;
            default:
                System.out.println("Ingresa una opcion valida");
        } 
    }
}
