package first_java_assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        System.out.println("Enter the operator: ");
//        char operator = in.next().charAt(0);
        String operator = in.next();

        if (operator.equals("+")){
            int result = num1+num2;
            System.out.println(result);
        }
        else if (operator.equals("-")){
            int result = num1-num2;
            System.out.println(result);
        }
    }
}
