package ClaseString;

import java.util.Scanner;
public class EliminarEspacioBlanco {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Eliminar Cadena");
        System.out.print("Ingresa una palabra o frase: ");
        String frase = entrada.nextLine();
        System.out.println(frase.trim());

    }
}
