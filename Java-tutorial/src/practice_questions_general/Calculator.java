package practice_questions_general;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter any one operator [+,-,*,/]");
        char op = sc.next().charAt(0);

        if (op == '+'){
            int result = num1 + num2;
            System.out.println(result);
        } else if (op == '-') {
            int result = num1 - num2;
            System.out.println(result);
        } else if (op =='*') {
            int result = num1 * num2;
            System.out.println(result);
        } else if (op =='/') {
            int result = num1 / num2;
            System.out.println(result);
        }else {
            System.out.println("Incorrect operator");
        }
    }
}
