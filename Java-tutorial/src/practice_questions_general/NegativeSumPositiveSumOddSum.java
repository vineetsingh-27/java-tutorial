package practice_questions_general;

import java.util.Scanner;

public class NegativeSumPositiveSumOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negativeRes = 0, positiveRes = 0, OddSum = 0;

        while (true){
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num<0){
                negativeRes += num;
            } else if (num>0) {
                positiveRes +=num;
            } else if (num % 2 != 0) {
                OddSum += num;
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Negative result: "+negativeRes);
        System.out.println("Positive result: " + positiveRes);
        System.out.println("Odd Sum: " + OddSum);
    }
}
