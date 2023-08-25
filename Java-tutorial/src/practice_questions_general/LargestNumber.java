package practice_questions_general;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int result = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            if (num == 0){
                break;
            }
            if (num > result){
                result = num;
            }
        }
        System.out.println(result);
    }
}
