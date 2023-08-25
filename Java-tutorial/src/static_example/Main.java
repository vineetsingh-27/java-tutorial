package static_example;

public class Main {
    public static void main(String[] args) {
        //greet();
        //We cannot use this because it requires object to access.

//      here we provide object to access greet()
        Main main = new Main();
//        main.greet();
        main.fun();
    }

    // We know that when something is not static, belongs to object
    void greet(){
        System.out.println("Hello");
    }

    void fun(){
        greet();;
    }
}
