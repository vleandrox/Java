package ActividadIntegradora3;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numeros primos");
        int numero;
        boolean primo;
        do {
            System.out.print("Ingresa un número (0 para terminar): ");
            numero = entrada.nextInt();
            
            if (numero == 0) {
                break; // Termina el bucle si el usuario ingresa 0
            }        
            if (numero <= 1) {
                primo = false;
            } else {
                primo = true; // Asumimos que es primo hasta probar lo contrario
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }            
            if (primo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        } while (!primo);

        entrada.close();
    }
}
