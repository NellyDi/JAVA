// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и 
// на себя без остатка)
public class task003 {
    public static void main(String[] args) {
        
        for (int i = 1; i < 1000; i++) {
            if (i%2 != 0 && i%3 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
