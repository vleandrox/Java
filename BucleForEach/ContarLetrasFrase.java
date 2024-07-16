package BucleForEach;
import java.util.Scanner;
public class ContarLetrasFrase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] frase = {"A","P","R","E","N","D","I","E","N","D","O","J","A","V","A"};
        System.out.println("");
        for (int i = 0; i < frase.length; i++) {
            System.out.print(frase[i] + " ");
        }
        System.out.println("");
        System.out.println("La frase tiene: " + frase.length + " letras");
        System.out.print("INGRESA UNA LETRA: ");
        String letra = entrada.next().toUpperCase();
        int contador = 0;
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].charAt(0) == letra.charAt(0)) {
                contador++;
            }            
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces en la frase");
    }
}
