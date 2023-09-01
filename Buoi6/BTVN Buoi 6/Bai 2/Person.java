import java.time.Year;
import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private Date birthDay;
    private int age;

    public Person() {}

    public Person(String name, String address, Date birthDay) {
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
        age = Year.now().getValue() - birthDay.getYear();
    }

    public Person(String name, String address, int year, Byte month, Byte day) {
        this.name = name;
        this.address = address;
        this.birthDay = new Date(year, month, day);
        age = Year.now().getValue() - birthDay.getYear();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        name = input.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = input.nextLine();
        System.out.println("Nhập ngày sinh:");
        birthDay = new Date();
        birthDay.input();
        age = Year.now().getValue() - birthDay.getYear();
    }

    public void output() {
        System.out.println("Họ và tên: " + name);
        System.out.print("Ngày sinh: ");
        birthDay.output();
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }
}
