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

		System.out.println("Longest number is; Самое длинное число " + longestInteger);
		System.out.println("Shortest number is; Самое короткое число " + shortestInteger);

		bubbleSort(numbers);
		System.out.println(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);

	}

	public static void bubbleSort(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size() - 1 - i; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}
		}
	}

}
