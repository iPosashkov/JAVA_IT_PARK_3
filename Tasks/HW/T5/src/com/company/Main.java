package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        TV tv = TV.getInstance();
        Channel channel[] = new Channel[2];
        Program programTV1[] = new Program[2];
        Program programTV2[] = new Program[2];

        Program programTV1_1 = new Program("Доброе утро", 1, 8);
        Program programTV1_2 = new Program("Новости", 8, 23);
        Program programTV2_1 = new Program("Утро России", 1, 8);
        Program programTV2_2 = new Program("Вести", 8, 23);

        programTV1[0] = programTV1_1;
        programTV1[1] = programTV1_2;
        programTV2[0] = programTV2_1;
        programTV2[1] = programTV2_2;

        Channel channel1 = new Channel("0. Первый", programTV1);
        Channel channel2 = new Channel("1. Россия", programTV2);

        channel[0] = channel1;
        channel[1] = channel2;

        while (true) {
            System.out.println("СПИСОК КАНАЛОВ");
            tv.showChannel(channel);
            System.out.println("\nКакой канал включить?");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            tv.detectChannel(channel, input);
        }
    }
}