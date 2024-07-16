package BucleFor;

public class ElementosOrdenInverso {
 
    public static void main(String[] args) {

        System.out.println("Ordenar elementos de menor a mayor :");
        int[] arrays = {5,2,12,4,10,25,9,13};
        int aux = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(arrays[i] < arrays[j]){
                    aux = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = aux;
                }
            }
        }
        System.out.println("El array ordenado es: " + arrays[0] + " " + arrays[1] + " " + arrays[2] + " " + arrays[3] + " " + arrays[4] + " " + arrays[5] + " " + arrays[6] + " " + arrays[7]);
    }
}
