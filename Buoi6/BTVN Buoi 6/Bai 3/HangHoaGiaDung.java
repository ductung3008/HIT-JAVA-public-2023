import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa {
    private String chucNang;

    public HangHoaGiaDung() {}

    public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL, String chucNang) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chức năng: ");
        chucNang = input.nextLine();
        System.out.println();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Chức năng: " + chucNang);
        System.out.println();
    }
}
