
import java.util.Scanner;
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero : ");
        int valor1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int valor2 = entrada.nextInt();
        System.out.print("El numero " + valor1 + " es mayor al numero " + valor2 + " : " + (valor1 > valor2));        
        System.out.println();
        System.out.print("El numero " + valor1 + " es distinto al numero " + valor2 + " : " + (valor1 != valor2));
        System.out.println();
        System.out.print("El numero " + valor1 + " es divisible por 2 : " + (valor1 % 2 == 0));
        System.out.println();
        System.out.print("Ingrese otro numero entero : ");
        int valor3 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int valor4 = entrada.nextInt();
        System.out.print(valor1 +" es > a " + valor2 + " y " + valor3 + " es > a " + valor4 + " : " + (valor1>valor2 && valor3>valor4));
        System.out.println();
        System.out.print(valor1 +" es > a " + valor2 + " o " + valor3 + " es > a " + valor4 + " : " + (valor1>valor2 || valor3>valor4));
        System.out.println();

    }
}
