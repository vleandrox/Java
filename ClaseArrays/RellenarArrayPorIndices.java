package ClaseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarArrayPorIndices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Rellenando arreglo personalizado");

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamanio = entrada.nextInt();
        int[] array = new int[tamanio];

        int ultimoIndice = 0; // El último índice hasta el que se ha rellenado el array
        int numero;
        int indice;

        while (ultimoIndice < tamanio) {
            System.out.print("Ingresa un número para rellenar el array: ");
            numero = entrada.nextInt();

            do {
                System.out.print("Ingresa el índice hasta el cual quieres rellenar el array (debe ser mayor que "
                        + ultimoIndice + " y menor que " + tamanio + "): ");
                indice = entrada.nextInt();

                if (indice <= ultimoIndice || indice > tamanio) {
                    System.out.println("Error! El índice debe ser mayor que " + ultimoIndice + " y menor o igual que "
                            + tamanio + ".");
                }
            } while (indice <= ultimoIndice || indice > tamanio);

            Arrays.fill(array, ultimoIndice, indice, numero);
            ultimoIndice = indice;
        }

        System.out.println("El array rellenado es: " + Arrays.toString(array));
        entrada.close();
    }
}
