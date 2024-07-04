package EstructuradeControl1;
import java.util.Scanner;
public class CalculoDescuento {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo de descuento");
        System.out.print("Ingresa el precio del producto : ");
        float precio = entrada.nextFloat();        
        float descuento = 0.10f;
        if(precio>=100){
            precio = precio - (precio*descuento);
            System.out.println("El precio con descuento es: "+ precio);
        }
        else{
            System.out.println("No hay descuento");
        }
    }
}
