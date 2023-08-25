package functionAndMethod;

public class Scope {
    static int b = 200;
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(a);
        {
            int b = 30;
            System.out.println(b);
           a = 20;
//            System.out.println(a);
            change(b);
        }
//        System.out.println(a);
        change(b);
    }

    static void change(int b){
        System.out.println(b);
    }
}
