import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите сумму в рублях");
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

            int value1 = input / 1;
            input = input - value1 * 1;

            System.out.println("Банкомат бы выдал следующее кол-во купюр и монет:" + "/n" + value5000 + "5-тысячных;" + "/n" + value1000 + "1-тысячных;" + "/n" + value500 + "500-рублевых;" + "/n" + value100 + "100-рублевых;" + "/n" + value50 + "50-рублевых;" + "/n" + value10 + "10-рублевых;" + "/n" + value5 + "5-рублевых;" + "/n" + value2 + "2-рублевых;" + "/n" + value1 + "рублевых.");

        }
    }
}