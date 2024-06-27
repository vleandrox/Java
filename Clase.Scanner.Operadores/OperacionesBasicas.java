import java.util.Scanner;

public class OperacionesBasicas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int suma = a + b;
        System.out.println("La suma de las dos variables es : " + suma);

        int c = 0;
        int d = 0;
        System.out.print("Ingresa el primer valor: ");
        c = entrada.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        d = entrada.nextInt();
        int suma2 = c + d;
        System.out.print("La suma de las dos variables es : " + suma2);
        




    }
    
}
