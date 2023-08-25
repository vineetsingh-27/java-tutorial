package conditional_assignment;

import java.util.Scanner;

public class CharacterUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char input = in.next().charAt(0);
        if (input >= 'a' && input<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
