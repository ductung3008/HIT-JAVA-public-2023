import java.util.Locale;
import java.util.Scanner;

public class Dog extends Animal {
    private String character;

    @Override
    public void input() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập thông tin về con chó:");
        super.input();
        System.out.print("Nhập tính cách: ");
        character = input.nextLine();
        System.out.println();
    }
    public void output() {
        System.out.println("Thông tin về con chó:");
        super.output();
        System.out.println("Tính cách: " + character);
        System.out.println();
    }

    public void tiengKeu() {
        System.out.println("Con chó kêu gâu gâu");
    }
}
