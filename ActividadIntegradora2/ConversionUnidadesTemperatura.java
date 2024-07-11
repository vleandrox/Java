package ActividadIntegradora2;

import java.util.Scanner;

public class ConversionUnidadesTemperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversion de temperatura");
        System.out.print("Ingresa la temperatura: ");
        double temp = entrada.nextDouble();
        System.out.print("Ingresa la unidades de medida Celsius (C) o Fahrenheit (F): ");
        String medida = entrada.next(); 
        if (medida.equals("C") || medida.equals("F")) {
            switch (medida) {
                case ("C"):
                    double tempF = (temp * 1.8) + 32;
                    System.out.println(temp + " grados Celsius equivale a: " + tempF + " grados Fahrenheit");
                    break;
                case ("F"):
                    double tempC = (temp - 32) / 1.8;
                    System.out.println(temp + " grados Fahrenheit equivale a: " + tempC + " grados Celsius");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("La medida no es valida");
        }
    }
}
