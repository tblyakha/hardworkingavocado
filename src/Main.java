import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        int negativeCount = 0;
        int passiveCount = 0;
        int zero = 0;

        int[] arr = new int[n];

        System.out.println("Введите числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeCount += 1;
            } else if (arr[i] > 0) {
                passiveCount += 1;
            }
            else {
                zero+=1;
            }
        }

        System.out.println("Кол-во элементов меньше нуля равно: " + negativeCount);
        System.out.println("Кол-во элементов больше нуля равно: " + passiveCount);
        System.out.println("Кол-во нулей: " + zero);
    }
}