package BucleWhileyDoWhile;

import java.util.Scanner;

public class EjemploDoWhile {
 
    public static void main(String[] args) {
        System.out.println("Calcula el numero de cifras de un numero");
        Scanner pepe = new Scanner(System.in);
        int numero = 0;
        do{
            System.out.print("Ingresa un numero mayor a cero : ");
            numero = pepe.nextInt();
        }while (numero <= 0);
        
        int cifras = 0;
        while (numero > 0) {
            numero = numero / 10;
            cifras++;
        }
        System.out.println("El numero tiene " + cifras + " cifras");
    }
}

