package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("МЕНЮ" +
                    "\n1. Вычислить площади и периметры фигур" +
                    "\n2. Выйти");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    Foursquare foursquare = new Foursquare(4);
                    Rectangle rectangle = new Rectangle(2, 2);
                    Circle circle = new Circle(6);
                    Triangle triangle = new Triangle(2, 4, 5);
                    Figure figure[] = {foursquare, rectangle, circle, triangle};
                    for (int i = 0; i < figure.length; i++) {
                        figure[i].findPerimeter();
                        figure[i].findSquare();
                    }
                    System.out.println("\n");
                }
                break;
                case 2: {
                    System.exit(0);
                }
            }
        }
    }
}