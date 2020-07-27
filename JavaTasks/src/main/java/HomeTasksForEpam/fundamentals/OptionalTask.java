package fundamentals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите n,Enter n.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введите n чисел,Enter n numbers.");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("");
        int longestInteger = numbers.get(0);
        int shortestInteger = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String string = Integer.toString(Math.abs(numbers.get(i)));
            if (string.length() > Integer.toString(Math.abs(longestInteger)).length()) {
                longestInteger = numbers.get(i);
            }
            if (string.length() < Integer.toString(Math.abs(shortestInteger)).length()) {
                shortestInteger = numbers.get(i);
            }
        }
        System.out.println("Longest number is, Самое длинное число " + longestInteger);
        System.out.println("Shortest number is, Самое короткое число " + shortestInteger);
        bubbleSortByLength(numbers);
        System.out.println("Elements sorted by ascending length order, Элементы по возрастанию длины:");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("Elements sorted by descending length order, Элементы по убыванию длины:");
        System.out.println(numbers);
    }

    public static void bubbleSortByLength(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                int jIntegerLength = Integer.toString(Math.abs(array.get(j))).length();
                int jIntegerPlusOneLength = Integer.toString(Math.abs(array.get(j + 1))).length();
                if (jIntegerLength > jIntegerPlusOneLength) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }
}
