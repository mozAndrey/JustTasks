import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chess = reader.readLine();
        System.out.println(checkChess(chess));
    }

    public static String checkChess(String chess) {
        String[] array = chess.split("-");
        char[] arrayOfChars = array[0].toCharArray();
        char[] arrayOfChars2 = array[1].toCharArray();
        String yes = "yes";
        if (arrayOfChars[0] < arrayOfChars2[0]+1 || arrayOfChars[0] > arrayOfChars2[0]-1) {
            if (arrayOfChars[1] < arrayOfChars2[1]+2 || arrayOfChars[1] > arrayOfChars2[1]-2) {
                return yes;
            } else if (arrayOfChars[0] < arrayOfChars2[0]+2 || arrayOfChars[0] > arrayOfChars2[0]-2) {
                if (arrayOfChars[1] < arrayOfChars2[1]+1 || arrayOfChars[1] > arrayOfChars2[1]+1) {
                    return yes;
                }
            }
        }
        return "Error";
    }
}
