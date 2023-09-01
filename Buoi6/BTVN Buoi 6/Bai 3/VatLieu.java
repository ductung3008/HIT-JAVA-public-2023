import java.util.Scanner;

public class VatLieu {
    private String ten;
    private String mauSac;
    private int doCung;

    public VatLieu() {}

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên vật liệu: ");
        ten = input.nextLine();
        System.out.print("Nhập màu: ");
        mauSac = input.nextLine();
        System.out.print("Nhập độ cứng: ");
        doCung = input.nextInt();
    }

    public void xuat() {
        System.out.println("Tên vật liệu: " + ten);
        System.out.println("Màu: " + mauSac);
        System.out.println("Độ cứng: " + doCung);
    }
}
