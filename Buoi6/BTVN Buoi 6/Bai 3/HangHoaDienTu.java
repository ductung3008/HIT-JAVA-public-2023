import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;

    public HangHoaDienTu() {}

    public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL, int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập thời gian bảo hành: ");
        thoiGianBaoHanh = input.nextInt();
        System.out.print("Nhập công suất: ");
        congSuat = input.nextInt();
        System.out.println();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Thời gian bảo hành: " + thoiGianBaoHanh);
        System.out.println("Công suất: " + congSuat);
        System.out.println();
    }
}
