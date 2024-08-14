package Metodos2;

import java.util.Scanner;

public class RellenarArray {
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) { 

        // Solicitar el tamaño del arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamaño = entrada.nextInt();
        int[] array = new int[tamaño];

        // Rellenar el arreglo según lo solicitado
        rellenarArray(array);

        // Imprimir el arreglo completo
        System.out.println("Arreglo completo:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rellenarArray(int[] array) { 
        int ultimoIndice = 0;

        while (ultimoIndice < array.length - 1) {
            // Solicitar un número para rellenar
            System.out.print("Ingresa un número para rellenar el arreglo: ");
            int numero = entrada.nextInt();

            // Solicitar el índice hasta el cual se desea rellenar
            int indice;
            do {
                System.out.print("Ingresa el índice hasta el cual deseas rellenar (mayor que " + ultimoIndice + " y menor que " + array.length + "): ");
                indice = entrada.nextInt();
            } while (indice <= ultimoIndice || indice >= array.length);

            // Rellenar el arreglo con el número ingresado hasta el índice especificado
            for (int i = ultimoIndice; i <= indice; i++) {
                array[i] = numero;
            }

            // Actualizar el último índice ingresado
            ultimoIndice = indice;
        }
    }
}
