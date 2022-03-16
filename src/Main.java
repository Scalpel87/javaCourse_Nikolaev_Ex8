import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Введите строку");
            String s = reader.readLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    reader.close();
                    throw new MyExeption("Введена цифра: " + Character.toString(c));
                }
                if (i >= 2 && s.charAt(i) == s.charAt(i-1) && s.charAt(i-2) == s.charAt(i-1)) {
                    reader.close();
                    throw new MyExeption("Введено 3 одинаковых символа подряд: " + s.substring(i-2, i+1));
                }
            }
        } while (true);
    }
}
