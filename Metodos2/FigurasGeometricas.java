package Metodos2;

import java.util.Scanner;

public class FigurasGeometricas {

    public static Scanner entrada = new Scanner(System.in);
    public static int figura = 0;

    public static void main(String[] args) {
        pedirFigura();
        calcularAreas(figura);
    }

    public static void pedirFigura() {
        System.out.println("Figuras Geometricas");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.print("Ingresa una opcion: ");
        figura = entrada.nextInt();
    }

    public static void calcularAreas(int figura) {
        switch (figura) {
            case 1:
                System.out.println("Que quieres hallar?");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                System.out.print("Ingresa una opcion: ");
                int opcion1 = entrada.nextInt();
                if (opcion1 == 1) {
                    System.out.println("Hallando area de Cuadrado");
                    System.out.print("Ingresa el lado del cuadrado: ");
                    float lado = entrada.nextFloat();
                    float areaCuadrado = (float) (lado * lado);
                    System.out.println("El area del cuadrado es: " + areaCuadrado);
                } else if (opcion1 == 2) {
                    System.out.println("Hallando Perimetro de Cuadrado");
                    System.out.print("Ingresa el lado del cuadrado: ");
                    float lado = entrada.nextFloat();
                    float perimetroCuadrado = (float) (lado * 4);
                    System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
                }
                break;
            case 2:
                System.out.println("Que quieres hallar?");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                System.out.print("Ingresa una opcion: ");
                int opcion2 = entrada.nextInt();
                if (opcion2 == 1) {
                    System.out.println("Hallando area de Triangulo");
                    System.out.print("Ingresa la base del triangulo: ");
                    float base = entrada.nextFloat();
                    System.out.print("Ingresa la altura del triangulo: ");
                    float altura = entrada.nextFloat();
                    float areaTriangulo = (float) ((base * altura) / 2);
                    System.out.println("El area del triangulo es: " + areaTriangulo);
                } else if (opcion2 == 2) {
                    System.out.println("Hallando Perimetro de Triangulo");
                    System.out.print("Ingresa la base del triangulo: ");
                    float base = entrada.nextFloat();
                    System.out.print("Ingresa la altura del triangulo: ");
                    float altura = entrada.nextFloat();
                    float perimetroTriangulo = (float) (2 * (base + altura));
                    System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
                }
                break;
            case 3:
                System.out.println("Que quieres hallar?");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                System.out.print("Ingresa una opcion: ");
                int opcion3 = entrada.nextInt();
                if (opcion3 == 1) {
                    System.out.println("Hallando area de Circulo");
                    System.out.print("Ingresa el radio del circulo: ");
                    float radio = entrada.nextFloat();
                    float areaCirculo = (float) (3.14 * (radio * radio));
                    System.out.println("El area del circulo es: " + areaCirculo);
                } else if (opcion3 == 2) {
                    System.out.println("Hallando Perimetro de Circulo");
                    System.out.print("Ingresa el radio del circulo: ");
                    float radio = entrada.nextFloat();
                    float perimetroCirculo = (float) (2 * 3.14 * radio);
                    System.out.println("El perimetro del circulo es: " + perimetroCirculo);
                }
                break;
        }
    }
}
