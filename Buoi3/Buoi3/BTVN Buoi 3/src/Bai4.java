import java.util.Scanner;

public class Bai4 {
    public static void isSymmetrical(String str) {
        int length = str.length();
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = input.nextLine();
        isSymmetrical(str);
    }
}
