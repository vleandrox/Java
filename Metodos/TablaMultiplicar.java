package Metodos;

import java.util.Scanner;

public class TablaMultiplicar {

    public static Scanner entrada = new Scanner(System.in);
 
    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTabla(numero);
    }

    public static int pedirNumero(){
        System.out.print("Ingrese el numero : ");
        return entrada.nextInt();
    }

    public static void imprimirTabla(int numero){
        System.out.println("Tablas de Multiplicar del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

}
