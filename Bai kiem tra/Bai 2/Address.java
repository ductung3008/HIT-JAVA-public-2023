import java.util.Scanner;

public class Address {
    private String city;
    private String district;

    public Address() {}

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập thông tin về địa chỉ:");
        System.out.print("Nhập tỉnh/thành phố: ");
        city = input.nextLine();
        System.out.print("Nhập huyện: ");
        district = input.nextLine();
    }

    public void output() {
        System.out.printf("%-15s %-15s", city, district);
    }
}
