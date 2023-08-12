import java.util.Scanner;

public class Bonus {
        public static String formatName(String name) {
        String fName = name.trim().toLowerCase();
        String[] words = fName.split(" ");
        fName = "";
        for (String word : words) {
            if (word.equals("")) {
                continue;
            }
            word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            fName = fName.concat(word).concat(" ");
        }
        return fName.trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = input.nextLine();
        name = formatName(name);
        System.out.println(name);
    }
}
