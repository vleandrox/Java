package Wrappers;
import java.util.Scanner;
public class ContarEspaciosCadenas {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Contar Espacios en blanco de una cadena");
        System.out.print("Ingresa la frase : ");
        String cadena = entrada.nextLine();
        int contadorEspacios = 0;
        for(int i = 0;i<cadena.length();i++){            
            char caracter = cadena.charAt(i);
            if(Character.isWhitespace(caracter)){
                contadorEspacios++;
            }
        }
        System.out.print("La cadena contiene : " + contadorEspacios + " espacios") ;
    }
}
