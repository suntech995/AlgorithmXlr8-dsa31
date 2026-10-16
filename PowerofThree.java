import java.util.*;

public class PowerofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Write your solution here.
        // Print "true" if n is a power of three, otherwise print "false".
        if(n<=0){
            System.out.println("false");
        }
        else{
            while(n%3==0){
                n=n/3;
            }
            if(n==1){
                System.out.println("true");
            } else{
                System.out.println("false");
            }
        }

    }
}
