package practise_question_method;

import java.util.Scanner;

public class EvenOddMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        EvenOdd(num);
    }

    static void EvenOdd(int num){
        if (num % 2 == 0){
            System.out.print("Even: " + num);
        }else {
            System.out.print("Odd: " + num);
        }
    }
}
