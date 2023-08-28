package practice_questions_general;

import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to find the sum: ");
        int num = sc.nextInt();
        int res = 0;
        for (int i = 1; i<=num; i++){
            res+=i;
        }
        System.out.println("Sum of first "+ num + " number is " + res);
    }
}
