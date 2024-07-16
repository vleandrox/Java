package BucleFor;

import java.util.Arrays;

public class InvertirUnArray {
    
    public static void main(String[] args) {

        int[] arrays = {1, 5, 4, 8, 10, 7, 15};
        System.out.println("Arrays Invertidos");
        System.out.println("Arrays original: " + Arrays.toString(arrays));
        int n = arrays.length;
        
        for (int i = 0; i < n / 2; i++) {
            System.out.println("Arrays[i] : " + arrays[i]);

            int temp = arrays[i];
            System.out.println("TEMP 1 : " + temp);

            arrays[i] = arrays[n - i - 1];
            System.out.println("Arrays[i] : " + arrays[i]);
            System.out.println("arrays[n-i-1] : "+arrays[n - i - 1]);            
            
            arrays[n - i - 1] = temp;
            System.out.println("TEMP 2 : "+temp);
        }
        System.out.print("Arrays invertido: " + Arrays.toString(arrays));                
    }
}
