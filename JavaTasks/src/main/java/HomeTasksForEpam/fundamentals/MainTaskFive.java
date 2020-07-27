package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTaskFive {
    public static void main(String[] args) throws IOException {
        System.out.println("Введит номер месяца, Enter a month number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfMonth = Integer.parseInt(reader.readLine());
        if ((numberOfMonth > 12) || (numberOfMonth < 0)) {
            System.out.println("Введен некорректный номер месяц. Invalid input");
        } else {
            String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};
            System.out.println(months[numberOfMonth - 1]);
        }
    }
}
