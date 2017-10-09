package com.company;
import java.util.Date;

public class Broadcasts {
    public static void Broadcasts1(String... args) {
        int timeCurrent = 22;
        BroadcastsPro first = new BroadcastsPro("'Давай поженимся'", 1, 3);
        BroadcastsPro second = new BroadcastsPro("программа'Время'", 21, 23);
        if (timeCurrent > second.timeBegin && timeCurrent < second.timeEnd) {
            System.out.println("Сейчас идёт: " + second.title + " (с " + second.timeBegin + " до " + second.timeEnd + ")");
        }
    }
    public static void Broadcasts2(String... args) {
        int timeCurrent = 22;
        BroadcastsPro first = new BroadcastsPro("Давай поженимся", 1, 3);
        BroadcastsPro second = new BroadcastsPro("к/ф 'Любовь и голуби'", 21, 23);
        if (timeCurrent > second.timeBegin && timeCurrent < second.timeEnd) {
            System.out.println("Сейчас идёт: " + second.title + " (с " + second.timeBegin + " до " + second.timeEnd + ")");
        }
    }
}
