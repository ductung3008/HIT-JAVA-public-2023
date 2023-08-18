public class Main {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        hcn.nhap();
        System.out.println("Diện tích hình chữ nhật: " + hcn.dienTich());
        System.out.println("Chu vi hình chữ nhật: " + hcn.chuVi());
        hcn.veHCN();
    }
}
