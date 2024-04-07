package task4;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double a = -Math.PI / 2, b = -3 * Math.PI / 2, dx = Math.PI / 10;
        double x, y;
        System.out.println("****************");
        System.out.println("  X\t  Y");
        System.out.println("****************");
        for (x = a; x >= b; x -= dx) {
            y = Math.pow(x, 2) * Math.cos(x);
            System.out.printf("%.2f\t%.2f\n", x, y);
        }
    }
}
