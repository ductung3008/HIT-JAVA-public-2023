import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng hàng hóa điện tử/hàng hóa gia dụng: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Số lượng không thỏa mãn. Vui lòng nhập lại!");
            }
        }
        while (n <= 0);

        ArrayList<HangHoaDienTu> hhdt = new ArrayList<HangHoaDienTu>();
        for (int i = 0; i < n; i++) {
            System.out.println("Hàng hóa điện tử thứ " + (i+1));
            HangHoaDienTu hh = new HangHoaDienTu();
            hh.input();
            hhdt.add(hh);
        }

        ArrayList<HangHoaGiaDung> hhgd = new ArrayList<HangHoaGiaDung>();
        for (int i = 0; i < n; i++) {
            System.out.println("Hàng hóa gia dụng thứ " + (i+1));
            HangHoaGiaDung hh = new HangHoaGiaDung();
            hh.input();
            hhgd.add(hh);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hàng hóa điện tử thứ " + (i+1));
            hhdt.get(i).output();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hàng hóa gia dụng thứ " + (i+1));
            hhgd.get(i).output();
        }
    }
}
