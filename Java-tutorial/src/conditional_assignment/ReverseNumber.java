package conditional_assignment;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int rev = 0;

        while (num>0){
            int rem = num%10;
            num /= 10;
            rev = rev *10+rem;
        }
        System.out.println(rev);
    }
}
