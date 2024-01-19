import java.util.Scanner;

public class Auto {
    private String brand;
    private String model;
    private int typeTrans;
    private String gosNumber;

    public Auto() {
        brand = "Не указано";
        model = "Не указано";
        typeTrans = 0;
        gosNumber = "Не указано";
    }

    public Auto(String brand, String model, int typeTrans, String gosNumber) {
        this.brand = brand;
        this.model = model;
        this.typeTrans = typeTrans;
        this.gosNumber = gosNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getTypeTrans() {
        return typeTrans;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных авто");
        System.out.print("Введите марку машины: ");
        brand = scanner.nextLine();
        System.out.print("Введите модель машины: ");
        model = scanner.nextLine();
        System.out.print("Введите тип трансмиссии(1-механика, 2-автомат): ");
        typeTrans = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Введите гос. номер: ");
        gosNumber = scanner.nextLine();
    }
}