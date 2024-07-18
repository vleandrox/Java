package Wrappers;

import java.util.Scanner;

public class ContandoDigitosNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Contando digitos de un numero");
        System.out.print("Ingresa un numero : ");
        int numero = entrada.nextInt();
        String convertirnum = Integer.toString(numero);
        int contadorDigitos = 0;
        for (int i = 0; i < convertirnum.length(); i++) {
            char caracter = convertirnum.charAt(i);
            if (Character.isDigit(caracter)) {
                contadorDigitos++;
            }
        }
        System.out.println("El numero tiene " + contadorDigitos + " digitos");
    }
}
