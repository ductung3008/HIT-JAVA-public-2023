import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    NSX x;
    public Scanner input = new Scanner(System.in);

    public Hang(){}

    public Hang(String maHang, String tenHang, NSX x) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.x = x;
    }

    public Hang(String maHang, String tenHang, String maNSX, String tenNSX, String diaChiNSX) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.x = new NSX(maNSX, tenNSX, diaChiNSX);
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getNSX() {
        return x;
    }

    public void setNSX(NSX x) {
        this.x = x;
    }

    public void setNSX(String maNSX, String tenNSX, String diaChiNSX) {
        x.setMaNSX(maNSX);
        x.setTenNSX(tenNSX);
        x.setDiaChiNSX(diaChiNSX);
    }

    public void nhap() {
        System.out.print("Nhập mã hàng: ");
        maHang = input.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = input.nextLine();
        x = new NSX();
        System.out.println("Nhập thông tin nhà sản xuất:");
        x.nhap();
    }

    public void xuat() {
        System.out.println("Mã hàng: " + this.maHang);
        System.out.println("Tên hàng: " + this.tenHang);
        System.out.println("Thông tin nhà sản xuất: ");
        x.xuat();
    }
}
