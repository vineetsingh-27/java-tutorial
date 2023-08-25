package data_structures.linear_search;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        String sentence = "Hello";
        char target = 'e';

        System.out.println(searchInString(sentence,target));
    }

    public static boolean searchInString(String sentence, char target){
        if (sentence.length() == 0){
            return false;
        }

//        for (int i = 0; i < sentence.length(); i++) {
//            if (target == sentence.charAt(i)){
//                return true;
//            }
//        }

        for (char ch : sentence.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
