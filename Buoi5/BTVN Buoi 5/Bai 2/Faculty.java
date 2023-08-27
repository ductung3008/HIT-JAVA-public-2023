import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School x;
    Scanner input = new Scanner(System.in);

    public Faculty() {
        x = new School();
    }

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public Faculty(String name, String date, String schoolName, String schoolDate) {
        this.name = name;
        this.date = date;
        this.x = new School(schoolName, schoolDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getSchool() {
        return x;
    }

    public void setSchool(School x) {
        this.x = x;
    }

    public void setSchool(String schoolName, String schoolDate) {
        this.x = new School(schoolName, schoolDate);
    }

    public void input() {
        x = new School();
        System.out.print("Nhập tên trường: ");
        x.setName(input.nextLine());
        System.out.print("Nhập ngày vào trường: ");
        x.setDate(input.nextLine());
        System.out.print("Nhập tên khoa: ");
        name = (input.nextLine());
        System.out.print("Nhập ngày vào khoa: ");
        date = (input.nextLine());
    }

    public void output() {
        System.out.println("Trường: " + x.getName());
        System.out.println("Ngày vào trường: " + x.getDate());
        System.out.println("Khoa: " + name);
        System.out.println("Ngày vào khoa: " + date);
    }
}
