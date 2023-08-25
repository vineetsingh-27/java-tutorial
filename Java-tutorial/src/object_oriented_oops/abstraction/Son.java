package object_oriented_oops.abstraction;

public class Son extends Parent{
    public Son(int age) {
        super(age);
        System.out.println("Son age " + age);
    }

    @Override
    void run() {
        System.out.println("I am running from son");
    }

    @Override
    void normal() {
        super.normal();
    }
}
