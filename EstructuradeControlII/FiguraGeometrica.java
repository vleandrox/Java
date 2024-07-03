package EstructuradeControlII;

import java.util.Scanner;
public class FiguraGeometrica {
 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Figuras Geometricas");
        System.out.print("Ingresa una opción del 1 al 3: ");
        int op = entrada.nextInt();    
        switch (op) {
            case 1:
                System.out.println("Hallando area de Circulo ");
                System.out.print("Ingrese el radio del circulo : ");
                float radio = entrada.nextFloat();
                float areaCirculo = (float) (Math.PI * Math.pow(radio, 2));
                System.out.print("El area del circulo es: " + areaCirculo);                
                break;
            case 2:
                System.out.println("Hallando area de Cuadrado ");
                System.out.print("Ingrese el lado del cuadrado :");
                float lado = entrada.nextFloat();
                float areaCuadrado = (float) (Math.pow(lado, 2));
                System.out.print("El area del cuadrado es: " + areaCuadrado);
                break;
            case 3:
                System.out.println("Hallando area de Triangulo ");
                System.out.print("Ingrese la base del triangulo :");
                float base = entrada.nextFloat();
                System.out.print("Ingrese la altura del triangulo :");
                float altura = entrada.nextFloat();
                float areaTriangulo = (float) ((base * altura) / 2);
                System.out.print("El area del triangulo es: " + areaTriangulo);
                break;
            default:
                System.out.print("Opción no valida");
                break;
        }
    }
}
