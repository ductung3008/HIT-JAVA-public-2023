import java.util.Scanner;

public class Bai2 {
    public static Scanner input = new Scanner(System.in);

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static int[] delete(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        int pos;
        do {
            System.out.print("Nhập vị trí cần xóa phần tử: ");
            pos = input.nextInt();
            if (pos <= 0 || pos > newArr.length) {
                System.out.println("Vị trí không hợp lý. Vui lòng nhập lại!");
            }
        }
        while (pos <= 0 || pos > newArr.length);
        pos--;
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        System.out.print("Mảng sau khi xóa: ");
        printArray(newArr);
        return newArr;
    }

    public static int[] add(int[] arr) {
        int[] newArr = new int[arr.length + 1];
        int pos, value;
        do {
            System.out.print("Nhập vị trí cần thêm phần tử: ");
            pos = input.nextInt();
            if (pos <= 0 || pos > newArr.length) {
                System.out.println("Vị trí không hợp lý. Vui lòng nhập lại!");
            }
        }
        while (pos <= 0 || pos > newArr.length);
        System.out.print("Nhập giá trị phần tử mới: ");
        value = input.nextInt();
        pos--;
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = newArr.length - 1; i > pos; i--) {
            newArr[i] = arr[i - 1];
        }
        arr = newArr;
        System.out.print("Mảng sau khi thêm: ");
        printArray(arr);
        return newArr;
    }

    public static void main(String[] args) {
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

        int choice = -1;
        do {
            System.out.println("1. Xóa phần tử");
            System.out.println("2. Thêm phần tử");
            System.out.println("0. Kết thúc");
            System.out.print("Nhập lựa chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    arr = delete(arr);
                    break;
                case 2:
                    arr = add(arr);
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không thỏa mãn. Vui lòng nhập lại!");
            }
            System.out.println("Nhấn Enter để tiếp tục...");
            input.nextLine();
            input.nextLine();
        }
        while (choice != 0);
    }
}
