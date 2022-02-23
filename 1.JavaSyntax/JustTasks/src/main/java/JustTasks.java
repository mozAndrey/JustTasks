import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JustTasks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getSum(Integer.parseInt(reader.readLine())));

    }
    public static int getSum (int a) {
        int result = 0;
        if (a > 0) {
            for (int i = 0; i <= a; i++) {
                result += i;
            }
        } else {
            for (int i = a; i <= 1; i++) {
                result -= i;

            }
        }
        return result;
    }
}
