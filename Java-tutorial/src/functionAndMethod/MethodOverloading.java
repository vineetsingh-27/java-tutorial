package functionAndMethod;

public class MethodOverloading {

    public static void main(String[] args) {
        fun(10,20);
        fun(10,20,30);
    }

    /**
     * Method overloading
     * Same method name with different parameter
     * It checks which method to run at compile time only.
     * Therefore, it is known as compile time polymorphism.
     **/
    static void fun(int a, int b){
        System.out.println(a+b);
    }

    static void fun(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
