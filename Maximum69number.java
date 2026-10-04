import java.util.*;

public class Maximum69number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        // Write your solution here.
        // Print the maximum number after changing at most one digit 6 to 9.
        char[] digits=num.toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        System.out.println(new String(digits));
    }
}
