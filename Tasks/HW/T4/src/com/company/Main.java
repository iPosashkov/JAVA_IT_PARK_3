package com.company;
import java.util.Scanner;
import static com.company.Parse.parse;
public class Main {

    public static void main(String[] args) {
        char ArrNum[] = {'1', '2', '3', '4'};
	int ArrNumAsInt = parse(ArrNum);
	System.out.println(ArrNumAsInt);
    }
}
