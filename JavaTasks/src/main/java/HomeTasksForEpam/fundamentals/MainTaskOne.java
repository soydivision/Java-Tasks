package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTaskOne {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter your name, please");
		System.out.println("Введите свое имя пожалуйста");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userName = reader.readLine();		
		System.out.println("Welcome, " + userName + "!");
		System.out.println("Добро пожаловать, " + userName + "!");
	}

}
