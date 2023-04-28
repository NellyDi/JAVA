import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

public class task001 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        for (int i = 0; i <= n; i++) {
            num = num + i;
        }
        System.out.println(num);
    }
}
