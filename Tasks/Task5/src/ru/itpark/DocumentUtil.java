package ru.itpark;

public class DocumentUtil {
    static int count = 0;

    public static void ShowDoc(String document[]) {
        for (int i = 0; i < document.length; i++) {
            // тернарный условный оператор e ? a : b
            String lineToOut = document[i] == null ? "_______" : document[i];
            System.out.println(i + ": " + lineToOut);
        }
    }
    public static void toBegin (String document [])
}