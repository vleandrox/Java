package EstructuradeControl1;

import java.util.Scanner;
public class ClasificarEdad {

    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Clasificador de edades");
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();        
        if(edad < 18){
            System.out.println("Eres menor de edad");
        }else if(edad>18 && edad<64 ){
            System.out.println("Eres adulto");
        }else{
            System.out.println("Eres un adulto mayor");
        }
    }
    
}
