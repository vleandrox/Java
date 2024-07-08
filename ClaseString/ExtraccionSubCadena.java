package ClaseString;

import java.util.Scanner;
public class ExtraccionSubCadena {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.err.println("Extracción de una subcadena");
        System.out.print("Ingresa una palabra o frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingrese un numero entero inicial: ");
        int inicial = entrada.nextInt();
        System.out.print("Ingrese un numero entero final: ");
        int final1 = entrada.nextInt();
        System.out.println(frase.substring(inicial, final1));

    }
}
