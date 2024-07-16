package BucleForEach;

public class CalculandoPromedio {
    
    public static void main(String[] args) {

        float[] arrays = {10.0f, 20.0f, 30.0f, 40.0f, 50.0f, 60.0f, 70.0f, 80.0f, 90.0f, 100.0f};
        float promedio = 0.0f;
        float suma = 0.0f;
        for (float f : arrays) {
            suma += f;

        }
        System.out.println("La suma es: " + suma);
        System.out.println(suma / arrays.length);

    }
}
