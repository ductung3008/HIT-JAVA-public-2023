import java.util.Scanner;

public class Bai1 {
    public static int freqCount(int[] array, int target) {
        int count = 0;
        for (int x : array) {
            if (x == target) {
                count++;
            }
        }
        return count;
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
        int maxArr = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i +"] = ");
            arr[i] = input.nextInt();
            maxArr = Math.max(maxArr, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxArr + 1) continue;
            else {
                System.out.println("Số " + arr[i] + " xuất hiện " + freqCount(arr, arr[i]) + " lần");
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        arr[j] = maxArr + 1;
                    }
                }
            }
        }
    }
}
