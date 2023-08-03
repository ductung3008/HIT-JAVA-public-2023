import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = input.nextDouble();
        System.out.print("Nhập số b: ");
        double b = input.nextDouble();
        System.out.print("Nhập số c: ");
        double c = input.nextDouble();

        // Convert to quadratic equation at^2 + bt + c = 0
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            double delta_sqrt = Math.sqrt(delta);
            double t1 = (-b + delta_sqrt) / (2 * a);
            double t2 = (-b - delta_sqrt) / (2 * a);
            if (t1 > 0 && t2 > 0) {
                double x1 = Math.sqrt(t1);
                double x2 = Math.sqrt(t2);
                System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " = 0 có các nghiệm là:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + (-x1));
                System.out.println("x3 = " + x2);
                System.out.println("x4 = " + (-x2));
            }
            else if ((t1 > 0 && t2 == 0) || (t1 == 0 && t2 > 0)) {
                double x = Math.sqrt(Math.max(t1, t2));
                System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " = 0 có các nghiệm là:");
                System.out.println("x1 = " + 0);
                System.out.println("x2 = " + x);
                System.out.println("x3 = " + (-x));
            }
            else if (t1 * t2 < 0 || (t1 == t2 && t1 > 0)) {
                double x = Math.sqrt(Math.max(t1, t2));
                System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " = 0 có các nghiệm là:");
                System.out.println("x1 = " + x);
                System.out.println("x2 = " + (-x));
            }
            else if ((t1 == t2 && t1 == 0) || (t1 * t2 <= 0 && ((t1 == 0) || (t2 == 0)))) {
                System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " = 0 có nghiệm là:");
                System.out.println("x = " + 0);
            }
            else {
                System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " = 0 vô nghiệm");
            }
        }
        else {
            System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " = 0 vô nghiệm");
        }
    }
}
