
import java.util.Scanner;
public class ScannerJava {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre por favor: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su edad por favor: ");
        int edad = entrada.nextInt();
        System.out.println("Su nombre es : " + nombre + " y su edad es: " + edad);
    }
    
}
