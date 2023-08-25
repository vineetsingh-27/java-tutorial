package practice_questions_general;

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int occurrence = in.nextInt();
        int count = 0;
        while (num >0){
            int rem = num%10;
            if (rem == occurrence){
                count++;
            }
            num/=10;
        }
        if (count == 0){
            System.out.println("Number not found");
        }else{
            System.out.println(count);
        }
    }
}
