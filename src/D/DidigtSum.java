package D;
import java.util.Scanner;
public class DidigtSum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n > 9){
            int sum = 0;
            while(n != 0){
                int digit = n%10;
                sum = sum+digit;
                n = n/10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
