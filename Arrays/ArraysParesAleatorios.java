package Arrays;

public class ArraysParesAleatorios {

    public static void main(String[] args) {

        int valor1 = (int) ((Math.random() * 10) + 1);
        int valor2 = (int) ((Math.random() * 100) - 10);
        int valor3 = (int) ((Math.random() * 10) + 1);
        int valor4 = (int) ((Math.random() * 100) - 10);
        int valor5 = (int) ((Math.random() * 10) + 1);
        int[] array = { valor1, valor2, valor3, valor4, valor5 };
        System.out.println("Los valores del array son: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3]
                + " " + array[4]);

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("La cantidad de numeros pares en el arreglo es: " + count);
    }
}
