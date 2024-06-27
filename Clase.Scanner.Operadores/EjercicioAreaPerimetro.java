import java.util.Scanner;
public class EjercicioAreaPerimetro {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("");
        System.out.print("Ingresa el valor de la base del rectangulo: ");
        float baseRectangulo = entrada.nextFloat();
        System.out.print("Ingresa el valor de la altura del rectangulo: ");
        float alturaRectangulo = entrada.nextFloat();
        float perimetro = 2 * (baseRectangulo + alturaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        float area = baseRectangulo * alturaRectangulo;
        System.out.println("El area del rectangulo es: " + area);
        
    }
}
