package practice_questions_general;

import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        float res = 0;
        while (true){
            int num = sc.nextInt();
            if (num !=0){
                res+=num;
                count++;
            }else {
                break;
            }
        }
        System.out.println(res/count);
    }
}
