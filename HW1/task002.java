import java.util.Scanner;

// Вычислить n! (произведение чисел от 1 до n)

public class task002 {
    public static void main(String[] args) {
        System.out.println("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = num * i;
        }
        System.out.println(num);
    }
}
