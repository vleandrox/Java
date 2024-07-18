package Wrappers;

import java.util.Scanner;

public class VerificarCadenaSoloLetras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificar Cadenas");
        System.out.print("Ingresa una palabra: ");
        String cadena = entrada.nextLine();
        int contadorcadena = 0;
        int contadornumeros = 0;
        int contadorotros = 0;
        for (int i = 0; i < cadena.length(); i++) {
            // System.out.println(cadena.charAt(i));
            if (Character.isLetter(cadena.charAt(i))) {
                contadorcadena++;
            } else if (Character.isDigit(cadena.charAt(i))) {
                contadornumeros++;
            } else {
                contadorotros++;
            }
        }          
        System.out.println("La frase tiene " + contadorcadena + " letras");
        System.out.println("La frase tiene " + contadornumeros + " numeros");
        System.out.println("La frase tiene " + contadorotros + " otros caracteres");
    }
}
