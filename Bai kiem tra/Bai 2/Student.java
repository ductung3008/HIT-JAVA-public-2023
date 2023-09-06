import java.util.Locale;
import java.util.Scanner;

public class Student extends Person {
    private int id;
    private Address address;
    private double gpa;

    public Student() {}

    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        super.input();
        System.out.print("Nhập mã sinh viên: ");
        id = input.nextInt();
        address = new Address();
        address.input();
        do {
            System.out.print("Nhập điểm/GPA: ");
            gpa = input.nextDouble();
            if (gpa < 0 || gpa > 4) {
                System.out.println("Không hợp lệ. Hãy nhập lại!");
            }
        }
        while (!(gpa >= 0 && gpa <= 4));
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void output() {
        System.out.printf("%-30s %-5s %-10s %-15s %-15s %-15s %.2f\n", super.getName(), super.getAge(), super.getGender(), id, address.getCity(), address.getDistrict(), gpa);
    }

}
