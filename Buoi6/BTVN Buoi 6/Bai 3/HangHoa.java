import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    ArrayList<VatLieu> dsVL = new ArrayList<VatLieu>();

    public HangHoa() {}

    public HangHoa(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
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

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public ArrayList<VatLieu> getDsVL() {
        return dsVL;
    }

    public void setDsVL(ArrayList<VatLieu> dsVL) {
        this.dsVL = dsVL;
    }

    public void input() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhập mã hàng: ");
        maHang = input.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = input.nextLine();
        System.out.print("Nhập số lượng: ");
        soLuong = input.nextFloat();
        System.out.print("Nhập đơn giá: ");
        donGia = input.nextFloat();
        System.out.print("Nhập số lượng vật liệu: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Vật liệu thứ " + (i+1));
            VatLieu vl = new VatLieu();
            vl.nhap();
            dsVL.add(vl);
        }
    }

    public void output() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá(đồng): " + donGia);
        if (dsVL.size() > 0) {
            System.out.println("Danh sách vật liệu: ");
            for (int i = 0; i < dsVL.size(); i++) {
                System.out.print((i+1) + ". ");
                dsVL.get(i).xuat();
            }
        }
        System.out.println("Tổng tiền: " + tongTien() + " đồng");
    }

    public double tongTien() {
        return donGia * soLuong;
    }
}
