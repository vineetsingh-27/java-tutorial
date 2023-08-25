import java.util.ArrayList;

class Example {
    public static void main(String[] args) {
        String name = "ababa";
        String new_name = "";
        for (int i = name.length()-1; i >= 0; i--) {
            new_name+=name.charAt(i);
        }

        if (new_name.equals(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}