package ClaseString;

import java.util.Scanner;
public class BusquedadeCaracter {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Busqueda de caracteres");
        System.out.print("Ingresa una palabra o frase: ");
        String frase1 = entrada.nextLine();
        System.out.print("Ingresa un caracter a buscar: ");
        char frase2 = entrada.next().charAt(0);
        int busqueda = frase1.indexOf(frase2);
        if(busqueda == -1){
            System.out.println("No se encontro el caracter");
        }else{
            System.out.println("Se encontro el caracter");
            System.out.println("La posicion del caracter es: " + busqueda);
        }
        
    }
}
