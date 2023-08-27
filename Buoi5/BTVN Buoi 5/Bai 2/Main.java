import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Số lượng sinh viên không hợp lý. Vui lòng nhập lại!");
            }
        }
        while (n <= 0);

        Student[] sv = new Student[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new Student();
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
            sv[i].input();
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i+1));
            sv[i].output();
            System.out.println();
        }
    }
}
