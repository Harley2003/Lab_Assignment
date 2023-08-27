
package Q1;

import java.util.Scanner;

public class FindMax_InputOutside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số lượng phần tử mảng: ");
        int n =  sc.nextInt();
        
        int arr[] = new int[n];        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i +1);
            arr[i] = sc.nextInt();                         
            }
        
        int max  = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Ouput:");
        System.out.println("Max: " + max);
        }
    } 

