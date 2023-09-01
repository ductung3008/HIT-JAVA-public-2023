import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Số sinh viên không thể nhỏ hơn 1. Vui lòng nhập lại!");
            }
        }
        while (n <= 0);

        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0 ;i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i+1));
            Student sv = new Student();
            sv.input();
            students.add(sv);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i+1));
            students.get(i).output();
        }
    }
}
