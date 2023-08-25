package practise_question_method;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        int ans = sumOfTwoNumber(a,b);
        System.out.println(ans);
    }

    static int sumOfTwoNumber(int a, int b){
        return a+b;
    }
}
