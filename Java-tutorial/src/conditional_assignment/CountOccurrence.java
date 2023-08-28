package conditional_assignment;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the number: ");
        long num = in.nextLong();

        System.out.println("Check for occurrence: ");
        int occurrence = in.nextInt();

        while (num>0){
            long rem = num % 10;
            if (rem == occurrence){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
