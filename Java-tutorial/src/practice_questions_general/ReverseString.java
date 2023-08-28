package practice_questions_general;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        String result = "";
        for (int i = name.length()-1;i>=0;i--){
            result += name.charAt(i);
        }
        System.out.println(result);
    }
}
