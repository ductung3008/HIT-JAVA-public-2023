import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    private double d;
    private double r;
    public Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public Rectangle(){}

    public Rectangle(double d, double r) {
        this.d = d;
        this.r = r;
    }
    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void nhap() {
        do {
            System.out.print("Nhập chiều dài: ");
            d = input.nextDouble();
            if(d <= 0) {
                System.out.println("Chiều dài không hợp lệ. Vui lòng nhập lại!");
            }
        }
        while (d <= 0);
        do {
            System.out.print("Nhập chiều rộng: ");
            r = input.nextDouble();
            if(r <= 0) {
                System.out.println("Chiều rộng không hợp lệ. Vui lòng nhập lại!");
            }
        }
        while (r <= 0);
    }

    public void veHCN() {
        System.out.println("Hình chữ nhật: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public double chuVi() {
        return 2 * (d + r);
    }

    public double dienTich() {
        return d * r;
    }
}
