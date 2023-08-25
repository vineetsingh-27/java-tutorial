package practice_questions_general;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle amount: ");
        int principle = sc.nextInt();

        System.out.println("Enter time: ");
        int time = sc.nextInt();

        System.out.println("Enter rate of interest: ");
        float rate = sc.nextFloat();

        float simpleInterest = principle * time * rate;
        System.out.println("Simple Interest is: " + simpleInterest);

    }
}
