// Max (a, b, c) ?
package Q1;

import java.util.Scanner;

public class FindMax_InputInside {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {20, 10,  40};
        // a = arr[0], b  = arr[1], c = arr[2]
        int max  = arr [0]; 
        
        if (max < arr[1]) {
            max = arr [1];       
        }
        System.out.println("Output:");
        System.out.println("Max of b: " + max);
        
        if (max  < arr [2]) {
            max  = arr [2];
        }
        System.out.println("Output: ");
        System.out.println("Max of c: " + max); 
    }
}
