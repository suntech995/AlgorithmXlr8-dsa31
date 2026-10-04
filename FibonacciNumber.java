import java.util.*;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print F(n).
        if (n==0){
            System.out.println(n);
        }
        else if(n==1){
            System.out.println(n);
        }
        else {
            int first=0, second=1;
            for(int i=2;i<=n;i++){
                int next = first +second;
                first=second;
                second=next;
            }
            System.out.println(second);
        }
    }
}
