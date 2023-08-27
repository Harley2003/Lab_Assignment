package Menu;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số lượng phần tử mảng: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Số lượng phần tử trong mảng là: " + arr[i]);
        }

        // sort
        int count;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count = arr[i];
                     arr[i] = arr[j];
                     arr[j] = count;
                }
            }
        }
        
        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sort min to max: " + arr[i]);
        }

    }
}
