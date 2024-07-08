package ClaseString;

import java.util.Scanner;
public class CalcularLongitudCadena {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Longitud de una cadena");
        System.out.print("Ingresa una palabra o frase: ");
        String frase = entrada.nextLine();
        System.out.println("La longitud de la frase es: " + frase.replace(" ", "").length());
    }
}
