package object_oriented_oops.access_control;

public class A {
    private int age = 10;
    private String name = "Vineet";
    public int salary = 20000;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        A a = new A();

        /**
         * Private variable can be used only in these file only
         * if we want to access these data member from another class
         * then we have to declare public getter and setter methods
         **/
        System.out.println(a.age);
    }
}
