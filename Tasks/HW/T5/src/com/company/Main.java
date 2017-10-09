package com.company;
import java.util.Date;
import java.util.Scanner;
// Григорианский в часы
// Массив передач
// В сравнении возвращать номер элемента массива (передачи)
// Сравнение и ретурн в отдельном методе, масси[метод]
public class Main {

    public static void main(String[] args) {
        Date currentDate = new Date();
        String ChannelsList = new String();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Channels.showChannels();
            int ChannelInput = scanner.nextInt();
            switch (ChannelInput) {
                case 1: {
                    Broadcasts.Broadcasts1();
                }
                break;
                case 2: {
                    Broadcasts.Broadcasts2();
                }
                break;
            }
        }
    }
}
