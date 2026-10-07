import java.util.*;
public class Numberofstepstoreducenumbertozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Write your solution here.
        // Print the number of steps to reduce num to zero.
        int steps=0;
        while (num>0){
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
            steps++;
        }
        System.out.println(steps);
    }
}

