package ActividadIntegradora3;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Se va a mostrar la serie de Fibonacci");
        System.out.print("Ingresa el numero de elementos que va a mostrar : ");
        int num = entrada.nextInt();
        int[] fibo = new int[num];

        fibo[0] = 0;// Inicializar los primeros dos términos
        fibo[1] = 1;
        int i = 2;

        while (i < num) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            i++;
        }

        System.out.println("Los primeros " + num + " términos de la serie de Fibonacci son:");
        for (int j = 0; j < num; j++) {
            System.out.print(fibo[j] + " ");
        }
        entrada.close();
    }

}
