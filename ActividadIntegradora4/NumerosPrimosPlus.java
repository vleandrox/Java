package ActividadIntegradora4;

import java.util.Scanner;

public class NumerosPrimosPlus {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Generar números primos");
        System.out.print("Ingresa la cantidad de números primos a generar: ");
        int cantidad = entrada.nextInt();
        entrada.close();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número positivo.");
            return;
        }

        int[] primos = new int[cantidad];
        int index = 0;
        int numero = 2; // El primer número primo

        while (index < cantidad) {
            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false;
            } else if (numero == 2) {
                esPrimo = true; // 2 es el único número primo par
            } else if (numero % 2 == 0) {
                esPrimo = false; // Eliminar múltiplos de 2
            } else {
                for (int i = 3; i <= Math.sqrt(numero); i += 2) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                primos[index] = numero;
                index++;
            }

            numero++;
        }

        System.out.println("Números primos generados:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}
