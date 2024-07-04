package EstructuradeControl3;
import java.util.Scanner;
public class ConvertirCadenaEntero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Convertir cadena a entero");
        System.out.print("Ingresa una cadena: ");
        String cadena = entrada.nextLine();
        try {
            int entero = Integer.parseInt(cadena);
            System.out.println(entero);
        } catch (Exception e) {
            System.out.println("No se puede convertir");            
        }
    }
    
}
