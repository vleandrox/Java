package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class OrdenarNombresArray {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa 5 nombres: ");
        System.out.print("Ingresa el primer nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("Ingresa el segundo nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.print("Ingresa el tercer nombre: ");
        String nombre3 = entrada.nextLine();
        System.out.print("Ingresa el cuarto nombre: ");
        String nombre4 = entrada.nextLine();
        System.out.print("Ingresa el quinto nombre: ");
        String nombre5 = entrada.nextLine();
        String[] nombres = {nombre1, nombre2, nombre3, nombre4, nombre5};
        String[] nombreOrden = Arrays.stream(nombres).sorted().toArray(String[]::new);
        System.out.println("Nombres ordenadores : "+ Arrays.toString(nombreOrden));
    }
}
