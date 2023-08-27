import java.util.Locale;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] may;
    private int n;
    public Scanner input = new Scanner(System.in).useLocale(Locale.US);

    PhongMay(){};

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] may, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.may = may;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getQuanLy() {
        return x;
    }

    public void setQuanLy(QuanLy x) {
        this.x = x;
    }

    public May[] getMay() {
        return may;
    }

    public void setMay(May[] may) {
        this.may = may;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap() {
        System.out.print("Nhập mã phòng: ");
        maPhong = input.nextLine();
        System.out.print("Nhập tên phòng: ");
        tenPhong = input.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich = input.nextDouble();
        System.out.println();
        x = new QuanLy();
        x.nhap();
        do {
            System.out.print("Nhập số lượng máy: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Số máy không thỏa mãn. Vui lòng nhập lại!");
            }
        }
        while (n <= 0);
        may = new May[n];
        for (int i = 0; i < n; i++) {
            may[i] = new May();
            System.out.println("Nhập thông tin cho máy thứ " + (i+1));
            may[i].nhap();
        }
    }

    public void xuat() {
        System.out.println("Mã phòng máy: " + maPhong);
        System.out.println("Tên phòng máy: " + tenPhong);
        System.out.println("Diện tích phòng máy: " + dienTich + " m2");
        System.out.println();
        x.xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin máy thứ " + (i+1));
            may[i].xuat();
        }
    }
}
