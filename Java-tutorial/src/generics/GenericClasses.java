package generics;

public class GenericClasses <T>{
    private int age;
    private T num;

    public void add(int age){
        System.out.println("age");
    }

    public void num(T num){
        this.num = num;
    }

    //generic method
    public static <T> void print(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClasses<Integer> genericClasses = new GenericClasses<>();
        GenericClasses<String> genericClasses1 = new GenericClasses<>();

        genericClasses.num(10);
        genericClasses.num(22);
        genericClasses1.num("25");

        GenericClasses.print("Hello");
        GenericClasses.print(1);
    }
}
