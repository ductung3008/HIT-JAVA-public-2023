import java.util.Scanner;

public class Book {
    public static int idCount = 1;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    Scanner input = new Scanner(System.in);

    public Book(){
        id = idCount++;
    }

    public Book(String name, String author, String publisher, int year) {
        id = idCount++;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void insert() {
        System.out.print("Nhập tên sách: ");
        setName(input.nextLine());
        System.out.print("Nhập tên tác giả: ");
        setAuthor(input.nextLine());
        System.out.print("Nhập tên nhà xuất bản: ");
        setPublisher(input.nextLine());
        int tempYear;
        do {
            System.out.print("Nhập năm sản xuất: ");
            tempYear = input.nextInt();
            if (tempYear <= 0) {
                System.out.println("Năm sản xuất không thể âm. Vui lòng nhập lại!");
            }
        }
        while (tempYear <= 0);
        setYear(tempYear);
    }

    public void display() {
        if (id == 1) System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
        System.out.printf("%03d%-7s%-20s%-20s%-20s%-20s\n", id, "", name, author, publisher, year);
    }
}
