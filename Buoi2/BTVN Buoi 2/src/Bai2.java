import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = input.nextInt();
        }
        while (n <= 0);

        // a
        float S = 0;
        for (int i = 1; i <= n; i++) {
            S += 1.0 / i;
        }
        System.out.println("S = " + S);

        // b
        int P = 0;
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
            P += gt;
        }
        System.out.println("P = " + P);
    }
}
