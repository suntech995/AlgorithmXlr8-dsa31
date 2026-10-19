import java.util.*;

public class Uglynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print "true" if n is an ugly number, otherwise print "false".
        if(n<=0){
            System.out.println("false");
        }
        else if(n>0){
            while(n%2==0){
                n=n/2;
            }
            while(n%3==0){
                n=n/3;
            }
            while(n%5==0){
                n=n/5;
            }
            if(n==1){
                System.out.println("true");
            } else{
                System.out.println("false");
            }
        }

    }
}
