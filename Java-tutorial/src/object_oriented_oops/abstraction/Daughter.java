package object_oriented_oops.abstraction;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
        System.out.println("Daughter age " + age);
    }

    @Override
    void run() {
        System.out.println("I am running from daughter");
    }
}
