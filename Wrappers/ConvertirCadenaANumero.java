package Wrappers;
import java.util.Scanner;
public class ConvertirCadenaANumero {
        
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Convertir Cadenas a Numeros");
        System.out.print("Ingresa una palabra o frase: ");
        String cadena =  entrada.nextLine();
        Integer entero = Integer.parseInt(cadena);
        System.out.println(entero);
    }
}
