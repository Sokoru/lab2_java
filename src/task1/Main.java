package task1;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int x = -1, z = -1;
        double y;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (i != 0) {
            System.out.println("Задано формулу √(lg((1-2x)/(z+3)))");
            System.out.print("Задайте число x: ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            } else {
                System.out.println("Невірно введене число x. Будь ласка, введіть ціле число.");
                scanner.next();
                continue;
            }
            System.out.print("Задайте число z: ");
            if (scanner.hasNextInt()) {
                z = scanner.nextInt();
            } else {
                System.out.println("Невірно введене число z. Будь ласка, введіть ціле число.");
                scanner.next();
                continue;
            }
            if (z <= -3 || (1 - 2 * x) < (z + 3)) {
                System.out.println("Невірно введені числа. Будь ласка, введіть інші (вірні) числа.");
            } else {
                i = 0;
            }
        }
        y =  Math.sqrt(Math.log10((1 - 2 * x) / (z + 3)));
        System.out.printf("Обчислення: %.3f\n", y);
    }
}
