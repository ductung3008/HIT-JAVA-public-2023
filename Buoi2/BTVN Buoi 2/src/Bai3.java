import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = input.nextInt();
        }
        while (n <= 0);

        System.out.println("Kết quả:");
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        String result = (isPrime && n >= 2) ? " " : " không phải ";
        System.out.println(n + result + "là số nguyên tố");
    }
}
