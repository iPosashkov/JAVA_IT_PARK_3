import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Введите сумму в рублях:");
        int input = scanner.nextInt();
        if (input <= 0) {
            System.out.println("Введите положительное число");
        } else {
            int value5000 = input / 5000;
            input = input - value5000 * 5000;

            int value1000 = input / 1000;
            input = input - value1000 * 1000;

            int value500 = input / 500;
            input = input - value500 * 500;

            int value100 = input / 100;
            input = input - value100 * 100;

            int value50 = input / 50;
            input = input - value50 * 50;

            int value10 = input / 10;
            input = input - value10 * 10;

            int value5 = input / 5;
            input = input - value5 * 5;

            int value2 = input / 2;
            input = input - value2 * 2;

            int value1 = input;
            input = input - value1;

            System.out.printf("Банкомат бы выдал следующее кол-во купюр и монет: \n%d по 5000; \n%d по 1000; \n%d по 500; \n%d по 100; \n%d по 50; \n%d по 10; \n%d по 5; \n%d по 2; \n%d по 1.", value5000, value1000, value500, value100, value50, value10, value5, value2, value1);

        }
    }
}