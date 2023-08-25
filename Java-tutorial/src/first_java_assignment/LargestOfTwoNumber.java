package first_java_assignment;

import java.util.Scanner;

public class LargestOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        if (num1>num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
