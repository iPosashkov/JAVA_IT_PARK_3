package ru.itpark;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array []=new int[arraySize];
        int min = array[0];
        for (int = 2; i < array.length; i++){
            if array [i] < min {
                min = array [i]
            }
        }
System.out.println(min);
    }
}