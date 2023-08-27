import java.util.Locale;
import java.util.Scanner;

public class Student {
    private String name;
    private String _class;
    private double score;
    Faculty y;
    Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public Student() {}

    public Student(String name, String _class, double score, Faculty y) {
        this.name = name;
        this._class = _class;
        this.score = score;
        this.y = y;
    }

    public Student(String name, String _class, double score, String schoolName, String schoolDate, String facultyName, String facultyDate) {
        this.name = name;
        this._class = _class;
        this.score = score;
        this.y = new Faculty(facultyName, facultyDate, schoolName, schoolDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void setY(String schoolName, String schoolDate, String facultyName, String facultyDate) {
        this.y = new Faculty(facultyName, facultyDate, schoolName, schoolDate);
    }

    public void input() {
        y = new Faculty();
        y.input();
        System.out.print("Nhập tên sinh viên: ");
        name = input.nextLine();
        System.out.print("Nhập lớp của sinh viên: ");
        _class = input.nextLine();
        System.out.print("Nhập điểm của sinh viên: ");
        score = input.nextDouble();
    }

    public void output() {
        y.output();
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + _class);
        System.out.println("Điểm: " + score);
    }
}
