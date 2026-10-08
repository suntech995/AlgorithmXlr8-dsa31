import java.util.*;

public class Adddigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        // Write your solution here.
        // Print the single-digit result of repeatedly summing num's digits.
        while(num >= 10){
            long sum=0;
            while(num>0){
                long digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            num=sum;
        }
        System.out.println(num);
    }
}
