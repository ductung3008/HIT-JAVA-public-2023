import java.util.Locale;
import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String preferences;
    private String ownerName;

    public Cat() {}

    public Cat(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void input () {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập thông tin về con mèo:");
        super.input();
        System.out.print("Nhập màu lông: ");
        color = input.nextLine();
        System.out.print("Nhập sở thích: ");
        preferences = input.nextLine();
        System.out.print("Nhập tên chủ: ");
        ownerName = input.nextLine();
        System.out.println();
    }

    public void output() {
        System.out.println("Thông tin về con mèo:");
        super.output();
        System.out.println("Màu lông: " + color);
        System.out.println("Sở thích: " + preferences);
        System.out.println("Tên chủ: " + ownerName);
        System.out.println();
    }

    public void tiengKeu() {
        System.out.println("Con mèo kêu meow meow");
    }
}
