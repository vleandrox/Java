package Metodos2;

import java.util.Scanner;

public class EsPar {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {                
        int numero = solicitarNumero();        
        esPar(numero);
    }
    public static int solicitarNumero(){        
        Integer numero = null;
        System.out.println();
        System.out.print("Por favor ingrese un número : ");
        do {
            try {
                numero = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No ingresó un número, intente nuevamente:");
                entrada.nextLine();
            }
            
        } while (numero==null);
        return numero;
    }
    public static Boolean esPar(int numero){         
        if (numero % 2 == 0) {
            System.out.println("El "+numero+" es par");
        }else{
            System.out.println("El "+numero+" es impar");
        }
        return true;
    }
}
