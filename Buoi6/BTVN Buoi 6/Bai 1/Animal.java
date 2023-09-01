import java.util.Locale;
import java.util.Scanner;

public class Animal {
    private String name;
    private Byte age;
    private Float weight;

    public Animal() {}

    public Animal(String name, Byte age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void input() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhập tên: ");
        name = input.nextLine();
        do {
            System.out.print("Nhập tuổi: ");
            age = input.nextByte();
            if (age <= 0) {
                System.out.println("Tuổi không thể nhỏ hơn hoặc bằng 0. Vui lòng nhập lại!");
            }
        }
        while (age <= 0);
        do {
            System.out.print("Nhập cân nặng: ");
            weight = input.nextFloat();
            if (weight <= 0) {
                System.out.println("Cân nặng không thể nhỏ hơn hoặc bằng 0. Vui lòng nhập lại!");
            }
        }
        while (weight <= 0);
    }

    public void output() {
        tiengKeu();
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Cân nặng: " + weight + " kg");
    }

    public void tiengKeu() {
        System.out.println("Con gì đó kêu hí hí");
    }
}
