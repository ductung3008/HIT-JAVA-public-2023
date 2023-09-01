import java.util.Scanner;

public class Date {
    private int year;
    private Byte month;
    private Byte day;

    public Date() {}

    public Date(int year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }

    public Boolean isValid() {
        Byte checkDay;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> checkDay = 31;
            case 4, 6, 9, 11 -> checkDay = 30;
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    checkDay = 29;
                } else {
                    checkDay = 28;
                }
            }
            default -> {
                checkDay = -1;
                break;
            }
        }
        return day <= checkDay;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập ngày: ");
            day = input.nextByte();
            System.out.print("Nhập tháng: ");
            month = input.nextByte();
            System.out.print("Nhập năm: ");
            year = input.nextInt();
            if (!isValid()) {
                System.out.println("Ngày tháng năm không hợp lệ. Vui lòng nhập lại!");
            }
        }
        while (!isValid());
    }

    public void output() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
