package EstructuradeControl;

import java.util.Scanner;
public class RangoNumeros {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.err.println("Escribe un numero entre 0 y 100");
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        if( numero < 60){
            System.out.println("La letra F");
        }
        else if( numero >=60 && numero <= 69){
            System.out.println("La letra D");
        }
        else if( numero >=70 && numero <= 79){
            System.out.println("La letra C");
        }
        else if( numero >=80 && numero <= 89){
            System.out.println("La letra B");
        }
        else if( numero >=90 && numero <= 100){
            System.out.println("La letra A");
        }
        else{
            System.out.println("Numero supera el rango establecido");
        }
    }
}
