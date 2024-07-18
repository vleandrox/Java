package Wrappers;
import java.util.Scanner;
public class CadenaConLetrasoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificar si una cadena contiene solo letras.");
        System.out.print("Introduce una cadena: ");
        String input = scanner.nextLine();
        boolean allLetters = true;// inicialmente se considera que la cadena contiene solo letras
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c)) {// si el caracter no es una letra
                allLetters = false;
                break;
            }
        }
        if (allLetters) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }
    }
}
