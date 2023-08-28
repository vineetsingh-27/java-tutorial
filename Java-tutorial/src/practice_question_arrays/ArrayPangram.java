package practice_question_arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayPangram {
    public static void main(String[] args) {
        String sentence = "qwertyopasdfghjkzxcvbnm";

        checkIfPangram(sentence);
        System.out.println(sentence);
    }

    public static boolean checkIfPangram(String sentence) {
        Set set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
