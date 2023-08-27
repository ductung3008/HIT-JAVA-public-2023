import java.util.Scanner;

public class NSX {
    private String maNSX;
    private String tenNSX;
    private String diaChiNSX;
    public Scanner input = new Scanner(System.in);

    public NSX() {}

    public NSX(String maNSX, String tenNSX, String diaChiNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChiNSX = diaChiNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChiNSX() {
        return diaChiNSX;
    }

    public void setDiaChiNSX(String diaChiNSX) {
        this.diaChiNSX = diaChiNSX;
    }

    public void nhap() {
        System.out.print("Nhập mã nhà sản xuất: ");
        maNSX = input.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        tenNSX = input.nextLine();
        System.out.print("Nhập địa chỉ nhà sản xuất: ");
        diaChiNSX = input.nextLine();
    }

    public void xuat() {
        System.out.println("Mã nhà sản xuất: " + this.maNSX);
        System.out.println("Tên nhà sản xuất: " + this.tenNSX);
        System.out.println("Địa chỉ nhà sản xuất: " + this.diaChiNSX);
    }
}
