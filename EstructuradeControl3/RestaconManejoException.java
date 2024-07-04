package EstructuradeControl3;

import java.util.Scanner;
public class RestaconManejoException {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Resta con manejo de excepciones");
        System.out.print("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();
        try {
            int resta = num1 - num2;
            System.out.println("La resta es: " + resta);            
        } catch (ArithmeticException e){
            System.out.println("No se puede realizar la resta");    
        }catch (Exception e) {
            System.out.println("No se puede realizar la resta");
        }
    }
}
