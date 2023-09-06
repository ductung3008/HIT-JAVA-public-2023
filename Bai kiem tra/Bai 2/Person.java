import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = input.nextLine();
        do {
            System.out.print("Nhập tuổi: ");
            age = input.nextInt();
            if (age < 0) {
                System.out.println("Tuổi không hợp lệ. Hãy nhập lại!");
            }
        }
        while (age < 0);
        input.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = input.nextLine();
        System.out.println();
    }

    public void output() {
        System.out.printf("%-30s %-5s %-10s", name, age, gender);
    }
}
