import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputInteger = Integer.parseInt(reader.readLine());
        System.out.println(getAnswer(inputInteger));
    }
    public static int getAnswer (int input) {
       if (input == 0) {
           return input;
       }
       int result = (input*100)+90+(9-input);
       return result;
    }
}
