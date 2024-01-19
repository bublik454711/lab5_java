import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Пример работы с исключениями
        try {
            ID id = new ID(7454, -963464); // Пытаемся создать паспорт с отрицательным номером
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Пример работы с одномерными и двумерными массивами
        Scanner scanner = new Scanner(System.in);
        Client[] cl = new Client[4];
        int val;
        for (int i = 0; i < 4; i++) {
            cl[i] = new Client();
            System.out.print("Введите кол-во занятий: ");
            val = scanner.nextInt();
            cl[i].setTotalLess(val);
            cl[i].print();
        }
        Lesson[][] lessons = new Lesson[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                lessons[i][j] = new Lesson();
                lessons[i][j].print();
            }
    }
}