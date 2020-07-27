package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTaskFour {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите числа для расчета суммы и произведения, Input numbers for summ and multiplication");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        inputString = inputString.trim().replaceAll(" +", " ");
        String numbers[] = inputString.split("\\s+");
        int resultOfSum = 0;
        int resultOfMultiplication = 1;
        for (String number : numbers) {
            Integer integer = Integer.parseInt(number);
            resultOfSum += integer;
            resultOfMultiplication *= integer;
        }
        System.out.println("Сумма, Summ: " + resultOfSum);
        System.out.print("Произведение, Multiplication: " + resultOfMultiplication);
    }
}
