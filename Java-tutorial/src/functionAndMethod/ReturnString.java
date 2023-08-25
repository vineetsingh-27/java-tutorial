package functionAndMethod;

public class ReturnString {
    public static void main(String[] args) {
        String chacha ="Vineet";
        getName(chacha);
        System.out.println(chacha);
    }

    static void getName(String name){

/**
 * String cannot be changed because it is declared final and due security reasons.
 * */
//        System.out.println(name);
        name = "Aman";
    }
}
