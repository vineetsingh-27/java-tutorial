package object_oriented_oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.run();

        Daughter d = new Daughter(23);
        d.run();

        Parent.dance();

    }
}
