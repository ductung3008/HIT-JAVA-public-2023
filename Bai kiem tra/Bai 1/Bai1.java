import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            char sign = (i - 1 >= 0) ? s.charAt(i - 1) : ' ';
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp = temp * 10 + (s.charAt(i) - '0');
                i++;
            }
            temp = (sign == '-') ? (temp * -1) : temp;
            sum += temp;
        }
        System.out.println(sum);
    }
}

