package Debugger;

import java.util.Scanner;

public class DepurarCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.print("Ingresa el primer valor: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int num2 = entrada.nextInt();
        System.out.println(" 1 - Sumar ");
        System.out.println(" 2 - Restar ");
        System.out.println(" 3 - Multiplicar ");
        System.out.println(" 4 - Dividir ");
        System.out.print("Ingresa una opción: ");
        int operacion = entrada.nextInt();
        switch (operacion) {
            case 1:
                float suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;

            case 2:
                float resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;

            case 3:
                float multiplicacion = num1 * num2; 
                System.out.println("El resultado es: " + multiplicacion);
                break;

            case 4:
            try {
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir por 0");
                }
                float division = num1 / num2;
                System.out.println("El resultado es: " + division);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }           
                break;
            default:
                break;
        }
    }
}
