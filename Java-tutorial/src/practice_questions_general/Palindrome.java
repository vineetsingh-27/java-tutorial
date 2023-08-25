package practice_questions_general;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        String new_word="";

        for (int i = word.length()-1;i>=0;i--){
            new_word += word.charAt(i);
        }
        if (new_word.equals(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
