package practice_questions_general;

import java.util.Scanner;

public class SubOfProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int rem, prod = 1, sum = 0;
        while (num != 0){
            rem = num % 10;
            num/=10;
            prod = prod * rem;
            sum = sum + rem;
        }
        System.out.println(prod);
        System.out.println(sum);
        System.out.print("Subtract product and sum: " + (prod - sum));
    }
}
