package BucleWhileyDoWhile;

import java.util.Scanner;

public class ContarDigitos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Contar Digitos");
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        int digitos = 0;
        if (numero == 0) {
            System.out.println("El numero tiene 1 digito");
        } else {
            while (numero > 0 || numero < 0) {
                numero = numero / 10;
                digitos++;
            }
            System.out.println("El numero tiene " + digitos + " digitos");
        }
    }
}
