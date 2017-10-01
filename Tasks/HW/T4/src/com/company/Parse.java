package com.company;

public class Parse {
    public static int parse (char numbers[]) {
        int result = 0;
        int rankSize = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            int a = (numbers[i] - 48) * rank(rankSize);
            rankSize--;
            result = result + a;
        }
        return result;
    }
    public static int rank (int b) {
        int a = 1;
        for (int i = 0; i < b; i++) {
            a = a * 10;
        }
        return a;
    }
}
