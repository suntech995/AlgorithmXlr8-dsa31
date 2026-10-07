import java.util.*;

public class Poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Write your solution here.
        // Print "true" if n is a power of two, otherwise print "false".

        if(n<=0){
            System.out.println("false");
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
