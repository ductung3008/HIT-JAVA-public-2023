import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;
    public Scanner input = new Scanner(System.in);

    QuanLy(){}

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void nhap() {
        System.out.println("Nhập thông tin quản lý: ");
        System.out.print("Nhập mã quản lý: ");
        maQL = input.nextLine();
        System.out.print("Nhập tên người quản lý: ");
        hoTen = input.nextLine();
        System.out.println();
    }

    public void xuat() {
        System.out.println("Thông tin quản lý: ");
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Tên người quản lý: " + hoTen);
        System.out.println();
    }
}
