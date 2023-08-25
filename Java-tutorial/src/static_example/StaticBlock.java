package static_example;

public class StaticBlock {
    static int a = 5;
    static int b;

    //It is called only once when class is loaded in memory for the first time
    static {
        System.out.println("I am inside the static block");
    }

    public static void main(String[] args) {
//        System.out.println(StaticBlock.a);
//        System.out.println(StaticBlock.b = 5);

    }
}
