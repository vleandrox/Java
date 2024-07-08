package ClaseString;

import java.util.Scanner;
public class ConcatenarCadenas {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Concatenar Cadenas");
        System.out.print("Ingresa una palabra o frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingresa una palabra o frase: ");
        String frase2 = entrada.nextLine();
        System.out.print(frase.concat(frase2));
    }
}
