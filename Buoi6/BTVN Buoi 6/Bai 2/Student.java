import java.util.Scanner;

public class Student extends Person {
    private String id;
    private String _class;
    private String school;

    public Student() {}

    public Student(String name, String address, Date birthDay, String id, String _class, String school) {
        super(name, address, birthDay);
        this.id = id;
        this._class = _class;
        this.school = school;
    }

    public Student(String name, String address, int year, Byte month, Byte day, String id, String _class, String school) {
        super(name, address, year, month, day);
        this.id = id;
        this._class = _class;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên trường: ");
        school = input.nextLine();
        System.out.print("Nhập tên lớp: ");
        _class = input.nextLine();
        System.out.print("Nhập mã sinh viên: ");
        id = input.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Trường: " + school);
        System.out.println("Lớp: " + _class);
        System.out.println("Mã sinh viên: " + id);
        System.out.println();
    }
}
