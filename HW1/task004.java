import java.util.Scanner;

public class task004 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int n = scanner.nextInt();
        System.out.println("Выберите требуемую операцию: \n(1 - сложение \n 2 - вычитание \n 3 - умножение \n 4 - деление)");
        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println(m + n);
        }
        if (operation == 2) {
            System.out.println(m - n);
        }
        if (operation == 3) {
            System.out.println(m * n);
        }
        if (operation == 4) {
            System.out.println(m / n);
        }
    }
    
}
