package EstructuradeControl;

import java.util.Scanner;
public class Divisibilidad {
    
    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Divisibilidad de 3 y 5");
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        if(numero%3 == 0 && numero%5==0){
            System.out.println("El numero es divisible entre 3 y 5");
        }else if (numero%3 == 0){
            System.out.println("El numero es divisible entre 3");
        }else if (numero%5 == 0){
            System.out.println("El numero es divisible entre 5");
        }else{
            System.out.println("El numero no es divisible entre 3 ni entre 5");
        }
    }
}
