public class Main {
    public static void main(String[] args) {
        Book[] b = new Book[5];
        for (int i = 0; i < 5; i++) {
            b[i] = new Book();
            b[i].insert();
        }
        for (int i = 0; i < 5; i++) {
            b[i].display();
        }
    }
}