package BucleWhileyDoWhile;

import java.util.Scanner;
public class ContarNumeroParImpar {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Contar numero par e impar");
        System.out.print("Ingresa un numero: ");    
        int numero = entrada.nextInt();
        int contadorpar=0;
        int contadorimpar=0;
        while (numero != 0) {
            if (numero % 2 == 0) {     
                contadorpar++;
            }else{
                contadorimpar++;
            }
            System.out.print("Ingresa un numero: ");    
            numero = entrada.nextInt();
        }
        System.out.println("La cantidad de numeros pares es: " + contadorpar);
        System.out.println("La cantidad de numeros impares es: " + contadorimpar);

    }
}
