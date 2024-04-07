package task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            System.out.print("Введіть натуральне число x: ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x < 0) {
                    System.out.println("Помилка: Значення x не є натуральним.");
                } else {
                    break;
                }
            } else {
                System.out.println("Помилка: Введене значення не є цілим числом.");
                scanner.next();
            }
        }
        // Ініціалізуємо змінну для зберігання суми
        double sum = 0.0;
        // Вкладені цикли для обчислення суми
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                sum += (i + j) / (double) x;
            }
        }
        System.out.println("Сума рівна: " + sum);
        scanner.close();
    }
}
