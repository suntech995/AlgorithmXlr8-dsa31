import java.util.*;

public class Chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();

        // Write your solution here.
        // Print "White" or "Black".
        char column = coordinates.charAt(0);
        int row = coordinates.charAt(1) - '0';
        int columnNumber = column - 'a' + 1;
        if((columnNumber+row)%2==0){
            System.out.println("Black");
        } else {
            System.out.println("White");
        }

    }
}
