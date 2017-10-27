package ru.itpark;
import java.util.Scanner;
public class ArrayList {
    private static final int MAX_SIZE = 10;
    private Figure figures[];
    private int count;
    Scanner scanner = new Scanner(System.in);

    public ArrayList() {
        this.figures = new Figure[MAX_SIZE];
        this.count = 0;
    }

    public ArrayList add(Figure figure) {
        if (count < MAX_SIZE) {
            figures[count] = figure;
            count++;
        } else {
            System.err.println("Нет места");
        }
        return this;
    }
    public int find (Object object) {
        for (int i = 0; i < figures.length; i++) {
            String input = scanner.nextLine();
            if (input == Triangle.class.getName()) {
                object = figures[i];
            } else {
                System.out.println("Такого объекта нет");
            }
        }
    }
}