package task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        boolean validVariant = false;

        System.out.println("Оберіть варіант розв'язання (А, Б або В): ");
        String variant;
        while (true) {
            variant = in.next().toUpperCase();
            if (variant.equals("А") || variant.equals("Б") || variant.equals("В")) {
                validVariant = true;
                break;
            } else {
                System.out.print("Невірний варіант. Виберіть А, Б або В: ");
            }
        }

        switch (variant) {
            case "А":
                System.out.println("Ви обрали варіант А: Цикл з параметром");
                break;
            case "Б":
                System.out.println("Ви обрали варіант Б: Цикл з передумовою");
                break;
            case "В":
                System.out.println("Ви обрали варіант В: Цикл з післяумовою");
                break;
        }

        while (true) {
            try {
                System.out.print("Введіть ціле число x (від 1 до 50): ");
                x = in.nextInt();
                if (x < 1 || x > 50) {
                    System.out.println("Помилка: Значення x вийшло за межі діапазону [1;50].");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Помилка: Введене значення не є цілим числом.");
                in.next();
            }
        }

        int sum = 0;
        int i = x + 1;

        switch (variant) {
            case "А":
                while (i <= 50) {
                    sum += i;
                    i += 2;
                }
                break;
            case "Б":
                do {
                    sum += i;
                    i += 2;
                } while (i <= 50);
                break;
            case "В":
                for (; i <= 50; i += 2) {
                    sum += i;
                }
                break;
        }

        System.out.println("Сума всіх парних чисел у діапазоні [1;50], які є більшими за " + x + ": " + sum);

        in.close(); // Закрити Scanner
    }
}