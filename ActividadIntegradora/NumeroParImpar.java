package ActividadIntegradora;

import java.util.Scanner;
public class NumeroParImpar {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero1 = entrada.nextInt();
        String resultado = (numero1 % 2 ==0) ? "El numero es par" : "El numero es impar";
        System.out.println(resultado);

    }
}
