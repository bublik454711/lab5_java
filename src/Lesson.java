import java.util.Scanner;

public class Lesson {
    private Client client;
    private Instructor instructor;
    private String date;
    private String time;
    private int paymentStatus;

    public Lesson() {
        client = new Client();
        instructor = new Instructor();
        date = "Не указано";
        time = "Не указано";
        paymentStatus = 0;
    }

    public Lesson(Client client, Instructor instructor, String date, String time, int paymentStatus) {
        this.client = client;
        this.instructor = instructor;
        this.date = date;
        this.time = time;
        this.paymentStatus = paymentStatus;
    }

    public Client getClient() {
        return client;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных об уроке");
        client.input();
        instructor.input();
        System.out.print("Введите дату: ");
        date = scanner.nextLine();
        System.out.print("Введите время: ");
        time = scanner.nextLine();
        System.out.print("Введите статус оплаты(1-оплачено, 2-не оплачено): ");
        paymentStatus = scanner.nextInt();
        if (checkArguments(client, instructor, date, time, paymentStatus)) {
            this.client = client;
            this.instructor = instructor;
            this.date = date;
            this.time = time;
            this.paymentStatus = paymentStatus;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public void print() {
        System.out.println("\tИнформация об уроке");
        System.out.println("Дата: " + date + "\tВремя: " + time + "\tСтатус оплаты(1-оплачено, 2-не оплачено): " + paymentStatus + "\n");
    }

    private boolean checkArguments(Client client, Instructor instructor, String date, String time, int paymentStatus) {
        return paymentStatus > 0 && paymentStatus < 3;
    }


}
