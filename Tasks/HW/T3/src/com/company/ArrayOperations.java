package com.company;

import java.util.Scanner;
public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int arraySize = scanner.nextInt();
        System.out.println("Введите значения элементов массива через пробел:");
        int array[] = new int[arraySize];
        int sumEven = 0;
        int sumOdd = 0;
        int sumEvenPos = 0;
        int sumOddPos = 0;
        int sumLocalMax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) % 2 == 0) {
                sumEven = sumEven + array[i];
            } else {
                sumOdd = sumOdd + array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEvenPos = sumEvenPos + array[i];
            } else {
                sumOddPos = sumOddPos + array[i];
            }
        }
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                sumLocalMax++;
            }
        }
        System.out.printf("Сумма четных элементов = %d \nСумма нечетных элементов = %d \nСумма элементов, стоящих на четной позиции = %d \nСумма элементов, стояших на нечетной позиции = %d \nКоличество локальных максимумов = %d", sumEven, sumOdd, sumEvenPos, sumOddPos, sumLocalMax);
    }
}
