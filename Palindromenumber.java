import java.util.*;

public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        // Write your solution here.
        // Print "true" if x is a palindrome, otherwise print "false".

        if(x<0){
            System.out.println("false");
        }
        else{
            long original=x;
            long reverse=0;
            while(x>0){
                long digit=x%10;
                reverse=reverse*10+digit;
                x=x/10;
            }
            System.out.println(original==reverse);
        }
    }
}
