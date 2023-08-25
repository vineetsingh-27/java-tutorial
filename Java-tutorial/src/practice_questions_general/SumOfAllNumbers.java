package practice_questions_general;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
       while (true){
           System.out.print("Enter number:");
           int num = sc.nextInt();

           if (num == 0){
               break;
           }
           result = result + num;
       }
        System.out.println(result);
    }
}