import java.util.*;

public class Happynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print "true" if n is a happy number, otherwise print "false".
        Set<Integer> seen= new HashSet<>();
        while(n!=0 && !seen.contains(n)){
            seen.add(n);
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum=sum+(digit*digit);
                n=n/10;
            }
            n=sum;
        }
        System.out.println(n==1);
    }
}
