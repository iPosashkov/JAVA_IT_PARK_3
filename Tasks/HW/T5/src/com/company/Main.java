package com.company;
import java.util.Date;
import java.util.Scanner;

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
