package Wrappers;

import java.util.Scanner;
public class VerificarCadena {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificar Cadenas");
        System.out.print("Ingresa una palabra o frase: ");
        String cadena =  entrada.nextLine();
        
        try {
            Double convertido = Double.valueOf(cadena);    
        } catch (Exception e) {
            System.out.print("La entrada no es un numero valido.");// TODO: handle exception
        }
                
    }
}
