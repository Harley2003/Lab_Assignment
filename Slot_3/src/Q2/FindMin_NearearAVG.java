// Find min which near ear with average of an arr?
package Q2;

import java.util.Scanner;

public class FindMin_NearearAVG {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.printf("Nhập số lượng phần tử mảng: ");
        int n =  sc.nextInt();
        
        int arr[] = new int[n];        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i +1);
            arr[i] = sc.nextInt();                         
         }
        // Tính Sum và Tính Avg
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int avg = sum / arr.length;
        
        // Tìm min gần nhất Avg
        int min = arr[0];
        int minDiff = Math.abs(arr[0] - avg);
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[0] - avg);
            if (diff < minDiff) {
                minDiff = diff;
                min = arr[i];
            }
        }
        System.out.println("Output:");
        System.out.println("Min which near ear with average:  " + min);
    }
}
