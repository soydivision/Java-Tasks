package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.ArrayList;

public class MainTaskThree {
    public static void main(String args[]) throws IOException {
        int upperBound = Integer.MAX_VALUE;
        System.out.println(
                "Верхняя граница случайных чисел по умолчанию , Default random numbers upper bound: " + upperBound);
        System.out.println("Введите количество случайных чисел для генерации");
        System.out.println("Enter a number of numbers to be generated");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfRandomIntegers = Integer.parseInt(reader.readLine());
        ArrayList<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfRandomIntegers; i++) {
            int integerRandom = random.nextInt(upperBound);
            randomIntegers.add(integerRandom);
        }
        System.out.println("Вывод с переходом на новую строку, New line output");
        for (int i = 0; i < numberOfRandomIntegers; i++) {
            System.out.println(randomIntegers.get(i));
        }
        System.out.println("Вывод без перехода на новую строку, One line output");
        System.out.println(randomIntegers);
    }
}
