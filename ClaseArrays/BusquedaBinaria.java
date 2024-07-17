package ClaseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("------------------------Busqueda Binaria-------------------");
        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) Math.floor(Math.random() * (30 - 1)) + 1;
        }
        System.out.println("El Array es : "  + Arrays.toString(enteros));
        Arrays.sort(enteros);
        System.out.println("El Array ordenado : "  + Arrays.toString(enteros));
        System.out.print("Ingrese el numero a buscar : ");
        int numero = entrada.nextInt();
        int valor = Arrays.binarySearch(enteros, numero);
        if(valor >= 0){
            System.out.print("Su numero esta ubicado en el Array " +"["+Arrays.binarySearch(enteros, numero)+"]") ;
        }
        else{
            System.out.print("Su numero no se encuentra ubicado en el Array Generado.");
        }
    }    
}
