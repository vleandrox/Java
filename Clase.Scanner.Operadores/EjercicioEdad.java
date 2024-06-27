import java.util.Scanner;
public class EjercicioEdad {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int añoActual = 2024;
        System.out.print("Ingresa su año de nacimiento : ");
        int anio = entrada.nextInt();
        int edad = añoActual - anio;
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        } 
    }
}
