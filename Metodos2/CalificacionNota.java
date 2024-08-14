package Metodos2;

import java.util.Scanner;

public class CalificacionNota {

    public static Scanner entrada = new Scanner(System.in);
    public static int nota = 0;
    public static void main(String[] args) {

        int nota = ingresoNota();
        calificacionNota(nota);
    }

    public static int ingresoNota(){
        System.out.println();
        do {
            try {
                System.out.print("Ingrese la nota (0-100): ");
                nota = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No ingresó un número entre el rango, intente nuevamente: ");
                entrada.nextLine();
            }            
        } while (nota<0 || nota>100);
        return nota;
    }

    public static int calificacionNota(int nota){
        if (nota >= 90 && nota <= 100) {
            System.out.println("La nota es A");            
        }
        else if (nota >= 80 && nota < 90) {
            System.out.println("La nota es B");
        }
        else if (nota >= 70 && nota < 80) {
            System.out.println("La nota es C");
        }
        else if (nota >= 60 && nota < 70) {
            System.out.println("La nota es D");
        }
        else if (nota >= 0 && nota < 60) {
            System.out.println("La nota es F");
        }
        return nota;
    }
}
