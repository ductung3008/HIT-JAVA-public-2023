public class Main {
    public static void main(String[] args) {
        SinhVien[] sv = new SinhVien[5];
        for (int i = 0; i < 5; i++) {
            sv[i] = new SinhVien();
            sv[i].nhap();
        }
        System.out.println("Thông tin các sinh viên:");
        System.out.printf("%-15s%-30s%-10s%-10s%-10s\n", "Mã sinh viên", "Họ tên", "Điểm toán", "Điểm lý", "Điểm hóa");
        for (int i = 0; i < 5; i++) {
            sv[i].xuat();
        }
    }
}
