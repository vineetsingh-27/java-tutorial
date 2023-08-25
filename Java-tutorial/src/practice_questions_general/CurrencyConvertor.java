package practice_questions_general;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        int inr = sc.nextInt();

        double usd = inr * 82.105;
        System.out.println("Amount in USD: " + usd);

    }
}
