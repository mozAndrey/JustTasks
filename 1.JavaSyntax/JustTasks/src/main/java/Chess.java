import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chess = reader.readLine();
        String turn = chess.toUpperCase();
        System.out.println(checkChess(turn));
    }

    public static String checkChess(String chess) {
        String[] array = chess.split("-");
        char[] startOfTurn = array[0].toCharArray();
        char[] endOfTurn = array[1].toCharArray();
        if (endOfTurn[0] == startOfTurn[0] + 1 || endOfTurn[0] == startOfTurn[0] - 1) {
            if (endOfTurn[1] == startOfTurn[1] + 2 || endOfTurn[1] == startOfTurn[1] + 2) {
                return "YES";
            }
        }
        if (endOfTurn[0] == startOfTurn[0] + 2 || endOfTurn[0] == startOfTurn[0] - 2) {
            if (endOfTurn[1] == startOfTurn[1] + 1 || endOfTurn[1] == startOfTurn[1] + 1) {
                return "YES";
            }
        }
        if (endOfTurn[0] != startOfTurn[0] + 2 || endOfTurn[0] != startOfTurn[0] - 2) {
            if (endOfTurn[1] != startOfTurn[1] + 1 || endOfTurn[1] != startOfTurn[1] + 1) {
                return "NO";
            }
        }
        if (endOfTurn[0] != startOfTurn[0] + 1 || endOfTurn[0] != startOfTurn[0] - 1) {
            if (endOfTurn[1] != startOfTurn[1] + 2 || endOfTurn[1] != startOfTurn[1] + 2) {
                return "NO";
            }
        }
        return "ERROR";
    }
}