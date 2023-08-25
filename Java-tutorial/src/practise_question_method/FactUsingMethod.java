package practise_question_method;

import java.util.Scanner;

public class FactUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        factorial(number);
    }

    static void factorial(int num){
        for (int i = 1;i<=num;i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
