package Metodos;

import java.util.Scanner;

public class PracticaInicial {
    public static Scanner datos = new Scanner(System.in);
    public static void main(String[] args) {    
        String nombre = obtenerNombre(datos);
        int edad = obtenerEdad(datos);
        imprimirNombre(nombre);
        imprimirNombreYEdad(nombre,edad);
    }
    public static void imprimirNombre(String nombre) {        
        System.out.println("Tu nombre es: " + nombre);
    }
    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo : " + nombre + " y tengo : " + edad + " años");
    }
    public static String obtenerNombre(Scanner nombre){
        System.out.print("Ingresa tu nombre por favor: ");
        return datos.nextLine();
    }
    public static int obtenerEdad(Scanner edad){
        System.out.print("Ingresa tu edad por favor: ");
        return datos.nextInt();
    }
}
