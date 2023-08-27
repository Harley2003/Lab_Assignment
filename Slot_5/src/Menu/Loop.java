
package Menu;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int arr[] = new int [8];
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {   
            System.out.println("Even numbers: " + i);
            }
        }  
        
        int j = 2;
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.println("Even numbers: " + j);
            }
            j++;
        }
    }
}
