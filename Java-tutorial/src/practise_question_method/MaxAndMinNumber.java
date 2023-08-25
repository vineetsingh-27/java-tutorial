package practise_question_method;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Enter number 3: ");
        int c = sc.nextInt();

        maxNum(a,b,c);
        minNum(a,b,c);
    }


    static void maxNum(int a, int b, int c){
        if (a>b && a>c){
            System.out.println("a is greater : " + a);
        } else if (b>c) {
            System.out.println("b is greater : " + b);
        }else {
            System.out.println("c is greater: " + c);
        }
    }

    static void minNum(int a, int b, int c){
        if (a<b && a<c){
            System.out.println("a is smaller : " + a);
        } else if (b<c) {
            System.out.println("b is smaller : " + b);
        }else {
            System.out.println("c is smaller: " + c);
        }
    }
}
