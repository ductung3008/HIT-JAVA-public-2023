import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    private int classId;
    private int numberOfStudent;
    private ArrayList<Student> listStudents = new ArrayList<Student>();

    public Classroom() {}

    public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudents) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
        this.listStudents = listStudents;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã lớp: ");
        classId = input.nextInt();
        System.out.print("Nhập số lượng sinh viên: ");
        numberOfStudent = input.nextInt();
        System.out.println("Nhập thông tin về lớp:");

        for (int i = 0; i < numberOfStudent; i++) {
            Student sv = new Student();
            sv.input();
            listStudents.add(sv);
        }
    }

    public void output() {
        System.out.println("Danh sách sinh viên lớp " + classId);
        System.out.printf("%-30s %-5s %-10s %-15s %-15s %-15s %-4s\n", "Họ và tên", "Tuổi", "Giới tính", "MSV", "Tỉnh", "Huyện", "Điểm");
        for (int i = 0; i < listStudents.size(); i++) {
            listStudents.get(i).output();
        }
    }

    private ArrayList<Student> searchByName(String name) {
        ArrayList<Student> result = new ArrayList<Student>();
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getName().equals(name)) {
                result.add(listStudents.get(i));
            }
        }
        return result;
    }
}
