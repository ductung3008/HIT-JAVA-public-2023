import java.util.Scanner;

public class Bai3 {
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void ascSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng n = ");
            n = input.nextInt();
        }
        while (n <= 0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i +"] = ");
            arr[i] = input.nextInt();
        }

        ascSort(arr);
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        printArray(arr);
    }
}
