package s2_exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s4 {
    public static void main(String[] args) throws IOException {
        s4_1();
    }

    public static void s4_1() throws IOException {

        // Разработайте программу, которая выбросит Exception, когда пользователь вводит
        // пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите строку");
            String text = getTextFromUser(bufferedReader);
            System.out.println(text);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getTextFromUser(BufferedReader bufferedReader) throws IOException {
        String text = bufferedReader.readLine();

        if (text.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }

        return text;
    }
}
