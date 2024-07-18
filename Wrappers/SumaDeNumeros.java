package Wrappers;

import java.util.Scanner;
public class SumaDeNumeros {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Suma de Numeros");
        System.out.print("Ingresa un numero entero : ");
        String num1 = entrada.nextLine();
        System.out.print("Ingresa otro numero decimal : ");
        String num2 = entrada.nextLine();
        int n1 = Integer.valueOf(num1);
        double n2 = Double.valueOf(num2);
        System.out.println("La suma de los dos numeros es : " + (n1+n2));
    }
}
