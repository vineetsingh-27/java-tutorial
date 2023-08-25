package functionAndMethod;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Vineet";
        greet(name);
        System.out.println(name);
    }

    static void greet(String name){
        name = "Aman";
    }
}

