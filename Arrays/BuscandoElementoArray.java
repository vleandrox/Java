package Arrays;

import java.util.Scanner;
public class BuscandoElementoArray {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Buscando elementos");
        int valor1 = (int) ((Math.random()*10)+1);
        int valor2 = (int) ((Math.random()*10)+1);
        int valor3 = (int) ((Math.random()*10)+1);
        int[] array = {valor1,valor2,valor3};
        System.out.println("Los valores del array son: " + array[0] + " " + array[1] + " " + array[2]);
        System.out.print("Ingresa el valor a buscar:  ");
        int valor4 = entrada.nextInt();
        if(valor4 == array[0] || valor4 == array[1] || valor4 == array[2]){
            System.out.println("Se encontro el valor");
        }else{
            System.out.println("No se encontro el valor");
        }
        // int[] array = new int[3];
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = (int) (Math.random()*10);
        // }
    }
}

