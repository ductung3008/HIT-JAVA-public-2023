import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Chanh: ");
        int chanh = input.nextInt();
        System.out.print("Táo: ");
        int tao = input.nextInt();
        System.out.print("Lê: ");
        int le = input.nextInt();

        // maxLemon: the maximum number of lemons that can be used
        int maxLemon = Math.min(chanh, Math.min(tao / 2, le / 4));

        int maxFruits = maxLemon * 7;
        System.out.println("Tổng số quả tối đa: " + maxFruits + " (Chanh: " + maxLemon + ", Táo: " + maxLemon * 2 + ", Lê: " + maxLemon * 4 + ")");
    }
}
