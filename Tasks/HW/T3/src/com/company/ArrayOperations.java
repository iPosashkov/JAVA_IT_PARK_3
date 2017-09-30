package com.company;

import java.util.Scanner;
public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int arraySize = scanner.nextInt();
        System.out.println("Введите значения элементов массива через пробел:");
        int array[] = new int[arraySize];
        int sumEven = 0; // сумма четных значений
        int sumOdd = 0; // сумма нечетных значений
        int sumEvenPos = 0; // сумма элементов на четных позициях
        int sumOddPos = 0; // сумма элеменов на нечетных позициях
        int sumLocalMax = 0; // сумма локальных максимумов
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[i + 1] * (-1);
            }
        }
            System.out.printf("Сумма четных элементов = %d \nСумма нечетных элементов = %d \nСумма элементов, стоящих на четной позиции = %d \nСумма элементов, стояших на нечетной позиции = %d \nКоличество локальных максимумов = %d\n", sumEven, sumOdd, sumEvenPos, sumOddPos, sumLocalMax);
            System.out.print("Массив с заменой нуля: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }