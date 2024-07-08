package ClaseString;
import java.util.Scanner;
public class ConvertirMayusculaMinuscula {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Convertir Mayuscula a Minuscula");
        System.out.print("Ingresa una palabra o frase: ");
        String frase = entrada.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());        
    }
}
