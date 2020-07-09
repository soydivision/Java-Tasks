package fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class MainTaskTwo {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = reader.readLine();

		inputString = inputString.trim().replaceAll(" +", " ");

		String arguments[] = inputString.split("\\s+");

		for (int i = 0; i < arguments.length; i++) {
			System.out.print(arguments[arguments.length - i - 1] + " ");
		}

	}

}
