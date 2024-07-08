package ClaseString;

import java.util.Scanner;
public class CompararCadenas {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Comparar Cadenas");
        System.out.print("Ingresa una palabra o frase: ");
        String frase1 = entrada.nextLine();
        System.out.print("Ingresa otra palabra o frase: ");
        String frase2 = entrada.nextLine();
        if(frase1.equals(frase2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son diferentes");
        }
    }
}
