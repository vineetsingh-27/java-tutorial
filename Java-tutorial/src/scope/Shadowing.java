package scope;

public class Shadowing {
    static int x = 5;
    public static void main(String[] args) {

        int x = 12;
        System.out.println("The value from local " + x);
        fun();
    }

    static void fun(){
        System.out.println("The value from method " + x);
    }
}
