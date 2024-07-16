package BucleForEach;

public class ConcatenandoElementos {
    
    public static void main(String[] args) {
        System.out.println("Concatenando elementos");
        String[] arrays = {"Hola", "mundo", "!"};
        for(int i = 0; i < arrays.length; i++) {
            System.out.println("Arrray" +"["+ i +"] : "+arrays[i]);
        }
               
        String concatenar = "";
        for (String string : arrays) {
            System.out.println("Concatenando: " + concatenar + " "+ string);
            concatenar = concatenar + string;
        }
    }
}
