package s2_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1 {
    public static void main(String[] args) {
        ex1();

    }

    public static void ex1() {
        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
        // (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить
        // к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float result = getNumberFromUser (bufferedReader);
            bufferedReader.close();
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println("error");
            return;
        }

    }

    public static float getNumberFromUser(BufferedReader bufferedReader) throws IOException {
        System.out.print("Введите число типа float: ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка.Введите число:");
            return getNumberFromUser(bufferedReader);
        }

        return result;
    }

}