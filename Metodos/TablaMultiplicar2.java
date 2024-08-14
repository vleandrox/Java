package Metodos;

import java.util.Scanner;

public class TablaMultiplicar2 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirNumeros(numeros);
        imprimirTablasMultiplicar(numeros);
    }
    public static int[] pedirNumeros(){
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un numero: ");
            array[i] = entrada.nextInt();
        }
        return array;
    }
    public static void imprimirNumeros(int[] array){
        System.out.println("Los valores del array son: " + array[0] + " " + array[1] + " " + array[2]);
    }
    public static void imprimirTablasMultiplicar(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("TABLA DEL " + array[i]);
            for (int j = 0; j <= 10; j++) {
                System.out.println(array[i] + " x " + j + " = " + array[i] * j);
            }
            System.out.println();
        }
    }
}
