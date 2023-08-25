package practise_question_method;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        eligibleForVoting(age);
    }

    static void eligibleForVoting(int age){
        if (age > 18){
            System.out.println("Yes you are eligible for voting");
        }else {
            System.out.println("No you are not eligible for voting");
        }
    }
}
