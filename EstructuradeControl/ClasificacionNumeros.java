package EstructuradeControl;

import java.util.Scanner;
public class ClasificacionNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Clasificador de numeros");
        System.out.print("Ingresa un numero: ");    
        int numero = entrada.nextInt();
        if(numero >= 0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }  
    }
}
